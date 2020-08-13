package com.kobi.class2;

import android.content.Context;
import android.content.SharedPreferences;

import static android.content.Context.MODE_PRIVATE;

public class MySPV2 {


    public interface KEYS {
        public static final String USER_DATA = "USER_DATA";
        public static final String USER_LAST_LOGIN_TIME_STAMP = "USER_LAST_LOGIN_TIME_STAMP";
        public static final String USER_MAIL = "USER_MAIL";
    }



    private SharedPreferences prefs;

    public MySPV2(Context context) {
        prefs = context.getSharedPreferences("MY_SP", MODE_PRIVATE);
    }

    public void putString(String key, String value) {
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value);
        editor.apply();
    }

    public String getString(String key, String def) {
        return prefs.getString(key, def);
    }

    public void putBoolean(String key, boolean value) {
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean(key, value);
        editor.apply();
    }

    public boolean getBoolean(String key, boolean def) {
        return prefs.getBoolean(key, def);
    }

}
