package com.cat_info_about.random_facts.data.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.cat_info_about.random_facts.data.database.model.CatFactEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface CatFactsDao {

    @Query("SELECT * from facts_table")
    fun getFactsFromDb() : Flow<List<CatFactEntity>>

    @Insert
    suspend fun insertFact(fact: CatFactEntity)

    @Delete
    suspend fun deleteFact(fact: CatFactEntity)
}