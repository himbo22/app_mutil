package com.haikf.appmulti;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;


public class TimePickerActivity extends AppCompatActivity {
    private TextView view_time;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker);
        Button but_set_time = findViewById(R.id.set_time);
        Button but_stop = findViewById(R.id.but_stop);
        view_time = findViewById(R.id.view_time);
        TimePicker time_picker = findViewById(R.id.time_picker);

        but_set_time.setOnClickListener(view -> {
            int hour = time_picker.getHour();
            int minute = time_picker.getMinute();
            String AP;
            if(hour < 12)
            {
                AP = "AM";
            }
            else
            {
                AP = "PM";
            }
            view_time.setText("Time you set : " + hour + " : " + minute + " "+AP);
        });
        but_stop.setOnClickListener(view -> view_time.setText("Stopped"));

        
    }

    

}