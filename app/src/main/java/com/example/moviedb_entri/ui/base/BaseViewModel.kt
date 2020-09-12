package com.sheraz.listrepos.ui.modules.base

import androidx.databinding.ObservableBoolean
import androidx.lifecycle.ViewModel


abstract class BaseViewModel: ViewModel() {


    val isLoading = ObservableBoolean(false)


    init {

    }


    fun getIsLoading(): ObservableBoolean {
        return isLoading
    }

    fun setIsLoading(loading: Boolean) {
        isLoading.set(loading)
    }

    override fun onCleared() {
        super.onCleared()
    }

    companion object {
        private val TAG = BaseViewModel::class.java.simpleName
    }
}