package com.timplifier.pixabayapi.data.remote.api

import com.timplifier.pixabayapi.common.constants.Constants
import retrofit2.http.GET
import retrofit2.http.Query

interface RapidApi {
    @GET(Constants.RAPID_API_KEY)
    suspend fun getTranslation(
        @Query("q") keyword: String,
        @Query("mt") mt: Int,
        @Query("x-rapidapi-host") host: String,
        @Query("x-rapidapi-key") key: String
    )
}