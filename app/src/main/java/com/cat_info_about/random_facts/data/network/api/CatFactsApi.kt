package com.cat_info_about.random_facts.data.network.api

import androidx.room.Dao
import com.cat_info_about.random_facts.data.network.model.CatFactModel
import retrofit2.Response
import retrofit2.http.GET

@Dao
interface CatFactsApi {
    @GET("/facts/random?amount=$FactsCount")
    suspend fun getCatFacts(): Response<List<CatFactModel>>

    companion object {
        const val FactsCount = 100
    }
}