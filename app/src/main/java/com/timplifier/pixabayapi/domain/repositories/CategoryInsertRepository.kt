package com.timplifier.pixabayapi.domain.repositories

import com.timplifier.pixabayapi.domain.models.CategoryModel

interface CategoryInsertRepository {
    fun insertCategory(categoryModel: CategoryModel)
}