package com.cat_info_about.random_facts.data.database.repository

import com.cat_info_about.random_facts.data.database.dao.CatFactsDao
import com.cat_info_about.random_facts.data.database.model.CatFactEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.withContext
import javax.inject.Inject

class CatFactsDatabaseRepository @Inject constructor(private val dao: CatFactsDao) {

    fun getFactsFromDb() =
        dao.getFactsFromDb().flowOn(Dispatchers.IO)

    suspend fun insertFact(fact: CatFactEntity) = withContext(Dispatchers.IO) {
        dao.insertFact(fact)
    }

    suspend fun deleteFact(fact: CatFactEntity) = withContext(Dispatchers.IO) {
        dao.deleteFact(fact)
    }
}