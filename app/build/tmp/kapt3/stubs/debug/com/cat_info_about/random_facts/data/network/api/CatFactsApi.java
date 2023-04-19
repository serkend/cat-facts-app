package com.cat_info_about.random_facts.data.network.api;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Lcom/cat_info_about/random_facts/data/network/api/CatFactsApi;", "", "getCatFacts", "Lretrofit2/Response;", "", "Lcom/cat_info_about/random_facts/data/network/model/CatFactModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public abstract interface CatFactsApi {
    @org.jetbrains.annotations.NotNull()
    public static final com.cat_info_about.random_facts.data.network.api.CatFactsApi.Companion Companion = null;
    public static final int FactsCount = 100;
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/facts/random?amount=100")
    public abstract java.lang.Object getCatFacts(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<com.cat_info_about.random_facts.data.network.model.CatFactModel>>> continuation);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/cat_info_about/random_facts/data/network/api/CatFactsApi$Companion;", "", "()V", "FactsCount", "", "app_debug"})
    public static final class Companion {
        public static final int FactsCount = 100;
        
        private Companion() {
            super();
        }
    }
}