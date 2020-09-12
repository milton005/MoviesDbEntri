package com.example.moviedb_entri.di.Components

import android.content.Context
import androidx.lifecycle.ViewModelProvider
import com.example.moviedb_entri.ui.Adapter.HomeAdapter
import com.example.moviedb_entri.ui.HomeViewModel
import com.example.moviedb_entri.data.local.MovieDao
import com.example.moviedb_entri.data.local.MovieDatabase
import com.example.moviedb_entri.data.remote.ApiService
import com.example.moviedb_entri.data.remote.NetworkDataSource
import com.example.moviedb_entri.data.repository.AppRepository
import com.example.moviedb_entri.di.Modules.*
import com.squareup.picasso.Picasso
import dagger.Component
import retrofit2.Retrofit
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        HomeModule::class,
        ContextModule::class,
        NetworkModule::class,
        DispatcherProviderModule::class,
        DatabaseModule::class,
        DaoModule::class,
        RepositoryModule::class


    ]
)

interface AppComponent {

    fun appContext(): Context
    fun database(): MovieDatabase
    fun movieEntityDao(): MovieDao
    fun retrofit(): Retrofit
    fun apiService(): ApiService
    fun NetworkDataSource(): NetworkDataSource
    fun picasso(): Picasso
    fun appRepository(): AppRepository
    fun homeAdapter(): HomeAdapter
    fun homeViewModel(): HomeViewModel
    fun viewModelFactory(): ViewModelProvider.Factory


}
