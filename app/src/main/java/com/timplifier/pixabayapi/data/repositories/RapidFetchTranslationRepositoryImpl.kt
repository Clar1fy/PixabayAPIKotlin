package com.timplifier.pixabayapi.data.repositories

import androidx.lifecycle.MutableLiveData
import com.timplifier.pixabayapi.common.constants.Constants.RAPID_HOST
import com.timplifier.pixabayapi.common.constants.Constants.RAPID_KEY
import com.timplifier.pixabayapi.data.remote.apis.RapidApi
import com.timplifier.pixabayapi.data.remote.hits.RapidHits
import com.timplifier.pixabayapi.data.remote.response.RapidResponse
import com.timplifier.pixabayapi.domain.repositories.RapidFetchTranslationRepository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class RapidFetchTranslationRepositoryImpl @Inject constructor(
    private val rapidApi: RapidApi
) : RapidFetchTranslationRepository {
    override suspend fun fetchTranslations(word: String): MutableLiveData<List<RapidHits>> {
        var translationList = MutableLiveData<List<RapidHits>>()
        rapidApi.getTranslation(word, 0, RAPID_HOST, RAPID_KEY)
            .enqueue(object : Callback<RapidResponse?> {
                override fun onResponse(
                    call: Call<RapidResponse?>,
                    response: Response<RapidResponse?>
                ) {
                    translationList.postValue(response.body()?.match)

                }

                override fun onFailure(call: Call<RapidResponse?>, t: Throwable) {
                }
            })
        return translationList
    }

}