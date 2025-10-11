package com.example.mycompose.repository.http;

import com.example.mycompose.AppConfig;
import com.example.mycompose.MyApplication;
import com.example.mycompose.repository.http.interceptor.BaseInterceptor;
import com.example.mycompose.repository.http.interceptor.CacheInterceptor;
import com.example.mycompose.repository.http.interceptor.MyInterceptor;
import com.example.mycompose.utils.HttpsUtils;
import com.example.mycompose.utils.LogTools;
import okhttp3.Authenticator;
import okhttp3.Cache;
import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import java.io.File;
import java.util.concurrent.TimeUnit;
import javax.inject.Singleton;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u0000 \f2\u00020\u0001:\u0001\fB%\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\u0002H\b\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\n\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\r"}, d2 = {"Lcom/example/mycompose/repository/http/RetrofitClient;", "", "url", "", "headers", "", "(Ljava/lang/String;Ljava/util/Map;)V", "create", "T", "service", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "Companion", "app_debug"})
public class RetrofitClient {
    private static final long DEFAULT_TIMEOUT = 28L;
    private static final long CACHE_TIMEOUT = 10485760L;
    @org.jetbrains.annotations.Nullable()
    private static okhttp3.OkHttpClient okHttpClient;
    @org.jetbrains.annotations.Nullable()
    private static retrofit2.Retrofit retrofit;
    @org.jetbrains.annotations.Nullable()
    private static okhttp3.Cache cache;
    @org.jetbrains.annotations.Nullable()
    private static java.io.File httpCacheDirectory;
    @org.jetbrains.annotations.NotNull()
    private static final com.example.mycompose.MyApplication mContext = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.example.mycompose.repository.http.RetrofitClient INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.mycompose.repository.http.RetrofitClient.Companion Companion = null;
    
    public RetrofitClient(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> headers) {
        super();
    }
    
    public final <T extends java.lang.Object>T create(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> service) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0012\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/mycompose/repository/http/RetrofitClient$Companion;", "", "()V", "CACHE_TIMEOUT", "", "DEFAULT_TIMEOUT", "INSTANCE", "Lcom/example/mycompose/repository/http/RetrofitClient;", "cache", "Lokhttp3/Cache;", "httpCacheDirectory", "Ljava/io/File;", "mContext", "Lcom/example/mycompose/MyApplication;", "okHttpClient", "Lokhttp3/OkHttpClient;", "retrofit", "Lretrofit2/Retrofit;", "getInstance", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.mycompose.repository.http.RetrofitClient getInstance() {
            return null;
        }
    }
}