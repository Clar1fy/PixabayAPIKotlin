package com.timplifier.pixabayapi.data.local.room.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.timplifier.pixabayapi.data.local.room.models.CategoryEntity

@Dao
interface CategoryDao {
    @Insert
    fun insert(categoryModel: CategoryEntity)

    @Query("SELECT * FROM categories")
    suspend fun getAllCategories(): List<CategoryEntity>
}