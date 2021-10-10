package com.haikf.appmulti;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
 
    public static String NAMEE = "NAMEE";  // khai báo ở đây vì (1) phải được tạo ra khi (2) chạy

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //intialize
        // Xem thêm vòng đời của activity
        //
        Button but_alarm = findViewById(R.id.but_alarm);
        Button but_task = findViewById(R.id.but_task);
        Button but_yes_no = findViewById(R.id.but_yes_no);
        TextView textView2 = findViewById(R.id.textView2);
        String name;

        Intent intent = getIntent();
        name = intent.getStringExtra(NAMEE);
        textView2.setText(name);

        but_alarm.setOnClickListener(view -> tele());
        but_yes_no.setOnClickListener(view -> tele2());
        but_task.setOnClickListener(view -> tele3());
    }

    private void tele2() {
        Intent intent = new Intent(this,YesNoActivity2.class);
        startActivity(intent);
    }

    private void tele() {
        Intent intent = new Intent(this,AlarmActivity.class);
        startActivity(intent);
    }
    private void tele3()
    {
        Intent intent = new Intent(this,TaskActivity.class);
        startActivity(intent);
    }


}