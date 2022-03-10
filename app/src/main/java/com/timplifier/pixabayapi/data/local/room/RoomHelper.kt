package com.timplifier.pixabayapi.data.local.room

import android.content.Context
import androidx.room.Room
import com.timplifier.pixabayapi.data.local.room.database.RoomDatabase
import dagger.hilt.android.qualifiers.ApplicationContext

class RoomHelper {

    fun provideRoom(@ApplicationContext context: Context) =
        Room.databaseBuilder(context, RoomDatabase::class.java, "database")
            .allowMainThreadQueries()
            .fallbackToDestructiveMigration().build()

    fun provideWordDao(roomDatabase: RoomDatabase) = roomDatabase.wordDao()
    fun provideCategoryDao(roomDatabase: RoomDatabase) = roomDatabase.categoryDao()

}