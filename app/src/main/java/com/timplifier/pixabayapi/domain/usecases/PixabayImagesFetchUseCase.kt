package com.timplifier.pixabayapi.domain.usecases

import com.timplifier.pixabayapi.domain.repositories.PixabayFetchImagesRepository
import javax.inject.Inject

class PixabayImagesFetchUseCase @Inject constructor(
    private val
    pixabayFetchImagesRepository: PixabayFetchImagesRepository
) {
    suspend fun fetchImages(word: String) = pixabayFetchImagesRepository.getImages(word)
}