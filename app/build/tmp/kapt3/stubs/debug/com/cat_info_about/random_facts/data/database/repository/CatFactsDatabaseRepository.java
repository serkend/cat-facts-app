package com.cat_info_about.random_facts.data.database.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u000bJ\u0019\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/cat_info_about/random_facts/data/database/repository/CatFactsDatabaseRepository;", "", "dao", "Lcom/cat_info_about/random_facts/data/database/dao/CatFactsDao;", "(Lcom/cat_info_about/random_facts/data/database/dao/CatFactsDao;)V", "deleteFact", "", "fact", "Lcom/cat_info_about/random_facts/data/database/model/CatFactEntity;", "(Lcom/cat_info_about/random_facts/data/database/model/CatFactEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFactsFromDb", "Lkotlinx/coroutines/flow/Flow;", "", "insertFact", "app_debug"})
public final class CatFactsDatabaseRepository {
    private final com.cat_info_about.random_facts.data.database.dao.CatFactsDao dao = null;
    
    @javax.inject.Inject()
    public CatFactsDatabaseRepository(@org.jetbrains.annotations.NotNull()
    com.cat_info_about.random_facts.data.database.dao.CatFactsDao dao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.cat_info_about.random_facts.data.database.model.CatFactEntity>> getFactsFromDb() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertFact(@org.jetbrains.annotations.NotNull()
    com.cat_info_about.random_facts.data.database.model.CatFactEntity fact, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteFact(@org.jetbrains.annotations.NotNull()
    com.cat_info_about.random_facts.data.database.model.CatFactEntity fact, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}