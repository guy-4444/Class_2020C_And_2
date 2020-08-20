package com.kobi.class2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Activity_Main extends AppCompatActivity {

    private TextView txt;
    private Button main_BTN_settings;
    private Button main_BTN_json;

    private MySPV2 mySPV2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mySPV2 = new MySPV2(this);


        txt = findViewById(R.id.txt);
        main_BTN_settings = findViewById(R.id.main_BTN_settings);
        main_BTN_json = findViewById(R.id.main_BTN_json);


        main_BTN_settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSettingsActivity();
            }
        });

        main_BTN_json.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openJsonPage();
            }
        });

        mySPV2.putBoolean(MySPV2.KEYS.USER_LAST_LOGIN_TIME_STAMP, false);
        boolean x = mySPV2.getBoolean(MySPV2.KEYS.USER_LAST_LOGIN_TIME_STAMP, false);
    }

    private void openJsonPage() {
        Intent intent = new Intent(Activity_Main.this, Activity_Json.class);
        startActivity(intent);
    }

    @Override
    protected void onResume() {
        super.onResume();

        String mail = MySP.getStringFromSP(this, MySPV2.KEYS.USER_MAIL, "No Mail");
        txt.setText(mail);
    }

    private void openSettingsActivity() {
        Intent intent = new Intent(Activity_Main.this, Activity_Settings.class);
        intent.putExtra(Activity_Settings.EXTRA_KEY_DATA, 5);
        startActivity(intent);
    }


}