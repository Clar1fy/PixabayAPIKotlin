package com.timplifier.pixabayapi.data.repositories

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.timplifier.pixabayapi.data.local.room.daos.CategoryDao
import com.timplifier.pixabayapi.data.local.room.models.toModel
import com.timplifier.pixabayapi.domain.models.CategoryModel
import com.timplifier.pixabayapi.domain.repositories.CategoryRetrieveRepository
import javax.inject.Inject

class CategoryRetrieveRepositoryImpl @Inject constructor(
    private val categoryDao: CategoryDao
) : CategoryRetrieveRepository {
    override suspend fun getCategories(): LiveData<List<CategoryModel>> {
        val categoryState = MutableLiveData<List<CategoryModel>>()
        categoryState.value = categoryDao.getAllCategories().map {
            it.toModel()
        }
        return categoryState
    }


}