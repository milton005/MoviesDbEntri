package com.example.moviedb_entri

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App : Application() {




    override fun onCreate() {
        super.onCreate()




    }

    companion object {
        private val TAG = App::class.java.simpleName


    }
}

