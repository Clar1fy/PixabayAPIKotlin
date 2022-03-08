package com.timplifier.pixabayapi.domain.repositories

import com.timplifier.pixabayapi.data.local.room.daos.WordDao
import com.timplifier.pixabayapi.domain.models.WordModel
import javax.inject.Inject

class WordRepository @Inject constructor(
    private val wordDao: WordDao
) {
    fun insert(wordModel: WordModel) = wordDao.insert(wordModel)


    suspend fun getAllWords() = wordDao.getAllWords()
}