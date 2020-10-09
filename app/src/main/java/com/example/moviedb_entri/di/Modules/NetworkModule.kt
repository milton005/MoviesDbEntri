package com.example.moviedb_entri.di.Modules

import android.content.Context
import com.example.moviedb_entri.data.remote.ApiService
import com.example.moviedb_entri.data.remote.NetworkDataSource
import com.example.moviedb_entri.data.remote.NetworkDataSourceImpl
import com.google.gson.Gson
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.squareup.picasso.OkHttp3Downloader
import com.squareup.picasso.Picasso

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import okhttp3.Cache
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
class NetworkModule {

    @Provides
    @Singleton
    fun getHttpLoggingInterceptor(): HttpLoggingInterceptor {
        val httpLoggingInterceptor = HttpLoggingInterceptor()
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
        return httpLoggingInterceptor
    }

    @Provides
    @Singleton
    fun provideOkHttpClient(@ApplicationContext context: Context, httpLoggingInterceptor: HttpLoggingInterceptor) : OkHttpClient {
        val cache = Cache(context.cacheDir, CACHE_SIZE)
        return OkHttpClient.Builder()
            .addInterceptor(httpLoggingInterceptor)
            .cache(cache)
            .build()
    }

    @Provides
    @Singleton
    fun provideOkHttp3Downloader(okHttpClient: OkHttpClient): OkHttp3Downloader = OkHttp3Downloader(
        okHttpClient
    )

    @Provides
    @Singleton
    fun providePicasso(@ApplicationContext context: Context, okHttp3Downloader: OkHttp3Downloader): Picasso {
        return Picasso.Builder(context).downloader(okHttp3Downloader).build()
    }

    @Provides
    fun provideCallAdapterFactory(): CoroutineCallAdapterFactory = CoroutineCallAdapterFactory()

    @Provides
    fun provideGson(): Gson = Gson()

    @Provides
    fun provideGsonConverterFactory(gson: Gson): GsonConverterFactory = GsonConverterFactory.create(
        gson
    )

    @Provides
    @Singleton
    fun provideRetrofit(
        okHttpClient: OkHttpClient,
        coroutineCallAdapterFactory: CoroutineCallAdapterFactory,
        gsonConverterFactory: GsonConverterFactory
    ) : Retrofit {

        return Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl(BASE_URL)
            .addCallAdapterFactory(coroutineCallAdapterFactory)
            .addConverterFactory(gsonConverterFactory)
            .build()

    }

    @Provides
    @Singleton
    fun provideApiService(retrofit: Retrofit): ApiService {
        return retrofit.create(ApiService::class.java)
    }

    @Provides
    @Singleton
    fun provideNetworkDataSource( apiService: ApiService) : NetworkDataSource {
        return NetworkDataSourceImpl(apiService)
    }

    companion object {
        private const val CACHE_SIZE: Long = 10 * 1024 * 1024 // 10MB
        private const val BASE_URL = "https://api.themoviedb.org/3/movie/"
    }
}