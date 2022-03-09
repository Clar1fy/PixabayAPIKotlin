package com.timplifier.pixabayapi.domain.repositories

import androidx.lifecycle.LiveData
import com.timplifier.pixabayapi.domain.models.WordModel

interface WordRetrieveRepository {
    suspend fun retrieveWords(userCategory: String): LiveData<List<WordModel>>
}