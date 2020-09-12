package com.example.moviedb_entri.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015J\b\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u000fH&J\u0014\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0003H&J\b\u0010\u0014\u001a\u00020\u000fH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0002\u0010\u0005R\u001c\u0010\u0006\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0016"}, d2 = {"Lcom/example/moviedb_entri/data/repository/AppRepository;", "", "isFetchInProgress", "Landroidx/lifecycle/LiveData;", "", "()Landroidx/lifecycle/LiveData;", "networkError", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getNetworkError", "pagedListConfig", "Landroidx/paging/PagedList$Config;", "getPagedListConfig", "()Landroidx/paging/PagedList$Config;", "cancelAllRequests", "", "clearCache", "getLiveDataPagedList", "Landroidx/paging/PagedList;", "Lcom/example/moviedb_entri/models/ResultsItem;", "refreshReposList", "Companion", "app_debug"})
public abstract interface AppRepository {
    public static final com.example.moviedb_entri.data.repository.AppRepository.Companion Companion = null;
    public static final int NETWORK_PAGE_SIZE = 20;
    public static final int DATABASE_PAGE_SIZE = 20;
    public static final int PREFETCH_DISTANCE = 5;
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.paging.PagedList.Config getPagedListConfig();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.lang.Boolean> isFetchInProgress();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.lang.Exception> getNetworkError();
    
    public abstract void clearCache();
    
    public abstract void refreshReposList();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<androidx.paging.PagedList<com.example.moviedb_entri.models.ResultsItem>> getLiveDataPagedList();
    
    public abstract void cancelAllRequests();
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/example/moviedb_entri/data/repository/AppRepository$Companion;", "", "()V", "DATABASE_PAGE_SIZE", "", "NETWORK_PAGE_SIZE", "PREFETCH_DISTANCE", "app_debug"})
    public static final class Companion {
        public static final int NETWORK_PAGE_SIZE = 20;
        public static final int DATABASE_PAGE_SIZE = 20;
        public static final int PREFETCH_DISTANCE = 5;
        
        private Companion() {
            super();
        }
    }
}