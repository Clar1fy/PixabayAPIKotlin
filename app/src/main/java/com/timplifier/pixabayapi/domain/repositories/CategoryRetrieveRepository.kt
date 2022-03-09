package com.timplifier.pixabayapi.domain.repositories

import androidx.lifecycle.LiveData
import com.timplifier.pixabayapi.domain.models.CategoryModel

interface CategoryRetrieveRepository {
    suspend fun getCategories(): LiveData<List<CategoryModel>>
}