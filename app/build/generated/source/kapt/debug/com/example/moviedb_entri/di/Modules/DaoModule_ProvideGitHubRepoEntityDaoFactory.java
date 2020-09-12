// Generated by Dagger (https://dagger.dev).
package com.example.moviedb_entri.di.Modules;

import com.example.moviedb_entri.data.local.MovieDao;
import com.example.moviedb_entri.data.local.MovieDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaoModule_ProvideGitHubRepoEntityDaoFactory implements Factory<MovieDao> {
  private final DaoModule module;

  private final Provider<MovieDatabase> databaseProvider;

  public DaoModule_ProvideGitHubRepoEntityDaoFactory(DaoModule module,
      Provider<MovieDatabase> databaseProvider) {
    this.module = module;
    this.databaseProvider = databaseProvider;
  }

  @Override
  public MovieDao get() {
    return provideGitHubRepoEntityDao(module, databaseProvider.get());
  }

  public static DaoModule_ProvideGitHubRepoEntityDaoFactory create(DaoModule module,
      Provider<MovieDatabase> databaseProvider) {
    return new DaoModule_ProvideGitHubRepoEntityDaoFactory(module, databaseProvider);
  }

  public static MovieDao provideGitHubRepoEntityDao(DaoModule instance, MovieDatabase database) {
    return Preconditions.checkNotNull(instance.provideGitHubRepoEntityDao(database), "Cannot return null from a non-@Nullable @Provides method");
  }
}
