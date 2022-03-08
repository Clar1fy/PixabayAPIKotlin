package com.timplifier.pixabayapi.data.remote.response

import com.google.gson.annotations.SerializedName
import com.timplifier.pixabayapi.data.remote.hits.RapidHits

data class RapidResponse(
    @SerializedName("translatedText")
    val translatedText: String,
    @SerializedName("match")
    val match: List<RapidHits>

)