package com.example.moviedb_entri.ui.Adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00142\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0003\u0014\u0015\u0016B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\bR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/example/moviedb_entri/ui/Adapter/HomeAdapter;", "Landroidx/paging/PagedListAdapter;", "Lcom/example/moviedb_entri/models/ResultsItem;", "Lcom/example/moviedb_entri/ui/Adapter/HomeAdapter$ViewHolder;", "mPicasso", "Lcom/squareup/picasso/Picasso;", "(Lcom/squareup/picasso/Picasso;)V", "mListener", "Lcom/example/moviedb_entri/ui/Adapter/HomeAdapter$DetailListener;", "onBindViewHolder", "", "viewHolder", "position", "", "onCreateViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "view_type", "setListener", "listener", "Companion", "DetailListener", "ViewHolder", "app_debug"})
public final class HomeAdapter extends androidx.paging.PagedListAdapter<com.example.moviedb_entri.models.ResultsItem, com.example.moviedb_entri.ui.Adapter.HomeAdapter.ViewHolder> {
    private com.example.moviedb_entri.ui.Adapter.HomeAdapter.DetailListener mListener;
    private final com.squareup.picasso.Picasso mPicasso = null;
    private static final java.lang.String TAG = null;
    public static final com.example.moviedb_entri.ui.Adapter.HomeAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.moviedb_entri.ui.Adapter.HomeAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup viewGroup, int view_type) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.moviedb_entri.ui.Adapter.HomeAdapter.ViewHolder viewHolder, int position) {
    }
    
    public final void setListener(@org.jetbrains.annotations.NotNull()
    com.example.moviedb_entri.ui.Adapter.HomeAdapter.DetailListener listener) {
    }
    
    public HomeAdapter(@org.jetbrains.annotations.NotNull()
    com.squareup.picasso.Picasso mPicasso) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0012\u0010\t\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\u0012\u0010\n\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0002\u00a8\u0006\f"}, d2 = {"Lcom/example/moviedb_entri/ui/Adapter/HomeAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "v", "Landroid/view/View;", "(Lcom/example/moviedb_entri/ui/Adapter/HomeAdapter;Landroid/view/View;)V", "bind", "", "movieItem", "Lcom/example/moviedb_entri/models/ResultsItem;", "handleClicks", "setUpViews", "item", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public final void bind(@org.jetbrains.annotations.Nullable()
        com.example.moviedb_entri.models.ResultsItem movieItem) {
        }
        
        private final void setUpViews(com.example.moviedb_entri.models.ResultsItem item) {
        }
        
        private final void handleClicks(com.example.moviedb_entri.models.ResultsItem movieItem) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/moviedb_entri/ui/Adapter/HomeAdapter$DetailListener;", "", "DetailListener", "", "item", "Lcom/example/moviedb_entri/models/ResultsItem;", "app_debug"})
    public static abstract interface DetailListener {
        
        public abstract void DetailListener(@org.jetbrains.annotations.Nullable()
        com.example.moviedb_entri.models.ResultsItem item);
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/moviedb_entri/ui/Adapter/HomeAdapter$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}