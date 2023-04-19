package com.cat_info_about.random_facts.ui.screens.cat_facts_screen.viewmodels;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0002J\b\u0010\u001a\u001a\u00020\u0018H\u0002J\u000e\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0016R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001c"}, d2 = {"Lcom/cat_info_about/random_facts/ui/screens/cat_facts_screen/viewmodels/CatFactsViewModel;", "Landroidx/lifecycle/ViewModel;", "networkRepository", "Lcom/cat_info_about/random_facts/data/network/repository/CatFactsNetworkRepository;", "databaseRepository", "Lcom/cat_info_about/random_facts/data/database/repository/CatFactsDatabaseRepository;", "mapper", "Lcom/cat_info_about/random_facts/data/network/mapper/Mapper;", "(Lcom/cat_info_about/random_facts/data/network/repository/CatFactsNetworkRepository;Lcom/cat_info_about/random_facts/data/database/repository/CatFactsDatabaseRepository;Lcom/cat_info_about/random_facts/data/network/mapper/Mapper;)V", "_uiStateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/cat_info_about/random_facts/ui/screens/cat_facts_screen/states/CatFactsState;", "savedFacts", "", "Lcom/cat_info_about/random_facts/data/database/model/CatFactEntity;", "uiStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getUiStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "checkIfFactIsSaved", "", "fact", "Lcom/cat_info_about/random_facts/data/network/model/CatFactModel;", "deleteFact", "", "getCatFacts", "getCatFactsFromDB", "insertFact", "app_debug"})
public final class CatFactsViewModel extends androidx.lifecycle.ViewModel {
    private final com.cat_info_about.random_facts.data.network.repository.CatFactsNetworkRepository networkRepository = null;
    private final com.cat_info_about.random_facts.data.database.repository.CatFactsDatabaseRepository databaseRepository = null;
    private final com.cat_info_about.random_facts.data.network.mapper.Mapper mapper = null;
    private kotlinx.coroutines.flow.MutableStateFlow<com.cat_info_about.random_facts.ui.screens.cat_facts_screen.states.CatFactsState> _uiStateFlow;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.cat_info_about.random_facts.ui.screens.cat_facts_screen.states.CatFactsState> uiStateFlow = null;
    private java.util.List<com.cat_info_about.random_facts.data.database.model.CatFactEntity> savedFacts;
    
    @javax.inject.Inject()
    public CatFactsViewModel(@org.jetbrains.annotations.NotNull()
    com.cat_info_about.random_facts.data.network.repository.CatFactsNetworkRepository networkRepository, @org.jetbrains.annotations.NotNull()
    com.cat_info_about.random_facts.data.database.repository.CatFactsDatabaseRepository databaseRepository, @org.jetbrains.annotations.NotNull()
    com.cat_info_about.random_facts.data.network.mapper.Mapper mapper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.cat_info_about.random_facts.ui.screens.cat_facts_screen.states.CatFactsState> getUiStateFlow() {
        return null;
    }
    
    private final void getCatFactsFromDB() {
    }
    
    private final void getCatFacts() {
    }
    
    public final boolean checkIfFactIsSaved(@org.jetbrains.annotations.NotNull()
    com.cat_info_about.random_facts.data.network.model.CatFactModel fact) {
        return false;
    }
    
    public final void insertFact(@org.jetbrains.annotations.NotNull()
    com.cat_info_about.random_facts.data.network.model.CatFactModel fact) {
    }
    
    public final void deleteFact(@org.jetbrains.annotations.NotNull()
    com.cat_info_about.random_facts.data.network.model.CatFactModel fact) {
    }
}