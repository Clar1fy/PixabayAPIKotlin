package com.timplifier.pixabayapi.domain.usecases

import com.timplifier.pixabayapi.domain.repositories.RapidFetchTranslationRepository
import javax.inject.Inject

class RapidTranslationsFetchUseCase @Inject constructor(
    private val
    rapidFetchTranslationRepository: RapidFetchTranslationRepository
) {
    suspend fun fetchTranslation(word: String) =
        rapidFetchTranslationRepository.fetchTranslations(word)
}