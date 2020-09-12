// Generated by Dagger (https://dagger.dev).
package com.example.moviedb_entri.di.Modules;

import com.example.moviedb_entri.data.DispatcherProvider;
import com.example.moviedb_entri.data.local.DbRepoMapper;
import com.example.moviedb_entri.data.local.MovieDao;
import com.example.moviedb_entri.data.remote.NetworkDataSource;
import com.example.moviedb_entri.data.repository.AppRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RepositoryModule_ProvideAppRepositoryFactory implements Factory<AppRepository> {
  private final RepositoryModule module;

  private final Provider<DbRepoMapper> dbRepoMapperProvider;

  private final Provider<MovieDao> daoProvider;

  private final Provider<NetworkDataSource> networkDataSourceProvider;

  private final Provider<DispatcherProvider> dispatcherProvider;

  public RepositoryModule_ProvideAppRepositoryFactory(RepositoryModule module,
      Provider<DbRepoMapper> dbRepoMapperProvider, Provider<MovieDao> daoProvider,
      Provider<NetworkDataSource> networkDataSourceProvider,
      Provider<DispatcherProvider> dispatcherProvider) {
    this.module = module;
    this.dbRepoMapperProvider = dbRepoMapperProvider;
    this.daoProvider = daoProvider;
    this.networkDataSourceProvider = networkDataSourceProvider;
    this.dispatcherProvider = dispatcherProvider;
  }

  @Override
  public AppRepository get() {
    return provideAppRepository(module, dbRepoMapperProvider.get(), daoProvider.get(), networkDataSourceProvider.get(), dispatcherProvider.get());
  }

  public static RepositoryModule_ProvideAppRepositoryFactory create(RepositoryModule module,
      Provider<DbRepoMapper> dbRepoMapperProvider, Provider<MovieDao> daoProvider,
      Provider<NetworkDataSource> networkDataSourceProvider,
      Provider<DispatcherProvider> dispatcherProvider) {
    return new RepositoryModule_ProvideAppRepositoryFactory(module, dbRepoMapperProvider, daoProvider, networkDataSourceProvider, dispatcherProvider);
  }

  public static AppRepository provideAppRepository(RepositoryModule instance,
      DbRepoMapper dbRepoMapper, MovieDao dao, NetworkDataSource networkDataSource,
      DispatcherProvider dispatcherProvider) {
    return Preconditions.checkNotNull(instance.provideAppRepository(dbRepoMapper, dao, networkDataSource, dispatcherProvider), "Cannot return null from a non-@Nullable @Provides method");
  }
}
