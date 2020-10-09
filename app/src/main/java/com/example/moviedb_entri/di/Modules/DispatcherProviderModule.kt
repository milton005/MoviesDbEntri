package com.example.moviedb_entri.di.Modules

import com.example.moviedb_entri.data.DispatcherProvider

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import kotlinx.coroutines.Dispatchers

@Module
@InstallIn(ApplicationComponent::class)
class DispatcherProviderModule {

    @Provides
    fun provideCoroutinesDispatcherProvider(): DispatcherProvider = DispatcherProvider(
        Dispatchers.Main,
        Dispatchers.IO,
        Dispatchers.Default
    )
}