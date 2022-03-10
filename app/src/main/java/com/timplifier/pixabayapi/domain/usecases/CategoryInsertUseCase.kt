package com.timplifier.pixabayapi.domain.usecases

import com.timplifier.pixabayapi.domain.models.CategoryModel
import com.timplifier.pixabayapi.domain.repositories.CategoryInsertRepository
import javax.inject.Inject

class CategoryInsertUseCase @Inject constructor(
    private val categoryInsertRepository: CategoryInsertRepository
) {
    fun insertCategory(categoryModel: CategoryModel) =
        categoryInsertRepository.insertCategory(categoryModel)
}