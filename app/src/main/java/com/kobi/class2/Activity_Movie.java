package com.kobi.class2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Activity_Movie extends AppCompatActivity {

    private TextView movie_LBL_counter;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);

        movie_LBL_counter = findViewById(R.id.movie_LBL_counter);
    }

    private void startTimerTask() {
        new Timer().scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                count++;

                // Return to UI Thread
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        movie_LBL_counter.setText("" + ++count);
                    }
                });

            }
        }, 0, 1000);
    }

    private void startCountDownTimer() {
        new CountDownTimer(30000, 1000) {
            public void onTick(long millisUntilFinished) {
                movie_LBL_counter.setText("" + count++);
            }

            public void onFinish() {

            }
        }.start();
    }

    @Override
    protected void onStart() {
        Log.d("pttt", "onStart");
        super.onStart();

        handler.postDelayed(secondlyRun, DELAY);
    }

    @Override
    protected void onStop() {
        Log.d("pttt", "onStop");
        super.onStop();

        handler.removeCallbacks(secondlyRun);
    }

    @Override
    protected void onDestroy() {
        Log.d("pttt", "onDestroy");
        super.onDestroy();
    }



    ////////////////--//////////////--//////////////////

    Handler handler = new Handler();
    private final int DELAY = 5000;

    Runnable secondlyRun = new Runnable(){
        public void run(){
            count++;
            MySignalV2.getInstance().showToast("" + count);
            movie_LBL_counter.setText("" + count);

            if (count <= 100) {
                handler.postDelayed(this, DELAY);
            }
        }
    };
}

/*
Git Hub
Vector Drawable
Icon
Debugging
 */