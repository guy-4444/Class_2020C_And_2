package com.kobi.class2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

import java.util.ArrayList;

public class Activity_Json extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json);

        SuperHero superman = new SuperHero()
                .setName("Super Man")
                .setCity("New York")
                .setGifted(true)
                .setHp(1000);

        ArrayList<TopTen> scores = new ArrayList<>();
        scores.add(new TopTen(32.0, 24.2, 1523423323, 5));
        scores.add(new TopTen(33.0, -34.2, 153243323, 22));
        scores.add(new TopTen(-31.0, -334.2, 44544545 , 52));
        scores.add(new TopTen(-334.0, 34.2, 134544646, 15));
        scores.add(new TopTen(1.0, 874.2, 134544646, 25));
        scores.add(new TopTen(22.0, 74.2, 134544646, 5));
        scores.add(new TopTen(42.0, 84.2, 134544646, 5));

        superman.setScores(scores);

        Gson gson = new Gson();

        String json = gson.toJson(superman);

        MySP.putStringInSP(this, "SUPERMAN", json);


        String afterJson = MySP.getStringFromSP(this, "SUPERMAN", "");

        SuperHero afterHero = gson.fromJson(afterJson, SuperHero.class);

        Log.d("pttt", "Name: " + afterHero.getName());

    }
}