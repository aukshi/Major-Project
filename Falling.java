package com.menthoven.arduinoandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by hp on 03-04-2016.
 */
public class Falling extends AppCompatActivity {
    @Override
    protected void onPostResume() {
        super.onPostResume();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.orange);
    }
}
