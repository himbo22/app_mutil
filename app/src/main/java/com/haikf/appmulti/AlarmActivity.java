package com.haikf.appmulti;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class AlarmActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);

        Button but_change_time = findViewById(R.id.but_change_time);        // but change time    (never used)
        Button but_set = findViewById(R.id.but_set_alarm);           // but set alarm
        Button but_cancle = findViewById(R.id.but_cancle);           // but cancle (never used)
        ImageButton but_home = findViewById(R.id.but_home);          // but home

        but_set.setOnClickListener(view -> tele());       // but set alarm
        but_home.setOnClickListener(view -> tele1());     // but home
    }
    public void tele()
    {
        Intent intent = new Intent(this,TimePickerActivity.class);
        startActivity(intent);
    }
    public void tele1()
    {
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }



}