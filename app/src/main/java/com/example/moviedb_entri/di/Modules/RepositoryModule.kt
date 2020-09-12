package com.example.moviedb_entri.di.Modules


import com.example.moviedb_entri.data.DispatcherProvider
import com.example.moviedb_entri.data.local.DbRepoMapper
import com.example.moviedb_entri.data.local.MovieDao
import com.example.moviedb_entri.data.remote.NetworkDataSource
import com.example.moviedb_entri.data.repository.AppRepository
import com.example.moviedb_entri.data.repository.AppRepositoryImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun provideAppRepository(

        dbRepoMapper: DbRepoMapper,
        dao: MovieDao,
        networkDataSource: NetworkDataSource,
        dispatcherProvider: DispatcherProvider
    ): AppRepository = AppRepositoryImpl( dbRepoMapper, dao, networkDataSource, dispatcherProvider)

}