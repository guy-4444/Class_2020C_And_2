package com.kobi.class2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txt = findViewById(R.id.txt);


        //txt.setText(usersTeam);
        String usersTeam = "Macabi haifa";


        SharedPreferences.Editor editor = getSharedPreferences("MY_SP", MODE_PRIVATE).edit();
        editor.putString("USER_TEAM", usersTeam);
        editor.putBoolean("IS_USER_WIN", false);
        editor.putInt("USER_SCORE", 340);
        editor.apply();


        SharedPreferences prefs = getSharedPreferences("MY_SP", MODE_PRIVATE);
        String team = prefs.getString("USER_TEAM", "NA");
        boolean isWin = prefs.getBoolean("IS_USER_WIN", false);
        int score = prefs.getInt("USER_SCORE", 0);
        String StringA = prefs.getString("USER_TEAMsdf", "NA");

        Log.d("pttt", "team= " + team);
        Log.d("pttt", "isWin= " + isWin);
        Log.d("pttt", "score= " + score);
        Log.d("pttt", "StringA= " + StringA);


        updateOpenCounter();
    }

    private void updateOpenCounter() {
        SharedPreferences prefs = getSharedPreferences("MY_SP", MODE_PRIVATE);
        int lastCounter = prefs.getInt("APPLICATION_OPEN_COUNTER", 0);

        SharedPreferences.Editor editor = getSharedPreferences("MY_SP", MODE_PRIVATE).edit();
        editor.putInt("APPLICATION_OPEN_COUNTER", lastCounter + 1);
        editor.apply();

        txt.setText("COUNTER : " + (lastCounter + 1));
    }
}