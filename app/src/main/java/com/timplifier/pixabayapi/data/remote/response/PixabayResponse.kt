package com.timplifier.pixabayapi.data.remote.response

import com.google.gson.annotations.SerializedName
import com.timplifier.pixabayapi.data.remote.hits.PixabayHits

data class PixabayResponse(
    @SerializedName("total")
    val total: Int,
    @SerializedName("totalHits")
    val totalHits: Int,
    @SerializedName("hits")
    val hits: List<PixabayHits>? = null

)