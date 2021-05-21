package com.massuperescupas.santoapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class splash_Activity extends AppCompatActivity
{
    MediaPlayer song;
    ProgressBar snniper;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide(); //esta linea esconde el action bar y el titulo

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_);

        song = MediaPlayer.create(this, R.raw.mariachi);
        song.start();

        TimerTask inicio=new TimerTask()
        {
            @Override
            public void run()
            {
                Intent intent =new Intent(splash_Activity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }

        };
        Timer tiempo=new Timer();
        tiempo.schedule(inicio,7000);
    }

}