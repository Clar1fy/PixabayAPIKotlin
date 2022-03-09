package com.timplifier.pixabayapi.data.repositories

import com.timplifier.pixabayapi.data.local.room.daos.WordDao
import com.timplifier.pixabayapi.data.local.room.models.Word
import com.timplifier.pixabayapi.domain.models.WordModel
import com.timplifier.pixabayapi.domain.repositories.WordInsertRepository
import javax.inject.Inject

class WordInsertRepositoryImpl @Inject constructor(
    private val dao: WordDao
) : WordInsertRepository {
    override fun insert(wordModel: Word) {
        dao.insert(wordModel)
    }
}