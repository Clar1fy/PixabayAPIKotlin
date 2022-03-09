package com.timplifier.pixabayapi.domain.repositories

import androidx.lifecycle.MutableLiveData
import com.timplifier.pixabayapi.data.remote.hits.PixabayHits

interface PixabayFetchImagesRepository {
    suspend fun getImages(word: String): MutableLiveData<List<PixabayHits>>
}