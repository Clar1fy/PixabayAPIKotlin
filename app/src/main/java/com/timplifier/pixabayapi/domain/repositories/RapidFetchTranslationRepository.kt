package com.timplifier.pixabayapi.domain.repositories

import androidx.lifecycle.MutableLiveData
import com.timplifier.pixabayapi.data.remote.hits.RapidHits

interface RapidFetchTranslationRepository {
    suspend fun fetchTranslations(word: String): MutableLiveData<List<RapidHits>>
}