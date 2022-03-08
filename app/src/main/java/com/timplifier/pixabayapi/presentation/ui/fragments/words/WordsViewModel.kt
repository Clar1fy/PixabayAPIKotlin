package com.timplifier.pixabayapi.presentation.ui.fragments.words

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.timplifier.pixabayapi.domain.models.WordModel
import com.timplifier.pixabayapi.domain.repositories.WordRepository
import javax.inject.Inject

class WordsViewModel @Inject constructor(
    private val wordRepository: WordRepository

) : ViewModel() {
    fun insertWord(wordModel: WordModel) =
        wordRepository.insert(wordModel)

    suspend fun getWords(category: String): LiveData<List<WordModel>> {
        return wordRepository.getAllWords()

    }
}