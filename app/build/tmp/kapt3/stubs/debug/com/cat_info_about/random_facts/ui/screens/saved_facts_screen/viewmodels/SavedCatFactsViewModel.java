package com.cat_info_about.random_facts.ui.screens.saved_facts_screen.viewmodels;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\rH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0011"}, d2 = {"Lcom/cat_info_about/random_facts/ui/screens/saved_facts_screen/viewmodels/SavedCatFactsViewModel;", "Landroidx/lifecycle/ViewModel;", "databaseRepository", "Lcom/cat_info_about/random_facts/data/database/repository/CatFactsDatabaseRepository;", "(Lcom/cat_info_about/random_facts/data/database/repository/CatFactsDatabaseRepository;)V", "_uiStateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/cat_info_about/random_facts/ui/screens/saved_facts_screen/states/SavedCatFactsState;", "uiStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getUiStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "deleteFact", "", "fact", "Lcom/cat_info_about/random_facts/data/database/model/CatFactEntity;", "getCatFactsFromDB", "app_debug"})
public final class SavedCatFactsViewModel extends androidx.lifecycle.ViewModel {
    private final com.cat_info_about.random_facts.data.database.repository.CatFactsDatabaseRepository databaseRepository = null;
    private kotlinx.coroutines.flow.MutableStateFlow<com.cat_info_about.random_facts.ui.screens.saved_facts_screen.states.SavedCatFactsState> _uiStateFlow;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.cat_info_about.random_facts.ui.screens.saved_facts_screen.states.SavedCatFactsState> uiStateFlow = null;
    
    @javax.inject.Inject()
    public SavedCatFactsViewModel(@org.jetbrains.annotations.NotNull()
    com.cat_info_about.random_facts.data.database.repository.CatFactsDatabaseRepository databaseRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.cat_info_about.random_facts.ui.screens.saved_facts_screen.states.SavedCatFactsState> getUiStateFlow() {
        return null;
    }
    
    private final void getCatFactsFromDB() {
    }
    
    public final void deleteFact(@org.jetbrains.annotations.NotNull()
    com.cat_info_about.random_facts.data.database.model.CatFactEntity fact) {
    }
}