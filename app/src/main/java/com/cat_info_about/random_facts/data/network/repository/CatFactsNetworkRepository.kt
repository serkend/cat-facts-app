package com.cat_info_about.random_facts.data.network.repository

import com.cat_info_about.random_facts.data.network.api.CatFactsApi
import com.cat_info_about.random_facts.data.network.mapper.Mapper
import com.cat_info_about.random_facts.data.network.model.CatFactModel
import com.cat_info_about.random_facts.data.network.states.ResponseStatus
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class CatFactsNetworkRepository @Inject constructor(
    private val apiService: CatFactsApi,
    private val mapper: Mapper
    ) {

    suspend fun getCatFacts(): Flow<ResponseStatus<List<CatFactModel>>> =
        flow {
            emit(ResponseStatus.Loading)
            try {
                val data = apiService.getCatFacts().body()
                if (data != null) {
                    emit(ResponseStatus.SuccessResponse(data))
                }
            } catch (e: Exception) {
                e.printStackTrace()
                emit(ResponseStatus.ErrorResponse(e.message ?: "Unknown error"))
            }
        }

}