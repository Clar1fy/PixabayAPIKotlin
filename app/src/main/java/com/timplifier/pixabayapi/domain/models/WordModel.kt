package com.timplifier.pixabayapi.domain.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "words")
data class WordModel(
    @PrimaryKey(autoGenerate = true)
    var id: Int?,
    var category: String,
    var image: Int,
    var word: String

)

