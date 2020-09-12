package com.example.moviedb_entri.di.Modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007\u00a8\u0006\r"}, d2 = {"Lcom/example/moviedb_entri/di/Modules/RepositoryModule;", "", "()V", "provideAppRepository", "Lcom/example/moviedb_entri/data/repository/AppRepository;", "dbRepoMapper", "Lcom/example/moviedb_entri/data/local/DbRepoMapper;", "dao", "Lcom/example/moviedb_entri/data/local/MovieDao;", "networkDataSource", "Lcom/example/moviedb_entri/data/remote/NetworkDataSource;", "dispatcherProvider", "Lcom/example/moviedb_entri/data/DispatcherProvider;", "app_debug"})
@dagger.Module()
public final class RepositoryModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.moviedb_entri.data.repository.AppRepository provideAppRepository(@org.jetbrains.annotations.NotNull()
    com.example.moviedb_entri.data.local.DbRepoMapper dbRepoMapper, @org.jetbrains.annotations.NotNull()
    com.example.moviedb_entri.data.local.MovieDao dao, @org.jetbrains.annotations.NotNull()
    com.example.moviedb_entri.data.remote.NetworkDataSource networkDataSource, @org.jetbrains.annotations.NotNull()
    com.example.moviedb_entri.data.DispatcherProvider dispatcherProvider) {
        return null;
    }
    
    public RepositoryModule() {
        super();
    }
}