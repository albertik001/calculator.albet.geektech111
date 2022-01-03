package com.example.calculatoralbetgeektech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

public class Splash_screen extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        new CountDownTimer(1500, 1500){

            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {
                Intent intent = new Intent(Splash_screen.this, MainActivitys.class);
                startActivity(intent);
                finish();

            }
        }.start();
    }
}