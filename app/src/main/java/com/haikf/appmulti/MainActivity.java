package com.haikf.appmulti;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button but1;
    private EditText edit1;

    @Override
    
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        but1 = findViewById(R.id.but1);
        edit1 = findViewById(R.id.edit1);
   
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendData();

            }
        });
    }


    


    public void sendData()
    {
        String name = edit1.getText().toString().trim();
        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        intent.putExtra(MainActivity2.NAMEE,name);        //(1)
        startActivity(intent);             //(2)
    }


}