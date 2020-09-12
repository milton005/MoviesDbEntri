// Generated by Dagger (https://dagger.dev).
package com.example.moviedb_entri.di.Modules;

import com.example.moviedb_entri.data.repository.AppRepository;
import com.example.moviedb_entri.ui.HomeViewModel;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HomeModule_ProvideHomeViewModelFactory implements Factory<HomeViewModel> {
  private final HomeModule module;

  private final Provider<AppRepository> appRepositoryProvider;

  public HomeModule_ProvideHomeViewModelFactory(HomeModule module,
      Provider<AppRepository> appRepositoryProvider) {
    this.module = module;
    this.appRepositoryProvider = appRepositoryProvider;
  }

  @Override
  public HomeViewModel get() {
    return provideHomeViewModel(module, appRepositoryProvider.get());
  }

  public static HomeModule_ProvideHomeViewModelFactory create(HomeModule module,
      Provider<AppRepository> appRepositoryProvider) {
    return new HomeModule_ProvideHomeViewModelFactory(module, appRepositoryProvider);
  }

  public static HomeViewModel provideHomeViewModel(HomeModule instance,
      AppRepository appRepository) {
    return Preconditions.checkNotNull(instance.provideHomeViewModel(appRepository), "Cannot return null from a non-@Nullable @Provides method");
  }
}
