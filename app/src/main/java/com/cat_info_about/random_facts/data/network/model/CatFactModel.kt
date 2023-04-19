package com.cat_info_about.random_facts.data.network.model

import com.google.gson.annotations.SerializedName

data class CatFactModel(
    @SerializedName("_id")
    val id: String,
    val status: Status,
    val text: String
)