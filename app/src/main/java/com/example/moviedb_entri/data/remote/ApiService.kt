package com.example.moviedb_entri.data.remote

import com.example.moviedb_entri.models.MovieResponse
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("popular?")
    fun getMoviesRemote(
        @Query("page") page: Int,
        @Query("language") language: String,
        @Query("api_key") apikey:String
    ) : Deferred<Response<MovieResponse>>

}