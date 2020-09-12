// Generated by Dagger (https://dagger.dev).
package com.example.moviedb_entri.di.Modules;

import android.content.Context;
import com.example.moviedb_entri.data.local.MovieDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DatabaseModule_ProvideDatabaseFactory implements Factory<MovieDatabase> {
  private final DatabaseModule module;

  private final Provider<Context> contextProvider;

  public DatabaseModule_ProvideDatabaseFactory(DatabaseModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public MovieDatabase get() {
    return provideDatabase(module, contextProvider.get());
  }

  public static DatabaseModule_ProvideDatabaseFactory create(DatabaseModule module,
      Provider<Context> contextProvider) {
    return new DatabaseModule_ProvideDatabaseFactory(module, contextProvider);
  }

  public static MovieDatabase provideDatabase(DatabaseModule instance, Context context) {
    return Preconditions.checkNotNull(instance.provideDatabase(context), "Cannot return null from a non-@Nullable @Provides method");
  }
}