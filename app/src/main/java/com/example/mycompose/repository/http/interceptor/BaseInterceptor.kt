package com.example.mycompose.repository.http.interceptor

import okhttp3.Interceptor
import okhttp3.Response

class BaseInterceptor(var headers: MutableMap<String, String>?) : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val builder = chain.request().newBuilder()
        if (headers != null && headers!!.isNotEmpty()) {
            val keys: MutableSet<String> = headers!!.keys
            for (headerKey in keys) {
                builder.addHeader(headerKey, headers!![headerKey]!!).build()
            }
        }

        //请求信息
        return chain.proceed(builder.build())
    }
}