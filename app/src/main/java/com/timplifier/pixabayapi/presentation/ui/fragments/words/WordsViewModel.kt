package com.timplifier.pixabayapi.presentation.ui.fragments.words

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.timplifier.pixabayapi.data.remote.hits.PixabayHits
import com.timplifier.pixabayapi.domain.models.WordModel
import com.timplifier.pixabayapi.domain.repositories.PixabayRepository
import com.timplifier.pixabayapi.domain.repositories.WordRepository
import javax.inject.Inject

class WordsViewModel @Inject constructor(
    private val wordRepository: WordRepository,
    private var list: MutableLiveData<List<PixabayHits>>,
    private val pixabayRepository: PixabayRepository

) : ViewModel() {
    fun insertWord(wordModel: WordModel) =
        wordRepository.insert(wordModel)

    suspend fun getWords(category: String): LiveData<List<WordModel>> {
        return wordRepository.getAllWords()

    }

    suspend fun getImages(word: String): MutableLiveData<List<PixabayHits>> {
        list = pixabayRepository.getImages(word)
        return list


    }
}