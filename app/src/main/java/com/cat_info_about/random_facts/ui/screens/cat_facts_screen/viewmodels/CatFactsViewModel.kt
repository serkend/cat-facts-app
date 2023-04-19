package com.cat_info_about.random_facts.ui.screens.cat_facts_screen.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.cat_info_about.random_facts.data.database.model.CatFactEntity
import com.cat_info_about.random_facts.data.database.repository.CatFactsDatabaseRepository
import com.cat_info_about.random_facts.data.network.mapper.Mapper
import com.cat_info_about.random_facts.data.network.model.CatFactModel
import com.cat_info_about.random_facts.data.network.repository.CatFactsNetworkRepository
import com.cat_info_about.random_facts.data.network.states.ResponseStatus
import com.cat_info_about.random_facts.ui.screens.cat_facts_screen.states.CatFactsState
import com.cat_info_about.random_facts.ui.screens.saved_facts_screen.states.SavedCatFactsState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CatFactsViewModel @Inject constructor(
    private val networkRepository: CatFactsNetworkRepository,
    private val databaseRepository: CatFactsDatabaseRepository,
    private val mapper: Mapper
) : ViewModel() {

    private var _uiStateFlow: MutableStateFlow<CatFactsState> =
        MutableStateFlow(CatFactsState.Loading)
    val uiStateFlow = _uiStateFlow.asStateFlow()

    private lateinit var savedFacts: List<CatFactEntity>

    init {
        getCatFactsFromDB()
        getCatFacts()
    }

    private fun getCatFactsFromDB() {
        viewModelScope.launch {
            databaseRepository.getFactsFromDb().collect { facts ->
                savedFacts = facts
            }
        }
    }

    private fun getCatFacts() {
        viewModelScope.launch {
            networkRepository.getCatFacts().collect { response ->
                when (response) {
                    is ResponseStatus.SuccessResponse -> {
                        val verifiedFacts =
                            response.data.filter { fact -> fact.status.verified == true }

                        _uiStateFlow.value = CatFactsState.Success(verifiedFacts)
                    }
                    ResponseStatus.Loading -> {
                        _uiStateFlow.value = CatFactsState.Loading
                    }
                    is ResponseStatus.ErrorResponse -> {
                        _uiStateFlow.value = CatFactsState.Error(response.error)
                    }
                }
            }
        }
    }

    fun checkIfFactIsSaved(fact: CatFactModel): Boolean {
        if (savedFacts.map { it.id }.contains(fact.id)) {
            return true
        }
        return false
    }

    fun insertFact(fact: CatFactModel) {
        viewModelScope.launch {
            databaseRepository.insertFact(mapper.fromNetworkToDatabase(fact))
        }
    }

    fun deleteFact(fact: CatFactModel) {
        viewModelScope.launch {
            databaseRepository.deleteFact(mapper.fromNetworkToDatabase(fact))
        }
    }
}