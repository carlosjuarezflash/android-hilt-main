package com.example.baseapp.di

import android.content.Context
import androidx.room.Room
import com.example.baseapp.data.AppDatabase
import com.example.baseapp.data.LogDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class DatabaseModule {

    @Provides
    fun provideLogDao(database: com.example.baseapp.data.AppDatabase): com.example.baseapp.data.LogDao {
        return database.logDao()
    }

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext appContext: Context): com.example.baseapp.data.AppDatabase {
        return Room.databaseBuilder(
            appContext,
            com.example.baseapp.data.AppDatabase::class.java,
            "logging.db"
        ).build()
    }
}