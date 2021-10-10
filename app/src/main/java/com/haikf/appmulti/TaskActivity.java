package com.haikf.appmulti;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class TaskActivity extends AppCompatActivity {
    private ArrayList<String> items;
    private ArrayAdapter<String> itemsAdapter;
    private ListView listview;
    private Button but_add;
    private EditText edit_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);
        listview = findViewById(R.id.list_view);
        but_add = findViewById(R.id.but_add);
        items = new ArrayList<>();
        edit_text = findViewById(R.id.eidt_text);
        itemsAdapter = new ArrayAdapter<>(
                this,android.R.layout.simple_list_item_1,items
        );
        listview.setAdapter(itemsAdapter);
        but_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addItem(view);
                
            }
        });
        listview.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                items.remove(i);
                itemsAdapter.notifyDataSetChanged();
                return true;
            }
        });

    }

    private void addItem(View view) {
        String task = edit_text.getText().toString().trim();
        if(!(task.equals("")))
        {
            itemsAdapter.add(task);
            edit_text.setText("");
            Toast.makeText(this,"Hold the item to remove it",Toast.LENGTH_SHORT).show();
        }
        


        itemsAdapter.notifyDataSetChanged();
    }



}