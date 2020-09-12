package com.example.moviedb_entri.di.Components;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0015H&J\b\u0010\u0016\u001a\u00020\u0017H&\u00a8\u0006\u0018"}, d2 = {"Lcom/example/moviedb_entri/di/Components/AppComponent;", "", "NetworkDataSource", "Lcom/example/moviedb_entri/data/remote/NetworkDataSource;", "apiService", "Lcom/example/moviedb_entri/data/remote/ApiService;", "appContext", "Landroid/content/Context;", "appRepository", "Lcom/example/moviedb_entri/data/repository/AppRepository;", "database", "Lcom/example/moviedb_entri/data/local/MovieDatabase;", "homeAdapter", "Lcom/example/moviedb_entri/ui/Adapter/HomeAdapter;", "homeViewModel", "Lcom/example/moviedb_entri/ui/HomeViewModel;", "movieEntityDao", "Lcom/example/moviedb_entri/data/local/MovieDao;", "picasso", "Lcom/squareup/picasso/Picasso;", "retrofit", "Lretrofit2/Retrofit;", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "app_debug"})
@dagger.Component(modules = {com.example.moviedb_entri.di.Modules.HomeModule.class, com.example.moviedb_entri.di.Modules.ContextModule.class, com.example.moviedb_entri.di.Modules.NetworkModule.class, com.example.moviedb_entri.di.Modules.DispatcherProviderModule.class, com.example.moviedb_entri.di.Modules.DatabaseModule.class, com.example.moviedb_entri.di.Modules.DaoModule.class, com.example.moviedb_entri.di.Modules.RepositoryModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.content.Context appContext();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.moviedb_entri.data.local.MovieDatabase database();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.moviedb_entri.data.local.MovieDao movieEntityDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Retrofit retrofit();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.moviedb_entri.data.remote.ApiService apiService();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.moviedb_entri.data.remote.NetworkDataSource NetworkDataSource();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.squareup.picasso.Picasso picasso();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.moviedb_entri.data.repository.AppRepository appRepository();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.moviedb_entri.ui.Adapter.HomeAdapter homeAdapter();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.moviedb_entri.ui.HomeViewModel homeViewModel();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.ViewModelProvider.Factory viewModelFactory();
}