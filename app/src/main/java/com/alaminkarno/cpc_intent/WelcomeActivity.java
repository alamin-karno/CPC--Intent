package com.alaminkarno.cpc_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    String userName;
    TextView nameET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        nameET = findViewById(R.id.nameET);

        userName = getIntent().getStringExtra(MainActivity.NAME);

        if(!userName.isEmpty()){

            nameET.setText("Welcome, "+userName+" To Our App.");
        }

    }
}