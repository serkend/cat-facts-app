package com.cat_info_about.random_facts.data.database.instance

import androidx.room.Database
import androidx.room.RoomDatabase
import com.cat_info_about.random_facts.data.database.dao.CatFactsDao
import com.cat_info_about.random_facts.data.database.model.CatFactEntity

@Database(entities = [CatFactEntity::class], version = 1)
abstract class FactsDatabase : RoomDatabase() {
    abstract fun getDao() : CatFactsDao
}