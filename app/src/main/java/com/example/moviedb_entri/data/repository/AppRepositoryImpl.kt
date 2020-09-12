package com.example.moviedb_entri.data.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.paging.DataSource
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.example.moviedb_entri.models.MovieResponse
import com.example.moviedb_entri.models.ResultsItem
import com.example.moviedb_entri.Util.Constants
import com.example.moviedb_entri.data.DispatcherProvider
import com.example.moviedb_entri.data.local.DbRepoMapper
import com.example.moviedb_entri.data.local.MovieDao
import com.example.moviedb_entri.data.remote.NetworkDataSource
import kotlinx.coroutines.*
import kotlin.Exception

class AppRepositoryImpl(


    private val dbRepoMapper: DbRepoMapper,
    private val movieEntityDao: MovieDao,
    private val networkDataSource: NetworkDataSource,
    private val dispatcherProvider: DispatcherProvider

) : AppRepository {

    override val pagedListConfig: PagedList.Config

    private val _isFetchInProgress = MutableLiveData<Boolean>().apply { postValue(false) }
    override val isFetchInProgress: LiveData<Boolean>
        get() = _isFetchInProgress

    private val _networkError = MutableLiveData<Exception>()
    override val networkError: LiveData<Exception>
        get() = _networkError

    private val parentJob = Job()
    private val scope = CoroutineScope(dispatcherProvider.mainDispatcher + parentJob)


    init {


        pagedListConfig =
            PagedList.Config.Builder()
                .setPrefetchDistance(AppRepository.PREFETCH_DISTANCE)
                .setPageSize(AppRepository.DATABASE_PAGE_SIZE)
                .setInitialLoadSizeHint(AppRepository.DATABASE_PAGE_SIZE)
                .setEnablePlaceholders(false)
                .build()


        networkDataSource.downloadedMovieList.observeForever { result ->

            _isFetchInProgress.postValue(false)
            result
                .onSuccess { persistDownloadedMovieList(it) }
                .onFailure { _networkError.postValue(it as Exception)  }

        }
    }

    override fun clearCache() {



        scope.launch(dispatcherProvider.ioDispatcher) {
            try {

                val numOfRowsDeleted = movieEntityDao.deleteAll()


            } catch (e: Exception) {



            }

        }

    }

    override fun refreshReposList() {


        fetchMOviesNetworkAndPersist(-1)

    }

    override fun getLiveDataPagedList() : LiveData<PagedList<ResultsItem>> {


        return LivePagedListBuilder<Int, ResultsItem>(getAllReposPagedFactory(), pagedListConfig).setBoundaryCallback(RepoBoundaryCallback()).build()

    }

    private fun getAllReposPagedFactory() : DataSource.Factory<Int, ResultsItem> {


        return movieEntityDao.getAllMoviePaged().map { dbRepoMapper.fromDb(it) }

    }

    private fun persistDownloadedMovieList(response: MovieResponse) {



        scope.launch(dispatcherProvider.ioDispatcher) {
            try {
                response.results?.let {
                    if (it.isNotEmpty())
                    {

                        movieEntityDao.insertList(it)
                    }
                }


            } catch (e: Exception) {



            }

        }

    }

    private fun fetchMOviesNetworkAndPersist(page: Int = 1, per_page: Int = AppRepository.NETWORK_PAGE_SIZE) {



        scope.launch(dispatcherProvider.ioDispatcher) {

            _isFetchInProgress.postValue(true)
            val numOfRows = getNumOfRows()
            val actualPageSize = getActualPageSize(page, numOfRows)


            networkDataSource.loadMoviesRemote(actualPageSize, Constants.language,Constants.APIKEY)
        }

    }

    private fun getNumOfRows(): Int {
        return movieEntityDao.getNumOfRows()
    }

    private fun getActualPageSize(page: Int, numOfRows: Int): Int {
        return when (page > 0) {
            true -> (numOfRows / AppRepository.NETWORK_PAGE_SIZE) + 1
            false -> 1 // We need to refresh data
        }
    }

    override fun cancelAllRequests() {


        parentJob.cancelChildren()

    }


    inner class RepoBoundaryCallback : PagedList.BoundaryCallback<ResultsItem>() {

        /**
         * Database returned 0 items. We should query the backend for more items.
         */
        override fun onZeroItemsLoaded() {

            requestAndSaveData()
        }

        /**
         * When all items in the database were loaded, we need to query the backend for more items.
         */
        override fun onItemAtEndLoaded(itemAtEnd: ResultsItem) {

            requestAndSaveData()
        }

        private fun requestAndSaveData() {

            if (_isFetchInProgress.value!!) return
            fetchMOviesNetworkAndPersist()

        }
    }



    companion object {
        private val TAG: String = AppRepositoryImpl::class.java.simpleName
        private val TAG_REPO_BOUNDARY_CALLBACK: String = RepoBoundaryCallback::class.java.simpleName
    }
}