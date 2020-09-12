package com.example.moviedb_entri.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [MovieDbEntity::class],
    version = 1,
    exportSchema = false
)
abstract class MovieDatabase :RoomDatabase(){
    abstract fun MovieEntityDao(): MovieDao
}