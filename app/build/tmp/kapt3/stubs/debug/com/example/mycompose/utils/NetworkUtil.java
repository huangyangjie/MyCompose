package com.example.mycompose.utils;

import android.Manifest;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import androidx.annotation.RequiresPermission;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URL;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u0006\u0010\u001a\u001a\u00020\u0015J\u000e\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010 \u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010!\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001dJ\u0010\u0010\"\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001dH\u0007R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u0014\u0010\u0012\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u0015X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006#"}, d2 = {"Lcom/example/mycompose/utils/NetworkUtil;", "", "()V", "NET_CNNT_BAIDU_OK", "", "getNET_CNNT_BAIDU_OK", "()I", "setNET_CNNT_BAIDU_OK", "(I)V", "NET_CNNT_BAIDU_TIMEOUT", "getNET_CNNT_BAIDU_TIMEOUT", "setNET_CNNT_BAIDU_TIMEOUT", "NET_ERROR", "getNET_ERROR", "setNET_ERROR", "NET_NOT_PREPARE", "getNET_NOT_PREPARE", "setNET_NOT_PREPARE", "TIMEOUT", "getTIMEOUT", "url", "", "getUrl", "()Ljava/lang/String;", "connectionNetwork", "", "getLocalIpAddress", "getNetState", "context", "Landroid/content/Context;", "is2G", "is3G", "isNetworkAvailable", "isWifi", "isWifiEnabled", "app_debug"})
public final class NetworkUtil {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String url = "http://www.baidu.com";
    private static int NET_CNNT_BAIDU_OK = 1;
    private static int NET_CNNT_BAIDU_TIMEOUT = 2;
    private static int NET_NOT_PREPARE = 3;
    private static int NET_ERROR = 4;
    private static final int TIMEOUT = 3000;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.mycompose.utils.NetworkUtil INSTANCE = null;
    
    private NetworkUtil() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUrl() {
        return null;
    }
    
    public final int getNET_CNNT_BAIDU_OK() {
        return 0;
    }
    
    public final void setNET_CNNT_BAIDU_OK(int p0) {
    }
    
    public final int getNET_CNNT_BAIDU_TIMEOUT() {
        return 0;
    }
    
    public final void setNET_CNNT_BAIDU_TIMEOUT(int p0) {
    }
    
    public final int getNET_NOT_PREPARE() {
        return 0;
    }
    
    public final void setNET_NOT_PREPARE(int p0) {
    }
    
    public final int getNET_ERROR() {
        return 0;
    }
    
    public final void setNET_ERROR(int p0) {
    }
    
    public final int getTIMEOUT() {
        return 0;
    }
    
    /**
     * check NetworkAvailable
     * @param context
     * @return
     */
    public final boolean isNetworkAvailable(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    /**
     * getLocalIpAddress
     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLocalIpAddress() {
        return null;
    }
    
    /**
     * 返回当前网络状态
     *
     * @param context
     * @return
     */
    public final int getNetState(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0;
    }
    
    /**
     * ping "http://www.baidu.com"
     * @return
     */
    private final boolean connectionNetwork() {
        return false;
    }
    
    /**
     * check is3G
     * @param context
     * @return boolean
     */
    public final boolean is3G(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    /**
     * isWifi
     * @param context
     * @return boolean
     */
    public final boolean isWifi(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    /**
     * is2G
     * @param context
     * @return boolean
     */
    public final boolean is2G(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    /**
     * is wifi on
     */
    @androidx.annotation.RequiresPermission(value = "android.permission.READ_PHONE_STATE")
    public final boolean isWifiEnabled(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
}