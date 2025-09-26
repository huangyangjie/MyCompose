package com.example.mycompose.viewmodels;

import android.util.Log;
import androidx.lifecycle.ViewModel;
import com.example.mycompose.repository.UserModule;
import com.example.mycompose.repository.entity.BannerListEntity;
import com.example.mycompose.repository.http.ApiService;
import com.example.mycompose.repository.http.RetrofitClient;
import com.example.mycompose.utils.LogTools;
import dagger.hilt.android.lifecycle.HiltViewModel;
import jakarta.inject.Inject;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u001c\u001a\u00020\u001dJ\b\u0010\u001e\u001a\u00020\u001dH\u0014J\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00110 R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R7\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00118F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u0004\u00a8\u0006!"}, d2 = {"Lcom/example/mycompose/viewmodels/SharedViewModel;", "Landroidx/lifecycle/ViewModel;", "userModule", "Lcom/example/mycompose/repository/UserModule;", "(Lcom/example/mycompose/repository/UserModule;)V", "apiService", "Lcom/example/mycompose/repository/http/ApiService;", "<set-?>", "", "Lcom/example/mycompose/repository/entity/BannerListEntity$DataBean;", "bannerList", "getBannerList", "()Ljava/util/List;", "setBannerList", "(Ljava/util/List;)V", "bannerList$delegate", "Landroidx/compose/runtime/MutableState;", "", "count", "getCount", "()I", "setCount", "(I)V", "count$delegate", "Landroidx/compose/runtime/MutableIntState;", "getUserModule", "()Lcom/example/mycompose/repository/UserModule;", "setUserModule", "getBanner", "", "onCleared", "testFlow", "Lkotlinx/coroutines/flow/Flow;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class SharedViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private com.example.mycompose.repository.UserModule userModule;
    @org.jetbrains.annotations.NotNull()
    private final com.example.mycompose.repository.http.ApiService apiService = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState bannerList$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableIntState count$delegate = null;
    
    @jakarta.inject.Inject()
    public SharedViewModel(@org.jetbrains.annotations.NotNull()
    com.example.mycompose.repository.UserModule userModule) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.mycompose.repository.UserModule getUserModule() {
        return null;
    }
    
    public final void setUserModule(@org.jetbrains.annotations.NotNull()
    com.example.mycompose.repository.UserModule p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.mycompose.repository.entity.BannerListEntity.DataBean> getBannerList() {
        return null;
    }
    
    public final void setBannerList(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.example.mycompose.repository.entity.BannerListEntity.DataBean> p0) {
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
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Integer> testFlow() {
        return null;
    }
}