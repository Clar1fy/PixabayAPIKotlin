package com.timplifier.pixabayapi.data.local.room.daos

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.timplifier.pixabayapi.domain.models.WordModel

@Dao
interface WordDao {
    @Insert
    fun insert(wordModel: WordModel)

    @Query("SELECT * FROM words")
    suspend fun getAllWords(): LiveData<List<WordModel>>
}