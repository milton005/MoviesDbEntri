package com.example.moviedb_entri.data

import kotlinx.coroutines.CoroutineDispatcher

data class DispatcherProvider (
    val mainDispatcher: CoroutineDispatcher,
    val ioDispatcher: CoroutineDispatcher,
    val computationDispatcher: CoroutineDispatcher
)