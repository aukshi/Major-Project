package com.menthoven.arduinoandroid;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by hp on 03-04-2016.
 */

public class Danger extends AppCompatActivity implements View.OnClickListener {
Button goToMap;
    MediaPlayer alarm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.redc);
        alarm = MediaPlayer.create(Danger.this, R.raw.alarmtone);
        goToMap = (Button) findViewById(R.id.bMap);
        Thread timer = new Thread() {
            public void run() {
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();

                }
            }
        };
        timer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        alarm.release();
        finish();
    }

    @Override
    public void onClick(View v) {

    }
}
