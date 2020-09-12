package com.example.moviedb_entri.data.local

import androidx.lifecycle.LiveData
import androidx.paging.DataSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface MovieDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(movieEntity:  MovieDbEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertList(MovieRepoEntityList: List<MovieDbEntity>)

    @Query("SELECT * FROM movie_table")
    fun getAll(): LiveData<List<MovieDbEntity>>

    @Query("SELECT * FROM movie_table")
    fun getAllMoviePaged(): DataSource.Factory<Int, MovieDbEntity>

    @Query("DELETE FROM movie_table")
    fun deleteAll(): Int

    @Query("SELECT COUNT(*) FROM movie_table")
    fun getNumOfRows(): Int

}