package com.timplifier.pixabayapi.data.remote.apis

import com.timplifier.pixabayapi.common.constants.Constants.RAPID_API_KEY
import com.timplifier.pixabayapi.data.remote.response.RapidResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface RapidApi {
    @GET(RAPID_API_KEY)
    suspend fun getTranslation(
        @Query("q") keyword: String,
        @Query("mt") mt: Int,
        @Query("x-rapidapi-host") host: String,
        @Query("x-rapidapi-key") key: String
    ): Call<RapidResponse>
}