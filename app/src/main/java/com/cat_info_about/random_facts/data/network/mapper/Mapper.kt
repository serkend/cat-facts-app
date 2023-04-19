package com.cat_info_about.random_facts.data.network.mapper

import com.cat_info_about.random_facts.data.database.model.CatFactEntity
import com.cat_info_about.random_facts.data.network.model.CatFactModel
import javax.inject.Inject

class Mapper @Inject constructor() {
    fun fromNetworkToDatabase(fact: CatFactModel): CatFactEntity {
        return CatFactEntity(id = fact.id, text = fact.text)
    }
}