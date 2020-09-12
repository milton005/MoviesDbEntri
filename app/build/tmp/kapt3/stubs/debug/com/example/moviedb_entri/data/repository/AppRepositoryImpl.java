package com.example.moviedb_entri.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 12\u00020\u0001:\u000212B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001fH\u0016J\u001c\u0010!\u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020#H\u0002J\u0018\u0010%\u001a\u00020#2\u0006\u0010\"\u001a\u00020#2\u0006\u0010&\u001a\u00020#H\u0002J\u0014\u0010\'\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020)0(H\u0002J\u0014\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0+0\u0012H\u0016J\b\u0010,\u001a\u00020#H\u0002J\u0010\u0010-\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020/H\u0002J\b\u00100\u001a\u00020\u001fH\u0016R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u000e\u001a\f\u0012\b\u0012\u00060\u000fj\u0002`\u00100\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00128VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\f\u0012\b\u0012\u00060\u000fj\u0002`\u00100\u00128VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00063"}, d2 = {"Lcom/example/moviedb_entri/data/repository/AppRepositoryImpl;", "Lcom/example/moviedb_entri/data/repository/AppRepository;", "dbRepoMapper", "Lcom/example/moviedb_entri/data/local/DbRepoMapper;", "movieEntityDao", "Lcom/example/moviedb_entri/data/local/MovieDao;", "networkDataSource", "Lcom/example/moviedb_entri/data/remote/NetworkDataSource;", "dispatcherProvider", "Lcom/example/moviedb_entri/data/DispatcherProvider;", "(Lcom/example/moviedb_entri/data/local/DbRepoMapper;Lcom/example/moviedb_entri/data/local/MovieDao;Lcom/example/moviedb_entri/data/remote/NetworkDataSource;Lcom/example/moviedb_entri/data/DispatcherProvider;)V", "_isFetchInProgress", "Landroidx/lifecycle/MutableLiveData;", "", "_networkError", "Ljava/lang/Exception;", "Lkotlin/Exception;", "isFetchInProgress", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "networkError", "getNetworkError", "pagedListConfig", "Landroidx/paging/PagedList$Config;", "getPagedListConfig", "()Landroidx/paging/PagedList$Config;", "parentJob", "Lkotlinx/coroutines/CompletableJob;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "cancelAllRequests", "", "clearCache", "fetchMOviesNetworkAndPersist", "page", "", "per_page", "getActualPageSize", "numOfRows", "getAllReposPagedFactory", "Landroidx/paging/DataSource$Factory;", "Lcom/example/moviedb_entri/models/ResultsItem;", "getLiveDataPagedList", "Landroidx/paging/PagedList;", "getNumOfRows", "persistDownloadedMovieList", "response", "Lcom/example/moviedb_entri/models/MovieResponse;", "refreshReposList", "Companion", "RepoBoundaryCallback", "app_debug"})
public final class AppRepositoryImpl implements com.example.moviedb_entri.data.repository.AppRepository {
    @org.jetbrains.annotations.NotNull()
    private final androidx.paging.PagedList.Config pagedListConfig = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isFetchInProgress = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Exception> _networkError = null;
    private final kotlinx.coroutines.CompletableJob parentJob = null;
    private final kotlinx.coroutines.CoroutineScope scope = null;
    private final com.example.moviedb_entri.data.local.DbRepoMapper dbRepoMapper = null;
    private final com.example.moviedb_entri.data.local.MovieDao movieEntityDao = null;
    private final com.example.moviedb_entri.data.remote.NetworkDataSource networkDataSource = null;
    private final com.example.moviedb_entri.data.DispatcherProvider dispatcherProvider = null;
    private static final java.lang.String TAG = null;
    private static final java.lang.String TAG_REPO_BOUNDARY_CALLBACK = null;
    public static final com.example.moviedb_entri.data.repository.AppRepositoryImpl.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.paging.PagedList.Config getPagedListConfig() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.lang.Boolean> isFetchInProgress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.lang.Exception> getNetworkError() {
        return null;
    }
    
    @java.lang.Override()
    public void clearCache() {
    }
    
    @java.lang.Override()
    public void refreshReposList() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<androidx.paging.PagedList<com.example.moviedb_entri.models.ResultsItem>> getLiveDataPagedList() {
        return null;
    }
    
    private final androidx.paging.DataSource.Factory<java.lang.Integer, com.example.moviedb_entri.models.ResultsItem> getAllReposPagedFactory() {
        return null;
    }
    
    private final void persistDownloadedMovieList(com.example.moviedb_entri.models.MovieResponse response) {
    }
    
    private final void fetchMOviesNetworkAndPersist(int page, int per_page) {
    }
    
    private final int getNumOfRows() {
        return 0;
    }
    
    private final int getActualPageSize(int page, int numOfRows) {
        return 0;
    }
    
    @java.lang.Override()
    public void cancelAllRequests() {
    }
    
    public AppRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.example.moviedb_entri.data.local.DbRepoMapper dbRepoMapper, @org.jetbrains.annotations.NotNull()
    com.example.moviedb_entri.data.local.MovieDao movieEntityDao, @org.jetbrains.annotations.NotNull()
    com.example.moviedb_entri.data.remote.NetworkDataSource networkDataSource, @org.jetbrains.annotations.NotNull()
    com.example.moviedb_entri.data.DispatcherProvider dispatcherProvider) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0002\u00a8\u0006\t"}, d2 = {"Lcom/example/moviedb_entri/data/repository/AppRepositoryImpl$RepoBoundaryCallback;", "Landroidx/paging/PagedList$BoundaryCallback;", "Lcom/example/moviedb_entri/models/ResultsItem;", "(Lcom/example/moviedb_entri/data/repository/AppRepositoryImpl;)V", "onItemAtEndLoaded", "", "itemAtEnd", "onZeroItemsLoaded", "requestAndSaveData", "app_debug"})
    public final class RepoBoundaryCallback extends androidx.paging.PagedList.BoundaryCallback<com.example.moviedb_entri.models.ResultsItem> {
        
        /**
         * Database returned 0 items. We should query the backend for more items.
         */
        @java.lang.Override()
        public void onZeroItemsLoaded() {
        }
        
        /**
         * When all items in the database were loaded, we need to query the backend for more items.
         */
        @java.lang.Override()
        public void onItemAtEndLoaded(@org.jetbrains.annotations.NotNull()
        com.example.moviedb_entri.models.ResultsItem itemAtEnd) {
        }
        
        private final void requestAndSaveData() {
        }
        
        public RepoBoundaryCallback() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/moviedb_entri/data/repository/AppRepositoryImpl$Companion;", "", "()V", "TAG", "", "TAG_REPO_BOUNDARY_CALLBACK", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}