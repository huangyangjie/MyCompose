package com.example.mycompose.repository.http.interceptor

import com.example.mycompose.MyApplication
import com.example.mycompose.utils.LogTools
import com.example.mycompose.utils.UtilsTools
import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

class MyInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        var request: Request? = null
        try {
            request = chain.request().newBuilder().addHeader("Content-Type", "application/json;charset=UTF-8").addHeader("appVersion", UtilsTools.getVersionName(MyApplication.instance)).build()
        } catch (e: Exception) {
            LogTools.e("MyInterceptor:" + e)
        }
        val response = chain.proceed(request!!)
//        if (response.code() == 425) {
//            RxBus.getInstance()
//                .post(MainActivity::class.java.getSimpleName(), MessageSocket(425, "您的设备时间与服务器时间不一致。当前设备时间为:(" + getDate() + ")。请检查您的设备时间设置。", null, null))
//        }
//        if (isDecrypt(request.url().toString())) {
//            try {
//                response = decrypt(response)
//            } catch (e: Exception) {
//                LogTools.e("MyInterceptor decrypt:" + e)
//            }
//        }
        return response
    }
}