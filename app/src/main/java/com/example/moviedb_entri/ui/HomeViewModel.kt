package com.example.moviedb_entri.ui

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.paging.PagedList
import com.example.moviedb_entri.models.ResultsItem
import com.example.moviedb_entri.data.repository.AppRepository
import com.sheraz.listrepos.ui.modules.base.BaseViewModel
import javax.inject.Inject

class HomeViewModel @ViewModelInject constructor(private val appRepository: AppRepository):BaseViewModel() {
    init {

        setIsLoading(false)
    }

    fun getPagedListAsLiveData(): LiveData<PagedList<ResultsItem>> = appRepository.getLiveDataPagedList()

    fun getLoadingLiveData(): LiveData<Boolean> = appRepository.isFetchInProgress

    fun getNetworkErrorLiveData(): LiveData<Exception> = appRepository.networkError

    fun onRefresh() = appRepository.refreshReposList()

    fun onClearCache() = appRepository.clearCache()

    override fun onCleared() {


        super.onCleared()
        appRepository.cancelAllRequests()

    }
}