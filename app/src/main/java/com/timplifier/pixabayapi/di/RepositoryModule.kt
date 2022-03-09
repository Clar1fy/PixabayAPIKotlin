package com.timplifier.pixabayapi.di

import com.timplifier.pixabayapi.data.local.room.daos.CategoryDao
import com.timplifier.pixabayapi.data.local.room.daos.WordDao
import com.timplifier.pixabayapi.data.remote.apis.PixabayApi
import com.timplifier.pixabayapi.data.remote.apis.RapidApi
import com.timplifier.pixabayapi.data.repositories.*
import com.timplifier.pixabayapi.domain.repositories.*
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
    fun providePixabayRepository(pixabayAPI: PixabayApi): PixabayFetchImagesRepository {
        return PixabayFetchImagesRepositoryImpl(pixabayAPI)

    }

    @Singleton
    @Provides
    fun provideRapidRepository(rapidApi: RapidApi): RapidFetchTranslationRepository {
        return RapidFetchTranslationRepositoryImpl(rapidApi)
    }

    @Singleton
    @Provides
    fun provideInsertWordRepository(wordDao: WordDao): WordInsertRepository {
        return WordInsertRepositoryImpl(wordDao)
    }

    @Singleton
    @Provides
    fun provideRetrieveWordRepository(wordDao: WordDao): WordRetrieveRepository {
        return WordRetrieveRepositoryImpl(wordDao)
    }

    @Singleton
    @Provides
    fun provideInsertCategoryRepository(categoryDao: CategoryDao): CategoryInsertRepository {
        return CategoryInsertRepositoryImpl(categoryDao)
    }

    @Singleton
    @Provides
    fun provideRetrieveCategoryRepository(categoryDao: CategoryDao): CategoryRetrieveRepository {
        return CategoryRetrieveRepositoryImpl(categoryDao)
    }

}