package com.example.moviedb_entri.data.remote

import androidx.lifecycle.LiveData
import com.example.moviedb_entri.models.MovieResponse

interface NetworkDataSource {

    val downloadedMovieList: LiveData<Result<MovieResponse>>
    suspend fun loadMoviesRemote(page: Int, language:String,api_key :String)

    companion object {
        const val ERROR_MESSAGE = "Error loading movies"
    }
}