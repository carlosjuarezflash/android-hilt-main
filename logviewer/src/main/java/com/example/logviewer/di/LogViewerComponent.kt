package com.example.logviewer.di

import android.content.Context
import com.example.android.hilt.di.LogViewerDependencies
import com.example.android.hilt.ui.LogsFragment
import dagger.BindsInstance
import dagger.Component

@Component(dependencies = [LogViewerDependencies::class])
interface LogViewerComponent {

    fun inject(fragment: LogsFragment)

    @Component.Builder
    interface Builder {
        fun context(@BindsInstance context: Context): Builder
        fun appDependencies(logViewerDependencies: LogViewerDependencies): Builder
        fun build(): LogViewerComponent
    }

}