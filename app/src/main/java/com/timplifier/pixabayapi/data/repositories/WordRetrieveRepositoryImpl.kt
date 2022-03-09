package com.timplifier.pixabayapi.data.repositories

import androidx.lifecycle.LiveData
import com.timplifier.pixabayapi.data.local.room.daos.WordDao
import com.timplifier.pixabayapi.domain.models.WordModel
import com.timplifier.pixabayapi.domain.repositories.WordRetrieveRepository
import javax.inject.Inject

class WordRetrieveRepositoryImpl @Inject constructor(
    private val wordDao: WordDao
) : WordRetrieveRepository {
    override suspend fun retrieveWords(userCategory: String): LiveData<List<WordModel>> {
        return wordDao.getAllWords(userCategory)
    }

}