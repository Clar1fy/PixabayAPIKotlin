package com.timplifier.pixabayapi.presentation.ui.fragments.category

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.timplifier.pixabayapi.domain.models.CategoryModel
import javax.inject.Inject

class CategoryViewModel @Inject constructor(
    private val categoryRepository: CategoryRepository

) : ViewModel() {
    fun insertCategory(categoryModel: CategoryModel) =
        categoryRepository.insert(categoryModel)


    suspend fun getCategories(): LiveData<List<CategoryModel>> {
        return categoryRepository.getAllCategories()
    }
}