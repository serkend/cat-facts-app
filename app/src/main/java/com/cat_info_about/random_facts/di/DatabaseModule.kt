package com.cat_info_about.random_facts.di

import android.app.Application
import androidx.room.Room
import com.cat_info_about.random_facts.data.database.dao.CatFactsDao
import com.cat_info_about.random_facts.data.database.instance.FactsDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    private const val DATABASE_NAME = "facts_database"

    @Singleton
    @Provides
    fun provideDatabase(context: Application): FactsDatabase = Room.databaseBuilder(
        context.applicationContext,
        FactsDatabase::class.java,
        DATABASE_NAME
    )
        .fallbackToDestructiveMigration()
        .build()

    @Singleton
    @Provides
    fun provideDao(database:FactsDatabase): CatFactsDao = database.getDao()

}