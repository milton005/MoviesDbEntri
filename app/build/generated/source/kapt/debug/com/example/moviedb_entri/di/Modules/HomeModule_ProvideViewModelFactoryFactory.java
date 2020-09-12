// Generated by Dagger (https://dagger.dev).
package com.example.moviedb_entri.di.Modules;

import androidx.lifecycle.ViewModelProvider;
import com.example.moviedb_entri.ui.HomeViewModel;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HomeModule_ProvideViewModelFactoryFactory implements Factory<ViewModelProvider.Factory> {
  private final HomeModule module;

  private final Provider<HomeViewModel> homeViewModelProvider;

  public HomeModule_ProvideViewModelFactoryFactory(HomeModule module,
      Provider<HomeViewModel> homeViewModelProvider) {
    this.module = module;
    this.homeViewModelProvider = homeViewModelProvider;
  }

  @Override
  public ViewModelProvider.Factory get() {
    return provideViewModelFactory(module, homeViewModelProvider.get());
  }

  public static HomeModule_ProvideViewModelFactoryFactory create(HomeModule module,
      Provider<HomeViewModel> homeViewModelProvider) {
    return new HomeModule_ProvideViewModelFactoryFactory(module, homeViewModelProvider);
  }

  public static ViewModelProvider.Factory provideViewModelFactory(HomeModule instance,
      HomeViewModel homeViewModel) {
    return Preconditions.checkNotNull(instance.provideViewModelFactory(homeViewModel), "Cannot return null from a non-@Nullable @Provides method");
  }
}
