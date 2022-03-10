package com.timplifier.pixabayapi.domain.usecases

import com.timplifier.pixabayapi.domain.repositories.CategoryRetrieveRepository
import javax.inject.Inject

class CategoriesRetrievalUseCase @Inject constructor(
    private val categoryRetrieveRepository: CategoryRetrieveRepository
) {
    suspend fun retrievalCategories() = categoryRetrieveRepository.getCategories()
}