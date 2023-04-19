package com.cat_info_about.random_facts.data.network.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J#\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/cat_info_about/random_facts/data/network/repository/CatFactsNetworkRepository;", "", "apiService", "Lcom/cat_info_about/random_facts/data/network/api/CatFactsApi;", "mapper", "Lcom/cat_info_about/random_facts/data/network/mapper/Mapper;", "(Lcom/cat_info_about/random_facts/data/network/api/CatFactsApi;Lcom/cat_info_about/random_facts/data/network/mapper/Mapper;)V", "getCatFacts", "Lkotlinx/coroutines/flow/Flow;", "Lcom/cat_info_about/random_facts/data/network/states/ResponseStatus;", "", "Lcom/cat_info_about/random_facts/data/network/model/CatFactModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class CatFactsNetworkRepository {
    private final com.cat_info_about.random_facts.data.network.api.CatFactsApi apiService = null;
    private final com.cat_info_about.random_facts.data.network.mapper.Mapper mapper = null;
    
    @javax.inject.Inject()
    public CatFactsNetworkRepository(@org.jetbrains.annotations.NotNull()
    com.cat_info_about.random_facts.data.network.api.CatFactsApi apiService, @org.jetbrains.annotations.NotNull()
    com.cat_info_about.random_facts.data.network.mapper.Mapper mapper) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCatFacts(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.cat_info_about.random_facts.data.network.states.ResponseStatus<? extends java.util.List<com.cat_info_about.random_facts.data.network.model.CatFactModel>>>> continuation) {
        return null;
    }
}