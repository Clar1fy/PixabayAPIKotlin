package com.timplifier.pixabayapi.di

import com.timplifier.pixabayapi.common.constants.Constants
import com.timplifier.pixabayapi.data.remote.apis.PixabayApi
import com.timplifier.pixabayapi.data.remote.apis.RapidApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    @Provides
    fun provideRetrofitPixabayApiService(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_PIXABAY_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(provideOkHttpClient(provideLoggingInterceptor()))
            .build()

    }


    @Singleton
    @Provides
    fun provideRetrofitRapidApiService(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_RAPID_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(provideOkHttpClient(provideLoggingInterceptor()))
            .build()

    }

    @Singleton
    @Provides
    fun provideOkHttpClient(interceptor: Interceptor): OkHttpClient {
        return OkHttpClient().newBuilder()
            .connectTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .addInterceptor(interceptor)
            .build()
    }

    @Singleton
    @Provides
    fun provideLoggingInterceptor(): HttpLoggingInterceptor {
        return HttpLoggingInterceptor()
            .setLevel(HttpLoggingInterceptor.Level.BODY)
    }

    @Provides
    @Singleton
    fun providePixabayApiService(): PixabayApi {
        return provideRetrofitPixabayApiService().create(PixabayApi::class.java)
    }

    @Provides
    @Singleton
    fun provideRapidApiService(): RapidApi {
        return provideRetrofitRapidApiService().create(RapidApi::class.java)
    }
}