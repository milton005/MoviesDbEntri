package com.example.moviedb_entri.di.Modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/example/moviedb_entri/di/Modules/HomeModule;", "", "()V", "provideHomeAdapter", "Lcom/example/moviedb_entri/ui/Adapter/HomeAdapter;", "picasso", "Lcom/squareup/picasso/Picasso;", "provideHomeViewModel", "Lcom/example/moviedb_entri/ui/HomeViewModel;", "appRepository", "Lcom/example/moviedb_entri/data/repository/AppRepository;", "provideViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "homeViewModel", "app_debug"})
@dagger.Module()
public final class HomeModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.moviedb_entri.ui.Adapter.HomeAdapter provideHomeAdapter(@org.jetbrains.annotations.NotNull()
    com.squareup.picasso.Picasso picasso) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final androidx.lifecycle.ViewModelProvider.Factory provideViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.example.moviedb_entri.ui.HomeViewModel homeViewModel) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.moviedb_entri.ui.HomeViewModel provideHomeViewModel(@org.jetbrains.annotations.NotNull()
    com.example.moviedb_entri.data.repository.AppRepository appRepository) {
        return null;
    }
    
    public HomeModule() {
        super();
    }
}