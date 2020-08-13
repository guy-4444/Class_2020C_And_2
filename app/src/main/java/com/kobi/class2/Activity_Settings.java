package com.kobi.class2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity_Settings extends AppCompatActivity {

    public static final String EXTRA_KEY_DATA = "EXTRA_KEY_DATA";

    private EditText settings_EDT_email;
    private Button settings_BTN_save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        settings_EDT_email = findViewById(R.id.settings_EDT_email);
        settings_BTN_save = findViewById(R.id.settings_BTN_save);


        int counter = getIntent().getIntExtra(EXTRA_KEY_DATA, 0);
        Log.d("pttt", "counter from previous activity : " + counter);

        settings_BTN_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveMailInMemory();
            }
        });

    }

    private void saveMailInMemory() {
        String mail = settings_EDT_email.getText().toString();
        MySP.putStringInSP(this, MySPV2.KEYS.USER_MAIL, mail);
        finish();
    }

}