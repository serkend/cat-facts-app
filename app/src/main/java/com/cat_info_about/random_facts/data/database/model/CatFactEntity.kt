package com.cat_info_about.random_facts.data.database.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "facts_table")
data class CatFactEntity(
    @PrimaryKey val id: String,
    val text: String
)