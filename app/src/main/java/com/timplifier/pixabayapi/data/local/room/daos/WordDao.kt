package com.timplifier.pixabayapi.data.local.room.daos

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.timplifier.pixabayapi.data.local.room.models.Word
import com.timplifier.pixabayapi.domain.models.WordModel

@Dao
interface WordDao {
    @Insert
    fun insert(wordModel: Word)

    @Query("SELECT * FROM words WHERE category =:userCategory ")
    suspend fun getAllWords(userCategory: String): LiveData<List<Word>>
}