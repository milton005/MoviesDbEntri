package com.example.moviedb_entri.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0014\u0010\r\u001a\u00020\n2\n\u0010\u000e\u001a\u00060\u000fj\u0002`\u0010H\u0002J\b\u0010\u0011\u001a\u00020\nH\u0002J\u0012\u0010\u0012\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J \u0010\u0015\u001a\u00020\n2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\fH\u0002J\u0006\u0010\u001a\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/example/moviedb_entri/ui/HomeActivity;", "Lcom/sheraz/listrepos/ui/modules/base/BaseActivity;", "()V", "activityHomeBinding", "Lcom/example/moviedb_entri/databinding/ActivityMainBinding;", "homeAdapter", "Lcom/example/moviedb_entri/ui/Adapter/HomeAdapter;", "viewModel", "Lcom/example/moviedb_entri/ui/HomeViewModel;", "handleFetchInProgress", "", "isFetchInProgress", "", "handleNetworkError", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "initUI", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "submitList", "pagedList", "Landroidx/paging/PagedList;", "Lcom/example/moviedb_entri/models/ResultsItem;", "isRefreshing", "subscribeUi", "app_debug"})
public final class HomeActivity extends com.sheraz.listrepos.ui.modules.base.BaseActivity {
    private com.example.moviedb_entri.ui.HomeViewModel viewModel;
    private com.example.moviedb_entri.databinding.ActivityMainBinding activityHomeBinding;
    private final com.example.moviedb_entri.ui.Adapter.HomeAdapter homeAdapter = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initUI() {
    }
    
    public final void subscribeUi() {
    }
    
    private final void submitList(androidx.paging.PagedList<com.example.moviedb_entri.models.ResultsItem> pagedList, boolean isRefreshing) {
    }
    
    private final void handleFetchInProgress(boolean isFetchInProgress) {
    }
    
    private final void handleNetworkError(java.lang.Exception exception) {
    }
    
    public HomeActivity() {
        super();
    }
}