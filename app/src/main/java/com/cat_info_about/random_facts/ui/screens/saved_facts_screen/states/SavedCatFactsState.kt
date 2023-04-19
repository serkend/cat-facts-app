package com.cat_info_about.random_facts.ui.screens.saved_facts_screen.states

import com.cat_info_about.random_facts.data.database.model.CatFactEntity
import com.cat_info_about.random_facts.data.network.model.CatFactModel

sealed class SavedCatFactsState() {
    object Loading : SavedCatFactsState()
    data class Success(val data: List<CatFactEntity>) : SavedCatFactsState()
    data class Error(val error: String) : SavedCatFactsState()
}