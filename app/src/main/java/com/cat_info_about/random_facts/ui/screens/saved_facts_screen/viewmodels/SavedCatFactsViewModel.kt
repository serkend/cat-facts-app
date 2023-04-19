package com.cat_info_about.random_facts.ui.screens.saved_facts_screen.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.cat_info_about.random_facts.data.database.model.CatFactEntity
import com.cat_info_about.random_facts.data.database.repository.CatFactsDatabaseRepository
import com.cat_info_about.random_facts.data.network.mapper.Mapper
import com.cat_info_about.random_facts.data.network.model.CatFactModel
import com.cat_info_about.random_facts.data.network.repository.CatFactsNetworkRepository
import com.cat_info_about.random_facts.ui.screens.saved_facts_screen.states.SavedCatFactsState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SavedCatFactsViewModel @Inject constructor(
    private val databaseRepository: CatFactsDatabaseRepository,
) : ViewModel() {

    private var _uiStateFlow: MutableStateFlow<SavedCatFactsState> =
        MutableStateFlow(SavedCatFactsState.Loading)
    val uiStateFlow = _uiStateFlow.asStateFlow()

    init {
        getCatFactsFromDB()
    }

    private fun getCatFactsFromDB() {
        viewModelScope.launch {
            databaseRepository.getFactsFromDb().collect { facts ->
                _uiStateFlow.value = SavedCatFactsState.Success(facts)
            }
        }
    }

    fun deleteFact(fact:CatFactEntity) {
        viewModelScope.launch {
            databaseRepository.deleteFact(fact)
        }
    }
}