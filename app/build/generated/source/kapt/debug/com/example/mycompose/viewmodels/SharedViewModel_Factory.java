package com.example.mycompose.viewmodels;

import com.example.mycompose.repository.UserModule;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation",
    "nullness:initialization.field.uninitialized"
})
public final class SharedViewModel_Factory implements Factory<SharedViewModel> {
  private final Provider<UserModule> userModuleProvider;

  private SharedViewModel_Factory(Provider<UserModule> userModuleProvider) {
    this.userModuleProvider = userModuleProvider;
  }

  @Override
  public SharedViewModel get() {
    return newInstance(userModuleProvider.get());
  }

  public static SharedViewModel_Factory create(Provider<UserModule> userModuleProvider) {
    return new SharedViewModel_Factory(userModuleProvider);
  }

  public static SharedViewModel newInstance(UserModule userModule) {
    return new SharedViewModel(userModule);
  }
}
