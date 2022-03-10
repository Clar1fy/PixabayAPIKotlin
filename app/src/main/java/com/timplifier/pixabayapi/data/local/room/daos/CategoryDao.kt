package com.timplifier.pixabayapi.data.local.room.daos

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.timplifier.pixabayapi.domain.models.CategoryModel

@Dao
interface CategoryDao {
    @Insert
    fun insert(categoryModel: CategoryModel)

    @Query("SELECT * FROM categories")
    suspend fun getAllCategories(): LiveData<List<CategoryModel>>
}