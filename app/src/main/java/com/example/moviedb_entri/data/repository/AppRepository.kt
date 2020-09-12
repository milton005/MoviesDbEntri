package com.example.moviedb_entri.data.repository

import androidx.lifecycle.LiveData
import androidx.paging.PagedList
import com.example.moviedb_entri.models.ResultsItem


interface AppRepository {

    val pagedListConfig: PagedList.Config


    val isFetchInProgress: LiveData<Boolean>
    val networkError: LiveData<Exception>

    fun clearCache()
    fun refreshReposList()
    fun getLiveDataPagedList() : LiveData<PagedList<ResultsItem>>
    fun cancelAllRequests()



    companion object {
        const val NETWORK_PAGE_SIZE = 20
        const val DATABASE_PAGE_SIZE = 20
        const val PREFETCH_DISTANCE = 5
    }
}