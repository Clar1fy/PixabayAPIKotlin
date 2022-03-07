package com.timplifier.pixabayapi.domain.repositories

import androidx.lifecycle.MutableLiveData
import com.timplifier.pixabayapi.data.remote.api.PixabayApi
import com.timplifier.pixabayapi.data.remote.hits.PixabayHits
import com.timplifier.pixabayapi.data.remote.response.PixabayResponse
import retrofit2.Call
import retrofit2.Response
import javax.inject.Inject

class PixabayRepository @Inject constructor(pixabayApi: PixabayApi
) {

    suspend fun getImages(list: MutableLiveData<PixabayHits>, pixabayApi: PixabayApi): MutableLiveData<PixabayHits> {
        pixabayApi.getImages("word").enqueue(object : retrofit2.Callback<PixabayResponse?> {
            override fun onResponse(
                call: Call<PixabayResponse?>,
                response: Response<PixabayResponse?>
            ) {
                if (response.isSuccessful)
                    list.postValue(response.body().hits)
            }

            override fun onFailure(call: Call<PixabayResponse?>, t: Throwable) {
            }
        })
        return list

    }


}