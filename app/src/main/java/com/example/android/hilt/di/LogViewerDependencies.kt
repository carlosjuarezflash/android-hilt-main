package com.example.android.hilt.di

import com.example.baseapp.data.LoggerDataSource
import com.example.baseapp.util.DateFormatter
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@EntryPoint
@InstallIn(SingletonComponent::class)
interface LogViewerDependencies {

    @InMemoryLogger
    fun loggerDataSource(): LoggerDataSource

    fun dateFormatter(): DateFormatter

}