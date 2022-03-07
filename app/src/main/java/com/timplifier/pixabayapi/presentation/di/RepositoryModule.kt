package com.timplifier.pixabayapi.presentation.di

import com.timplifier.pixabayapi.data.remote.api.PixabayApi
import com.timplifier.pixabayapi.data.remote.api.RapidApi
import com.timplifier.pixabayapi.domain.repositories.PixabayRepository
import com.timplifier.pixabayapi.domain.repositories.RapidRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Singleton
    @Provides
    fun providePixabayRepository(pixabayAPI: PixabayApi): PixabayRepository {
        return PixabayRepository(pixabayAPI)


    }

    @Singleton
    @Provides
    fun provideRapidRepository(rapidApi: RapidApi): RapidRepository {
        return RapidRepository(rapidApi)
    }

}