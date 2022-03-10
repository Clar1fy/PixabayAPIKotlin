package com.timplifier.pixabayapi.domain.usecases

import com.timplifier.pixabayapi.domain.models.WordModel
import com.timplifier.pixabayapi.domain.repositories.WordInsertRepository
import javax.inject.Inject

class WordInsertUseCase @Inject constructor(
    private val wordInsertRepository: WordInsertRepository
) {
    fun insert(wordModel: WordModel) = wordInsertRepository.insert(wordModel)
}