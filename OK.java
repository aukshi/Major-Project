package com.menthoven.arduinoandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by hp on 03-04-2016.
 */
public class OK extends AppCompatActivity  {
    TextView LastChecked;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.greenc);
        LastChecked = (TextView) findViewById(R.id.tVLastChecked);
    }


}
