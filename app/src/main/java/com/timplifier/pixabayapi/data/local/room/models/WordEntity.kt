package com.timplifier.pixabayapi.data.local.room.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.timplifier.pixabayapi.domain.models.WordModel

@Entity(tableName = "words")
data class WordEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int?,
    var category: String,
    var image: Int,
    var word: String

)

fun WordEntity.toModel(): WordModel = WordModel(
    id, category, image, word
)

fun WordModel.toEntity(): WordEntity = WordEntity(
    id, category, image, word
)