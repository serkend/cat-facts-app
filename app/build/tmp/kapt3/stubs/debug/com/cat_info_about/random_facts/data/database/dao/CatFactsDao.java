package com.cat_info_about.random_facts.data.database.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH\'J\u0019\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/cat_info_about/random_facts/data/database/dao/CatFactsDao;", "", "deleteFact", "", "fact", "Lcom/cat_info_about/random_facts/data/database/model/CatFactEntity;", "(Lcom/cat_info_about/random_facts/data/database/model/CatFactEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFactsFromDb", "Lkotlinx/coroutines/flow/Flow;", "", "insertFact", "app_debug"})
public abstract interface CatFactsDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * from facts_table")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.cat_info_about.random_facts.data.database.model.CatFactEntity>> getFactsFromDb();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert()
    public abstract java.lang.Object insertFact(@org.jetbrains.annotations.NotNull()
    com.cat_info_about.random_facts.data.database.model.CatFactEntity fact, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object deleteFact(@org.jetbrains.annotations.NotNull()
    com.cat_info_about.random_facts.data.database.model.CatFactEntity fact, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}