package com.timplifier.pixabayapi.domain.repositories

import com.timplifier.pixabayapi.domain.models.WordModel

interface WordInsertRepository {
    fun insert(wordModel: WordModel)
}