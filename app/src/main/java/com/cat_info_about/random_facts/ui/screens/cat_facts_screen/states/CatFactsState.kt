package com.cat_info_about.random_facts.ui.screens.cat_facts_screen.states

import com.cat_info_about.random_facts.data.network.model.CatFactModel

sealed class CatFactsState() {
    object Loading : CatFactsState()
    data class Success(val data: List<CatFactModel>) : CatFactsState()
    data class Error(val error: String) : CatFactsState()
}