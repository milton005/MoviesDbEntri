package com.example.moviedb_entri.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J)\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J)\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0014H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR#\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\f8VX\u0096\u0004\u00f8\u0001\u0000\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Lcom/example/moviedb_entri/data/remote/NetworkDataSourceImpl;", "Lcom/example/moviedb_entri/data/remote/NetworkDataSource;", "apiService", "Lcom/example/moviedb_entri/data/remote/ApiService;", "(Lcom/example/moviedb_entri/data/remote/ApiService;)V", "_downloadedMovieList", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Result;", "Lcom/example/moviedb_entri/models/MovieResponse;", "getApiService", "()Lcom/example/moviedb_entri/data/remote/ApiService;", "downloadedMovieList", "Landroidx/lifecycle/LiveData;", "getDownloadedMovieList", "()Landroidx/lifecycle/LiveData;", "fetchMoviesRemote", "", "page", "", "language", "", "apiKey", "(ILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadMoviesRemote", "api_key", "app_debug"})
public final class NetworkDataSourceImpl implements com.example.moviedb_entri.data.remote.NetworkDataSource {
    private final androidx.lifecycle.MutableLiveData<kotlin.Result<com.example.moviedb_entri.models.MovieResponse>> _downloadedMovieList = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.moviedb_entri.data.remote.ApiService apiService = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<kotlin.Result<com.example.moviedb_entri.models.MovieResponse>> getDownloadedMovieList() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object loadMoviesRemote(int page, @org.jetbrains.annotations.NotNull()
    java.lang.String language, @org.jetbrains.annotations.NotNull()
    java.lang.String api_key, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p3) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.moviedb_entri.data.remote.ApiService getApiService() {
        return null;
    }
    
    public NetworkDataSourceImpl(@org.jetbrains.annotations.NotNull()
    com.example.moviedb_entri.data.remote.ApiService apiService) {
        super();
    }
}