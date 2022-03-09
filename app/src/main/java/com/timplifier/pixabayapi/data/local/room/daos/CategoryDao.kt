package com.timplifier.pixabayapi.data.local.room.daos

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.timplifier.pixabayapi.data.local.room.models.Category
import com.timplifier.pixabayapi.domain.models.CategoryModel

@Dao
interface CategoryDao {
    @Insert
    fun insert(categoryModel: Category)

    @Query("SELECT * FROM categories")
    suspend fun getAllCategories(): LiveData<List<Category>>
}