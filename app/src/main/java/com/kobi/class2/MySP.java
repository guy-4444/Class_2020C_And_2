package com.kobi.class2;

import android.content.Context;
import android.content.SharedPreferences;

import static android.content.Context.MODE_PRIVATE;

public class MySP {

    public static void putStringInSP(Context context, String key, String value) {
        SharedPreferences.Editor editor = context.getSharedPreferences("MY_SP", MODE_PRIVATE).edit();
        editor.putString(key, value);
        editor.apply();
    }

    public static String getStringFromSP(Context context, String key, String def) {
        SharedPreferences prefs = context.getSharedPreferences("MY_SP", MODE_PRIVATE);
        return prefs.getString(key, def);
    }

    public static void putBooleanInSP(Context context, String key, boolean value) {
        SharedPreferences.Editor editor = context.getSharedPreferences("MY_SP", MODE_PRIVATE).edit();
        editor.putBoolean(key, value);
        editor.apply();
    }

    public static boolean getBooleanFromSP(Context context, String key, boolean def) {
        SharedPreferences prefs = context.getSharedPreferences("MY_SP", MODE_PRIVATE);
        return prefs.getBoolean(key, def);
    }

}
