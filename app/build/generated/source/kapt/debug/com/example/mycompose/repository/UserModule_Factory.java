package com.example.mycompose.repository;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("jakarta.inject.Singleton")
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
public final class UserModule_Factory implements Factory<UserModule> {
  @Override
  public UserModule get() {
    return newInstance();
  }

  public static UserModule_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static UserModule newInstance() {
    return new UserModule();
  }

  private static final class InstanceHolder {
    static final UserModule_Factory INSTANCE = new UserModule_Factory();
  }
}
