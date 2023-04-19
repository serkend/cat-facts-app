package com.cat_info_about.random_facts.ui.screens.saved_facts_screen.viewmodels;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.internal.lifecycle.HiltViewModelMap;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import dagger.multibindings.IntoSet;
import dagger.multibindings.StringKey;
import java.lang.String;

@OriginatingElement(
    topLevelClass = SavedCatFactsViewModel.class
)
public final class SavedCatFactsViewModel_HiltModules {
  private SavedCatFactsViewModel_HiltModules() {
  }

  @Module
  @InstallIn(ViewModelComponent.class)
  public abstract static class BindsModule {
    private BindsModule() {
    }

    @Binds
    @IntoMap
    @StringKey("com.cat_info_about.random_facts.ui.screens.saved_facts_screen.viewmodels.SavedCatFactsViewModel")
    @HiltViewModelMap
    public abstract ViewModel binds(SavedCatFactsViewModel vm);
  }

  @Module
  @InstallIn(ActivityRetainedComponent.class)
  public static final class KeyModule {
    private KeyModule() {
    }

    @Provides
    @IntoSet
    @HiltViewModelMap.KeySet
    public static String provide() {
      return "com.cat_info_about.random_facts.ui.screens.saved_facts_screen.viewmodels.SavedCatFactsViewModel";
    }
  }
}
