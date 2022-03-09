package com.timplifier.pixabayapi.data.local.room.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.timplifier.pixabayapi.domain.models.CategoryModel

@Entity(tableName = "categories")
data class Category(
    @PrimaryKey(autoGenerate = true)
    var id: Int?,
    var title: String

)

fun Category.toDomain() = CategoryModel(
    id, title
)
