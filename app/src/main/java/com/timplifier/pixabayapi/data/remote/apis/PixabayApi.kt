package com.timplifier.pixabayapi.data.remote.apis

import com.timplifier.pixabayapi.common.constants.Constants.PIXABAY_API_KEY
import com.timplifier.pixabayapi.data.remote.response.PixabayResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PixabayApi {
    @GET(PIXABAY_API_KEY)
    suspend fun getImages(@Query("q") keyWord: String): Call<PixabayResponse>
}