package com.timplifier.pixabayapi.data.local.room.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.timplifier.pixabayapi.domain.models.CategoryModel

@Entity(tableName = "categories")
data class CategoryEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int?,
    var title: String

)


fun CategoryEntity.toModel() = CategoryModel(
    id, title
)

fun CategoryModel.toEntity(): CategoryEntity = CategoryEntity(
    id, title
)
