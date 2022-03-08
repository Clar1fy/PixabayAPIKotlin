package com.timplifier.pixabayapi.di

import android.content.Context
import com.timplifier.pixabayapi.data.local.room.daos.WordDao
import com.timplifier.pixabayapi.data.local.room.database.RoomDatabase
import com.timplifier.pixabayapi.data.local.room.helper.RoomHelper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)

object RoomModule {
    @Singleton
    @Provides
    fun provideRoomDatabase(@ApplicationContext context: Context) =
        RoomHelper().provideRoom(context)

    @Singleton
    @Provides
    fun provideWordDao(roomDatabase: RoomDatabase): WordDao {
        return RoomHelper().provideWordDao(roomDatabase)


    }

}