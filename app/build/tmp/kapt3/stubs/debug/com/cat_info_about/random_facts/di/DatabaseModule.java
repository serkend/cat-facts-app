package com.cat_info_about.random_facts.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/cat_info_about/random_facts/di/DatabaseModule;", "", "()V", "DATABASE_NAME", "", "provideDao", "Lcom/cat_info_about/random_facts/data/database/dao/CatFactsDao;", "database", "Lcom/cat_info_about/random_facts/data/database/instance/FactsDatabase;", "provideDatabase", "context", "Landroid/app/Application;", "app_debug"})
@dagger.Module()
public final class DatabaseModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.cat_info_about.random_facts.di.DatabaseModule INSTANCE = null;
    private static final java.lang.String DATABASE_NAME = "facts_database";
    
    private DatabaseModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.cat_info_about.random_facts.data.database.instance.FactsDatabase provideDatabase(@org.jetbrains.annotations.NotNull()
    android.app.Application context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.cat_info_about.random_facts.data.database.dao.CatFactsDao provideDao(@org.jetbrains.annotations.NotNull()
    com.cat_info_about.random_facts.data.database.instance.FactsDatabase database) {
        return null;
    }
}