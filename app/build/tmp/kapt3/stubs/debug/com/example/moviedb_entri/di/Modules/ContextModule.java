package com.example.moviedb_entri.di.Modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0002\u001a\u00020\u0003H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/moviedb_entri/di/Modules/ContextModule;", "", "appContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "app_debug"})
@dagger.Module()
public final class ContextModule {
    private final android.content.Context appContext = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final android.content.Context appContext() {
        return null;
    }
    
    public ContextModule(@org.jetbrains.annotations.NotNull()
    android.content.Context appContext) {
        super();
    }
}