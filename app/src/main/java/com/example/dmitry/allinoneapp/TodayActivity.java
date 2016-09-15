package com.example.dmitry.allinoneapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TodayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_today);

        ((TextView) findViewById(R.id.text_clock)).setText((
                new SimpleDateFormat("HH:HH").format(Calendar.getInstance().getTime())));

        ((TextView) findViewById(R.id.text_clock)).setText((
                new SimpleDateFormat("HH:HH").format(Calendar.getInstance().getTime())));
    }
}
