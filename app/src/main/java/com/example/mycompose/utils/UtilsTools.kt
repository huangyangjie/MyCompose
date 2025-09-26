package com.example.mycompose.utils

import android.content.Context
import android.content.pm.PackageInfo
import android.content.pm.PackageManager

object UtilsTools {
    fun getVersionName(context: Context): String {
        val packageManager: PackageManager = context.getPackageManager()
        val packInfo: PackageInfo = packageManager.getPackageInfo(context.getPackageName(), 0)
        val version = packInfo.versionName
        return version?:"未知"
    }
}