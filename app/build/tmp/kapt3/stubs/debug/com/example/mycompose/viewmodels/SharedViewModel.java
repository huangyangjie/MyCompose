package com.example.mycompose.viewmodels;

import android.util.Log;
import androidx.lifecycle.ViewModel;
import com.example.mycompose.repository.entity.BannerListEntity;
import com.example.mycompose.repository.http.ApiService;
import com.example.mycompose.repository.module.UserModule;
import com.example.mycompose.utils.LogTools;
import dagger.hilt.android.lifecycle.HiltViewModel;
import jakarta.inject.Inject;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u001e\u001a\u00020\u001fJ\b\u0010 \u001a\u00020\u001fH\u0014R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR&\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R+\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00148F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d\u00a8\u0006!"}, d2 = {"Lcom/example/mycompose/viewmodels/SharedViewModel;", "Landroidx/lifecycle/ViewModel;", "userModule", "Lcom/example/mycompose/repository/module/UserModule;", "apiService", "Lcom/example/mycompose/repository/http/ApiService;", "(Lcom/example/mycompose/repository/module/UserModule;Lcom/example/mycompose/repository/http/ApiService;)V", "_bannerStateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/example/mycompose/repository/entity/BannerListEntity$DataBean;", "getApiService", "()Lcom/example/mycompose/repository/http/ApiService;", "bannerFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getBannerFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "setBannerFlow", "(Lkotlinx/coroutines/flow/StateFlow;)V", "<set-?>", "", "count", "getCount", "()I", "setCount", "(I)V", "count$delegate", "Landroidx/compose/runtime/MutableIntState;", "getUserModule", "()Lcom/example/mycompose/repository/module/UserModule;", "getBanner", "", "onCleared", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class SharedViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.mycompose.repository.module.UserModule userModule = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.mycompose.repository.http.ApiService apiService = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.mycompose.repository.entity.BannerListEntity.DataBean>> _bannerStateFlow = null;
    @org.jetbrains.annotations.NotNull()
    private kotlinx.coroutines.flow.StateFlow<? extends java.util.List<? extends com.example.mycompose.repository.entity.BannerListEntity.DataBean>> bannerFlow;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableIntState count$delegate = null;
    
    @jakarta.inject.Inject()
    public SharedViewModel(@org.jetbrains.annotations.NotNull()
    com.example.mycompose.repository.module.UserModule userModule, @org.jetbrains.annotations.NotNull()
    com.example.mycompose.repository.http.ApiService apiService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.mycompose.repository.module.UserModule getUserModule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.mycompose.repository.http.ApiService getApiService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.mycompose.repository.entity.BannerListEntity.DataBean>> getBannerFlow() {
        return null;
    }
    
    public final void setBannerFlow(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.StateFlow<? extends java.util.List<? extends com.example.mycompose.repository.entity.BannerListEntity.DataBean>> p0) {
    }
    
    public final int getCount() {
        return 0;
    }
    
    public final void setCount(int p0) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public final void getBanner() {
    }
}