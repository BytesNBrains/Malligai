package com.threesixtystudios.malligai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Timer mTimer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                //currently set to login activity. asks for number, otp and name
                Intent intent = new Intent(Splash.this, Register.class);
                startActivity(intent);
            }
        };

        mTimer.schedule(timerTask, 1000);

    }
}
