package com.example.moviedb_entri.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0010\u0010\b\u001a\f\u0012\b\u0012\u00060\tj\u0002`\n0\u0006J\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0006J\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\u000fH\u0014J\u0006\u0010\u0011\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/moviedb_entri/ui/HomeViewModel;", "Lcom/sheraz/listrepos/ui/modules/base/BaseViewModel;", "appRepository", "Lcom/example/moviedb_entri/data/repository/AppRepository;", "(Lcom/example/moviedb_entri/data/repository/AppRepository;)V", "getLoadingLiveData", "Landroidx/lifecycle/LiveData;", "", "getNetworkErrorLiveData", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getPagedListAsLiveData", "Landroidx/paging/PagedList;", "Lcom/example/moviedb_entri/models/ResultsItem;", "onClearCache", "", "onCleared", "onRefresh", "app_debug"})
public final class HomeViewModel extends com.sheraz.listrepos.ui.modules.base.BaseViewModel {
    private final com.example.moviedb_entri.data.repository.AppRepository appRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<androidx.paging.PagedList<com.example.moviedb_entri.models.ResultsItem>> getPagedListAsLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getLoadingLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Exception> getNetworkErrorLiveData() {
        return null;
    }
    
    public final void onRefresh() {
    }
    
    public final void onClearCache() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.example.moviedb_entri.data.repository.AppRepository appRepository) {
        super();
    }
}