package com.timplifier.pixabayapi.data.local.room.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.timplifier.pixabayapi.data.local.room.models.WordEntity

@Dao
interface WordDao {
    @Insert
    fun insert(wordModel: WordEntity)

    @Query("SELECT * FROM words WHERE category =:userCategory ")
    suspend fun getAllWords(userCategory: String): List<WordEntity>
}