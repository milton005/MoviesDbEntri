package com.example.moviedb_entri.data.remote

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.moviedb_entri.models.MovieResponse
import com.example.moviedb_entri.Util.safeApiCall
import com.example.moviedb_entri.data.remote.NetworkDataSource.Companion.ERROR_MESSAGE
import java.io.IOException

class NetworkDataSourceImpl(val  apiService: ApiService) :NetworkDataSource{
    private val _downloadedMovieList = MutableLiveData<Result<MovieResponse>>()
    override val downloadedMovieList: LiveData<Result<MovieResponse>>
        get() =_downloadedMovieList

    override suspend fun loadMoviesRemote(page: Int, language: String, api_key: String) {
        safeApiCall(
            networkBlock = { fetchMoviesRemote(page, language,api_key) },
            failureBlock = { _downloadedMovieList.postValue(Result.failure(it)) },
            errorMessage = ERROR_MESSAGE)

    }

    private suspend fun fetchMoviesRemote(page: Int, language: String, apiKey: String) {
        val response = apiService.getMoviesRemote(page, language,apiKey).await()

        if (response.isSuccessful) {

            response.body()?.let {

                _downloadedMovieList.postValue(Result.success(it))
            } ?: throw IOException(" Throwing exception ${response.code()} ${response.message()}")

        } else throw IOException(" Throwing exception ${response.code()} ${response.message()}")
    }

}