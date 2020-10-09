package com.example.moviedb_entri.di.Modules

import androidx.lifecycle.ViewModelProvider
import com.example.moviedb_entri.ui.Adapter.HomeAdapter
import com.example.moviedb_entri.ui.HomeViewModel
import com.example.moviedb_entri.Util.ViewModelProviderFactory
import com.example.moviedb_entri.data.repository.AppRepository

import com.squareup.picasso.Picasso
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
class HomeModule {

    @Provides
    fun provideHomeAdapter( picasso: Picasso): HomeAdapter = HomeAdapter( picasso)

    @Provides
    fun provideViewModelFactory(homeViewModel: HomeViewModel): ViewModelProvider.Factory {
        return ViewModelProviderFactory(homeViewModel)
    }

    @Provides
    fun provideHomeViewModel(appRepository: AppRepository): HomeViewModel {
        return HomeViewModel(appRepository)
    }

}