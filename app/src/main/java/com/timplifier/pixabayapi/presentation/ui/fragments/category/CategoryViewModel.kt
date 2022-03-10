package com.timplifier.pixabayapi.presentation.ui.fragments.category

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.timplifier.pixabayapi.domain.models.CategoryModel
import com.timplifier.pixabayapi.domain.usecases.CategoriesRetrievalUseCase
import com.timplifier.pixabayapi.domain.usecases.CategoryInsertUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CategoryViewModel @Inject constructor(
    private val categoryInsertUseCase: CategoryInsertUseCase,
    private val categoryRetrievalUseCase: CategoriesRetrievalUseCase

) : ViewModel() {
    fun insertCategory(categoryModel: CategoryModel) =
        categoryInsertUseCase.insertCategory(categoryModel)


    suspend fun getCategories(): LiveData<List<CategoryModel>> {
        return categoryRetrievalUseCase.retrievalCategories()
    }
}