package com.example.moviedb_entri.di.Modules

import android.content.Context
import androidx.room.Room
import com.example.moviedb_entri.data.local.MovieDatabase

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(context: Context): MovieDatabase {
        return Room.databaseBuilder(
            context.applicationContext,
            MovieDatabase::class.java, "movie_db"
        ).build()
    }

}