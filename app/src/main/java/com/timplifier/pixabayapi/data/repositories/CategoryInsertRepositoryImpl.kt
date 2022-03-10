package com.timplifier.pixabayapi.data.repositories

import com.timplifier.pixabayapi.data.local.room.daos.CategoryDao
import com.timplifier.pixabayapi.data.local.room.models.toEntity
import com.timplifier.pixabayapi.domain.models.CategoryModel
import com.timplifier.pixabayapi.domain.repositories.CategoryInsertRepository
import javax.inject.Inject

class CategoryInsertRepositoryImpl @Inject constructor(
    private val categoryDao: CategoryDao
) : CategoryInsertRepository {


    override fun insertCategory(categoryModel: CategoryModel) {
        categoryDao.insert(categoryModel.toEntity())

    }
}