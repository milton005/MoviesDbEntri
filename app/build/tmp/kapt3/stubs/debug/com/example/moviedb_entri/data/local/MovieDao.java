package com.example.moviedb_entri.data.local;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0014\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H\'J\u0014\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\tH\'J\b\u0010\n\u001a\u00020\u0003H\'J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\'J\u0016\u0010\u000e\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\'\u00a8\u0006\u0010"}, d2 = {"Lcom/example/moviedb_entri/data/local/MovieDao;", "", "deleteAll", "", "getAll", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/moviedb_entri/data/local/MovieDbEntity;", "getAllMoviePaged", "Landroidx/paging/DataSource$Factory;", "getNumOfRows", "insert", "", "movieEntity", "insertList", "MovieRepoEntityList", "app_debug"})
public abstract interface MovieDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.example.moviedb_entri.data.local.MovieDbEntity movieEntity);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.moviedb_entri.data.local.MovieDbEntity> MovieRepoEntityList);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM movie_table")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.moviedb_entri.data.local.MovieDbEntity>> getAll();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM movie_table")
    public abstract androidx.paging.DataSource.Factory<java.lang.Integer, com.example.moviedb_entri.data.local.MovieDbEntity> getAllMoviePaged();
    
    @androidx.room.Query(value = "DELETE FROM movie_table")
    public abstract int deleteAll();
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM movie_table")
    public abstract int getNumOfRows();
}