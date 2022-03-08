package com.timplifier.pixabayapi.domain.repositories

import androidx.lifecycle.MutableLiveData
import com.timplifier.pixabayapi.common.constants.Constants
import com.timplifier.pixabayapi.data.remote.apis.RapidApi
import com.timplifier.pixabayapi.data.remote.hits.RapidHits
import com.timplifier.pixabayapi.data.remote.response.RapidResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class RapidRepository @Inject constructor(rapidApi: RapidApi) {
    suspend fun getTranslation(
        translationList: MutableLiveData<List<RapidHits>>, rapidApi: RapidApi, word: String
    ): MutableLiveData<List<RapidHits>> {
        rapidApi.getTranslation(word, 0, Constants.RAPID_HOST, Constants.RAPID_KEY)
            .enqueue(object : Callback<RapidResponse?> {
                override fun onResponse(
                    call: Call<RapidResponse?>,
                    response: Response<RapidResponse?>
                ) {
                    if (response.isSuccessful)
                        translationList.postValue(response.body()!!.match)

                }

                override fun onFailure(call: Call<RapidResponse?>, t: Throwable) {
                    TODO("Not yet implemented")
                }
            })
        return translationList

    }
}