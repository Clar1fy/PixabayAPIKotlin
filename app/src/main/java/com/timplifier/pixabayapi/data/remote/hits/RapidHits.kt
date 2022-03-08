package com.timplifier.pixabayapi.data.remote.hits

import com.google.gson.annotations.SerializedName

data class RapidHits(
    @SerializedName("id")
    val id: String,
    @SerializedName("segment")
    val segment: String,
    @SerializedName("translation")
    val translation: String,
    @SerializedName("source")
    val source: String,
    @SerializedName("target")
    val target: String,
    @SerializedName("quality")
    val quality: String,
    @SerializedName("reference")
    val reference: Any,
    @SerializedName("usage-count")
    val usageCount: Int,
    @SerializedName("subject")
    val subject: String,
    @SerializedName("created-by")
    val createdBy: String,
    @SerializedName("last-updated-by")
    val lastUpdatedBy: String,
    @SerializedName("create-date")
    val createDate: String,
    @SerializedName("last-update-date")
    val lastUpdateDate: String,
    @SerializedName("match")
    val match: Int,
)