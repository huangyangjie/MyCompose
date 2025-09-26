package com.example.mycompose.repository.http

import com.example.mycompose.AppConfig
import com.example.mycompose.MyApplication
import com.example.mycompose.repository.http.interceptor.BaseInterceptor
import com.example.mycompose.repository.http.interceptor.CacheInterceptor
import com.example.mycompose.repository.http.interceptor.LoggingInterceptor.Companion.loggingInterceptor
import com.example.mycompose.repository.http.interceptor.MyInterceptor
import com.example.mycompose.utils.HttpsUtils
import com.example.mycompose.utils.LogTools
import okhttp3.Authenticator
import okhttp3.Cache
import okhttp3.ConnectionPool
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import okhttp3.Route
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.File
import java.util.concurrent.TimeUnit

open class RetrofitClient {
    companion object {
        //超时时间
        private const val DEFAULT_TIMEOUT: Long = 28

        //缓存时间
        private const val CACHE_TIMEOUT: Long = 10 * 1024 * 1024
        private var okHttpClient: OkHttpClient? = null
        private var retrofit: Retrofit? = null
        private var cache: Cache? = null
        private var httpCacheDirectory: File? = null
        private val mContext: MyApplication = MyApplication.Companion.instance
        private val INSTANCE: RetrofitClient= RetrofitClient(AppConfig.baseUrl, null)

        fun getInstance(): RetrofitClient {
            return INSTANCE;
        }
    }


    constructor(url: String, headers: MutableMap<String, String>?) {
        if (httpCacheDirectory == null) {
            httpCacheDirectory = File(mContext.cacheDir, "app_cache")
        }
        if (cache == null) {
            cache = Cache(httpCacheDirectory!!, CACHE_TIMEOUT.toLong())
        }
        val sslParams: HttpsUtils.SSLParams = HttpsUtils.getSslSocketFactory()
        val builder: OkHttpClient.Builder = OkHttpClient.Builder()
        okHttpClient = builder.cache(cache)
            .addInterceptor(BaseInterceptor(headers))
            .addInterceptor(CacheInterceptor(mContext))
            .addInterceptor(MyInterceptor())
            .addInterceptor(loggingInterceptor)
            .sslSocketFactory(sslParams.sSLSocketFactory!!, sslParams.trustManager!!).connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS).readTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
            .writeTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS).authenticator(object : Authenticator {
                override fun authenticate(route: Route?, response: Response): Request? {
                    LogTools.e("Authenticating for response: $response")
                    if (response.code == 401) {
                        LogTools.e("401 token失效了!")
                    }
                    return response.request
                }

            }).connectionPool(ConnectionPool(8, 30, TimeUnit.SECONDS)).build()

        retrofit = Retrofit.Builder().client(okHttpClient!!).addConverterFactory(GsonConverterFactory.create()).baseUrl(url).build()
    }

    fun <T> create(service: Class<T>): T {
        return retrofit!!.create<T>(service)
    }

}