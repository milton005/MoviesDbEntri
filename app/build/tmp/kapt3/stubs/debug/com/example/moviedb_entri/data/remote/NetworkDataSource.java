package com.example.moviedb_entri.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010J)\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR!\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003X\u00a6\u0004\u00f8\u0001\u0000\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/example/moviedb_entri/data/remote/NetworkDataSource;", "", "downloadedMovieList", "Landroidx/lifecycle/LiveData;", "Lkotlin/Result;", "Lcom/example/moviedb_entri/models/MovieResponse;", "getDownloadedMovieList", "()Landroidx/lifecycle/LiveData;", "loadMoviesRemote", "", "page", "", "language", "", "api_key", "(ILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public abstract interface NetworkDataSource {
    public static final com.example.moviedb_entri.data.remote.NetworkDataSource.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ERROR_MESSAGE = "Error loading movies";
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<kotlin.Result<com.example.moviedb_entri.models.MovieResponse>> getDownloadedMovieList();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object loadMoviesRemote(int page, @org.jetbrains.annotations.NotNull()
    java.lang.String language, @org.jetbrains.annotations.NotNull()
    java.lang.String api_key, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p3);
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/moviedb_entri/data/remote/NetworkDataSource$Companion;", "", "()V", "ERROR_MESSAGE", "", "app_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ERROR_MESSAGE = "Error loading movies";
        
        private Companion() {
            super();
        }
    }
}