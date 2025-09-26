package com.example.mycompose.utils;


public class LogTools {
    private static String TAG = "测试";

    public static void e(String s) {
        try {
            if (s.length() > 4000) {
                for (int i = 0; i < s.length(); i += 4000) {
                    if (i + 4000 < s.length()) android.util.Log.e(TAG, s.substring(i, i + 4000));
                    else android.util.Log.e(TAG, s.substring(i, s.length()));
                }
            } else {
                android.util.Log.e(TAG, s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void d(String s) {
        if (s.length() > 4000) {
            for (int i = 0; i < s.length(); i += 4000) {
                if (i + 4000 < s.length()) android.util.Log.d(TAG, s.substring(i, i + 4000));
                else android.util.Log.d(TAG, s.substring(i, s.length()));
            }
        } else {
            android.util.Log.d(TAG, s);
        }
    }
}

