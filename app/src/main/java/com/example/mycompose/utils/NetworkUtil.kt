package com.example.mycompose.utils

import android.Manifest
import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.telephony.TelephonyManager
import androidx.annotation.RequiresPermission
import java.io.IOException
import java.net.HttpURLConnection
import java.net.NetworkInterface
import java.net.SocketException
import java.net.URL

object NetworkUtil {
    val url: String = "http://www.baidu.com"
    var NET_CNNT_BAIDU_OK: Int = 1 // NetworkAvailable
    var NET_CNNT_BAIDU_TIMEOUT: Int = 2 // no NetworkAvailable
    var NET_NOT_PREPARE: Int = 3 // Net no ready
    var NET_ERROR: Int = 4 //net error
    val TIMEOUT: Int = 3000 // TIMEOUT


    /**
     * check NetworkAvailable
     * @param context
     * @return
     */
    fun isNetworkAvailable(context: Context): Boolean {
        val manager = context.getApplicationContext().getSystemService(
            Context.CONNECTIVITY_SERVICE
        ) as ConnectivityManager?
        if (null == manager) return false
        val info = manager.getActiveNetworkInfo()
        if (null == info || !info.isAvailable()) return false
        return true
    }

    /**
     * getLocalIpAddress
     * @return
     */
    fun getLocalIpAddress(): String {
        var ret = ""
        try {
            val en = NetworkInterface.getNetworkInterfaces()
            while (en.hasMoreElements()) {
                val intf = en.nextElement()
                val enumIpAddr = intf.getInetAddresses()
                while (enumIpAddr.hasMoreElements()) {
                    val inetAddress = enumIpAddr.nextElement()
                    if (!inetAddress.isLoopbackAddress()) {
                        ret = inetAddress.getHostAddress().toString()
                    }
                }
            }
        } catch (ex: SocketException) {
            ex.printStackTrace()
        }
        return ret
    }

    /**
     * 返回当前网络状态
     *
     * @param context
     * @return
     */
    fun getNetState(context: Context): Int {
        try {
            val connectivity = context
                .getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager?
            if (connectivity != null) {
                val networkinfo = connectivity.getActiveNetworkInfo()
                if (networkinfo != null) {
                    if (networkinfo.isAvailable() && networkinfo.isConnected()) {
                        if (!connectionNetwork()) return NET_CNNT_BAIDU_TIMEOUT
                        else return NET_CNNT_BAIDU_OK
                    } else {
                        return NET_NOT_PREPARE
                    }
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return NET_ERROR
    }

    /**
     * ping "http://www.baidu.com"
     * @return
     */
    private fun connectionNetwork(): Boolean {
        var result = false
        var httpUrl: HttpURLConnection? = null
        try {
            httpUrl = URL(url)
                .openConnection() as HttpURLConnection?
            httpUrl!!.setConnectTimeout(TIMEOUT)
            httpUrl.connect()
            result = true
        } catch (e: IOException) {
        } finally {
            if (null != httpUrl) {
                httpUrl.disconnect()
            }
            httpUrl = null
        }
        return result
    }

    /**
     * check is3G
     * @param context
     * @return boolean
     */
    fun is3G(context: Context): Boolean {
        val connectivityManager = context
            .getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetInfo = connectivityManager.getActiveNetworkInfo()
        if (activeNetInfo != null
            && activeNetInfo.getType() == ConnectivityManager.TYPE_MOBILE
        ) {
            return true
        }
        return false
    }

    /**
     * isWifi
     * @param context
     * @return boolean
     */
    fun isWifi(context: Context): Boolean {
        val connectivityManager = context
            .getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetInfo = connectivityManager.getActiveNetworkInfo()
        if (activeNetInfo != null
            && activeNetInfo.getType() == ConnectivityManager.TYPE_WIFI
        ) {
            return true
        }
        return false
    }

    /**
     * is2G
     * @param context
     * @return boolean
     */
    fun is2G(context: Context): Boolean {
        val connectivityManager = context
            .getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetInfo = connectivityManager.getActiveNetworkInfo()
        if (activeNetInfo != null
            && (activeNetInfo.getSubtype() == TelephonyManager.NETWORK_TYPE_EDGE || activeNetInfo.getSubtype() == TelephonyManager.NETWORK_TYPE_GPRS || activeNetInfo
                .getSubtype() == TelephonyManager.NETWORK_TYPE_CDMA)
        ) {
            return true
        }
        return false
    }

    /**
     * is wifi on
     */
    @RequiresPermission(Manifest.permission.READ_PHONE_STATE)
    fun isWifiEnabled(context: Context): Boolean {
        val mgrConn = context
            .getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val mgrTel = context
            .getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager
        return ((mgrConn.getActiveNetworkInfo() != null && mgrConn
            .getActiveNetworkInfo()!!.getState() == NetworkInfo.State.CONNECTED) || mgrTel
            .getNetworkType() == TelephonyManager.NETWORK_TYPE_UMTS)
    }

}