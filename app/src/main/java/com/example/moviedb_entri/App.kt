package com.example.moviedb_entri

import android.app.Application
import com.example.moviedb_entri.di.Components.AppComponent
import com.example.moviedb_entri.di.Components.DaggerAppComponent
import com.example.moviedb_entri.di.Modules.ContextModule


class App : Application() {

    lateinit var component: AppComponent
        private set

    override fun onCreate() {
        super.onCreate()
        INSTANCE = this
        component = DaggerAppComponent.builder()
            .contextModule(ContextModule(this))
            .build()


    }

    companion object {
        private val TAG = App::class.java.simpleName

        private var INSTANCE: App? = null

        fun get(): App = INSTANCE!!
    }
}

class Injector private constructor() {
    companion object {
        fun get() : AppComponent = App.get().component
    }
}