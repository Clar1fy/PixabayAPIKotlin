package com.timplifier.pixabayapi.data.local.room.database

import androidx.room.Database
import com.timplifier.pixabayapi.data.local.room.daos.CategoryDao
import com.timplifier.pixabayapi.data.local.room.daos.WordDao
import com.timplifier.pixabayapi.domain.models.CategoryModel
import com.timplifier.pixabayapi.domain.models.WordModel

@Database(
    entities = [WordModel::class, CategoryModel::class], version = 1, exportSchema = false
)
abstract class AppDatabase {
    abstract fun wordDao(): WordDao
    abstract fun categoryDao(): CategoryDao

}