package com.timplifier.pixabayapi.domain.repositories

import com.timplifier.pixabayapi.data.local.room.daos.CategoryDao
import com.timplifier.pixabayapi.domain.models.CategoryModel
import javax.inject.Inject

class CategoryRepository @Inject constructor(
    private val categoryDao: CategoryDao
) {
    fun insert(categoryModel: CategoryModel) =
        categoryDao.insert(categoryModel)

    suspend fun getAllCategories() = categoryDao.getAllCategories()

}