package com.github.tvbox.osc.util;

import android.util.Log;

/**
 * @author pj567
 * @date :2020/12/18
 * @description:
 */
public class LOG {
    private static String TAG = "TVBox";

    public static void e(String msg) {
        Log.e(TAG, "" + msg);
    }

    public static void i(String msg) {
        Log.i(TAG, "" + msg);
    }
    public static void printStackTrace(Exception ex){
        e(ex);
        ex.printStackTrace();
    }
    public static void printStackTrace(Throwable th){
        e(th);
        th.printStackTrace();
    }
}
