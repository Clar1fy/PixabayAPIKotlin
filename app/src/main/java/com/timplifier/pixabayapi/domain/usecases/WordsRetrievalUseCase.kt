package com.timplifier.pixabayapi.domain.usecases

import com.timplifier.pixabayapi.domain.repositories.WordRetrieveRepository
import javax.inject.Inject

class WordsRetrievalUseCase @Inject constructor(
    private val wordRetrieveRepository: WordRetrieveRepository
) {
    suspend fun retrieveWords(category: String) = wordRetrieveRepository.retrieveWords(category)
}