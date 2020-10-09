package com.example.moviedb_entri.di.Modules

import com.example.moviedb_entri.data.local.MovieDao
import com.example.moviedb_entri.data.local.MovieDatabase

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent


@Module
@InstallIn(ApplicationComponent::class)
class DaoModule {

    @Provides
    fun provideMovieDbDao(database: MovieDatabase): MovieDao = database.MovieEntityDao()

}