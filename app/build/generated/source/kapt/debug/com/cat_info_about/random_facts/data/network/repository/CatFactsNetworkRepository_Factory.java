// Generated by Dagger (https://dagger.dev).
package com.cat_info_about.random_facts.data.network.repository;

import com.cat_info_about.random_facts.data.network.api.CatFactsApi;
import com.cat_info_about.random_facts.data.network.mapper.Mapper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CatFactsNetworkRepository_Factory implements Factory<CatFactsNetworkRepository> {
  private final Provider<CatFactsApi> apiServiceProvider;

  private final Provider<Mapper> mapperProvider;

  public CatFactsNetworkRepository_Factory(Provider<CatFactsApi> apiServiceProvider,
      Provider<Mapper> mapperProvider) {
    this.apiServiceProvider = apiServiceProvider;
    this.mapperProvider = mapperProvider;
  }

  @Override
  public CatFactsNetworkRepository get() {
    return newInstance(apiServiceProvider.get(), mapperProvider.get());
  }

  public static CatFactsNetworkRepository_Factory create(Provider<CatFactsApi> apiServiceProvider,
      Provider<Mapper> mapperProvider) {
    return new CatFactsNetworkRepository_Factory(apiServiceProvider, mapperProvider);
  }

  public static CatFactsNetworkRepository newInstance(CatFactsApi apiService, Mapper mapper) {
    return new CatFactsNetworkRepository(apiService, mapper);
  }
}
