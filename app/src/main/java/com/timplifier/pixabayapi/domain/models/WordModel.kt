package com.timplifier.pixabayapi.domain.models

import com.timplifier.pixabayapi.data.local.room.models.WordEntity

data class WordModel(
    var id: Int?,
    var category: String,
    var image: Int,
    var word: String
) {

    fun WordModel.toEntity(): WordEntity = WordEntity(
        id, category, image, word
    )
}

