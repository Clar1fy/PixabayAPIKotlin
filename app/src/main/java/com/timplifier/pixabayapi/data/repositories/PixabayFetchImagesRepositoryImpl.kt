package com.timplifier.pixabayapi.data.repositories

import androidx.lifecycle.MutableLiveData
import com.timplifier.pixabayapi.data.remote.apis.PixabayApi
import com.timplifier.pixabayapi.data.remote.hits.PixabayHits
import com.timplifier.pixabayapi.data.remote.response.PixabayResponse
import com.timplifier.pixabayapi.domain.repositories.PixabayFetchImagesRepository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class PixabayFetchImagesRepositoryImpl @Inject constructor(private val pixabayApi: PixabayApi) :
    PixabayFetchImagesRepository {
    override suspend fun getImages(word: String): MutableLiveData<List<PixabayHits>> {
        var imageList = MutableLiveData<List<PixabayHits>>()
        pixabayApi.getImages(word).enqueue(object : Callback<PixabayResponse?> {
            override fun onResponse(
                call: Call<PixabayResponse?>,
                response: Response<PixabayResponse?>
            ) {
                imageList.postValue(response.body()!!.hits!!)


            }

            override fun onFailure(call: Call<PixabayResponse?>, t: Throwable) {
                TODO("Not yet implemented")
            }
        })
        return imageList
    }
}