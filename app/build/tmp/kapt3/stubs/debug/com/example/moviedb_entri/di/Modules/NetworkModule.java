package com.example.moviedb_entri.di.Modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fH\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0006H\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0004H\u0007J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0014H\u0007J \u0010\u001e\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u000eH\u0007\u00a8\u0006\""}, d2 = {"Lcom/example/moviedb_entri/di/Modules/NetworkModule;", "", "()V", "getHttpLoggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "provideApiService", "Lcom/example/moviedb_entri/data/remote/ApiService;", "retrofit", "Lretrofit2/Retrofit;", "provideCallAdapterFactory", "Lcom/jakewharton/retrofit2/adapter/kotlin/coroutines/CoroutineCallAdapterFactory;", "provideGson", "Lcom/google/gson/Gson;", "provideGsonConverterFactory", "Lretrofit2/converter/gson/GsonConverterFactory;", "gson", "provideNetworkDataSource", "Lcom/example/moviedb_entri/data/remote/NetworkDataSource;", "apiService", "provideOkHttp3Downloader", "Lcom/squareup/picasso/OkHttp3Downloader;", "okHttpClient", "Lokhttp3/OkHttpClient;", "provideOkHttpClient", "context", "Landroid/content/Context;", "httpLoggingInterceptor", "providePicasso", "Lcom/squareup/picasso/Picasso;", "okHttp3Downloader", "provideRetrofit", "coroutineCallAdapterFactory", "gsonConverterFactory", "Companion", "app_debug"})
@dagger.Module()
public final class NetworkModule {
    private static final long CACHE_SIZE = 10485760L;
    private static final java.lang.String BASE_URL = "https://api.themoviedb.org/3/movie/";
    public static final com.example.moviedb_entri.di.Modules.NetworkModule.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.logging.HttpLoggingInterceptor getHttpLoggingInterceptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.OkHttpClient provideOkHttpClient(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    okhttp3.logging.HttpLoggingInterceptor httpLoggingInterceptor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.squareup.picasso.OkHttp3Downloader provideOkHttp3Downloader(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.squareup.picasso.Picasso providePicasso(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.squareup.picasso.OkHttp3Downloader okHttp3Downloader) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory provideCallAdapterFactory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.google.gson.Gson provideGson() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final retrofit2.converter.gson.GsonConverterFactory provideGsonConverterFactory(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient, @org.jetbrains.annotations.NotNull()
    com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory coroutineCallAdapterFactory, @org.jetbrains.annotations.NotNull()
    retrofit2.converter.gson.GsonConverterFactory gsonConverterFactory) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.moviedb_entri.data.remote.ApiService provideApiService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.moviedb_entri.data.remote.NetworkDataSource provideNetworkDataSource(@org.jetbrains.annotations.NotNull()
    com.example.moviedb_entri.data.remote.ApiService apiService) {
        return null;
    }
    
    public NetworkModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/example/moviedb_entri/di/Modules/NetworkModule$Companion;", "", "()V", "BASE_URL", "", "CACHE_SIZE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}