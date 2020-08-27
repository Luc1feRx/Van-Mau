package com.example.vnmu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivitySlash extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 3500;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_slash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splashScreen = new Intent(MainActivitySlash.this, MainActivity.class);
                startActivity(splashScreen);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}