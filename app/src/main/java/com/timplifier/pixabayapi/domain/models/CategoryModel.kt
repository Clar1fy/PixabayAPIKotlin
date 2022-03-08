package com.timplifier.pixabayapi.domain.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "categories")
data class CategoryModel(
    @PrimaryKey(autoGenerate = true)
    var id: Int?,
    var title: String

)
