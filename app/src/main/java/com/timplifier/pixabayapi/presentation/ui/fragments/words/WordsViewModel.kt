package com.timplifier.pixabayapi.presentation.ui.fragments.words

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.timplifier.pixabayapi.data.remote.hits.PixabayHits
import com.timplifier.pixabayapi.domain.models.WordModel
import com.timplifier.pixabayapi.domain.usecases.PixabayImagesFetchUseCase
import com.timplifier.pixabayapi.domain.usecases.WordInsertUseCase
import com.timplifier.pixabayapi.domain.usecases.WordsRetrievalUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class WordsViewModel @Inject constructor(
    private val wordInsertUseCase: WordInsertUseCase,
    private val wordsRetrievalUseCase: WordsRetrievalUseCase,
    private val pixabayFetchImagesFetchUseCase: PixabayImagesFetchUseCase,
) : ViewModel() {
    private var list = MutableLiveData<List<PixabayHits>>()
    fun insertWord(wordModel: WordModel) =
        wordInsertUseCase.insert(wordModel)

    suspend fun getWords(category: String): LiveData<List<WordModel>> {
        return wordsRetrievalUseCase.retrieveWords(category)
    }

    fun getImages(word: String): MutableLiveData<List<PixabayHits>> {
        viewModelScope.launch(Dispatchers.IO) {
            list = pixabayFetchImagesFetchUseCase.fetchImages(word)

        }
        return list


    }
}