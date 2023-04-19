package com.cat_info_about.random_facts.data.database.instance;

import java.lang.System;

@androidx.room.Database(entities = {com.cat_info_about.random_facts.data.database.model.CatFactEntity.class}, version = 1)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/cat_info_about/random_facts/data/database/instance/FactsDatabase;", "Landroidx/room/RoomDatabase;", "()V", "getDao", "Lcom/cat_info_about/random_facts/data/database/dao/CatFactsDao;", "app_debug"})
public abstract class FactsDatabase extends androidx.room.RoomDatabase {
    
    public FactsDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.cat_info_about.random_facts.data.database.dao.CatFactsDao getDao();
}