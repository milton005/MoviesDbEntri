package com.example.moviedb_entri.di.Modules

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides


@Module
class ContextModule(private val appContext: Context) {

    @Provides
    fun appContext(): Context = appContext

}