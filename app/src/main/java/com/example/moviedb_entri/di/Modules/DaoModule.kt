package com.example.moviedb_entri.di.Modules

import com.example.moviedb_entri.data.local.MovieDao
import com.example.moviedb_entri.data.local.MovieDatabase

import dagger.Module
import dagger.Provides


@Module
class DaoModule {

    @Provides
    fun provideGitHubRepoEntityDao(database: MovieDatabase): MovieDao = database.MovieEntityDao()

}