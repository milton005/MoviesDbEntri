// Generated by Dagger (https://dagger.dev).
package com.example.moviedb_entri.data.local;

import dagger.internal.Factory;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DbRepoMapper_Factory implements Factory<DbRepoMapper> {
  @Override
  public DbRepoMapper get() {
    return newInstance();
  }

  public static DbRepoMapper_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static DbRepoMapper newInstance() {
    return new DbRepoMapper();
  }

  private static final class InstanceHolder {
    private static final DbRepoMapper_Factory INSTANCE = new DbRepoMapper_Factory();
  }
}