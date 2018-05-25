package com.example.digitalforest.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Main3Activity extends AppCompatActivity {
    List<String> data = new ArrayList<String >();
    ListView listView;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        data.add("AAA");
        data.add("BBB");
        data.add("CCC");

        editText = findViewById(R.id.editText);
        listView = findViewById(R.id.listview);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.listitem,R.id.tvCity,data);
        listView.setAdapter(adapter);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.add(String.valueOf(editText.getText()));
                adapter.notifyDataSetChanged();
                editText.setText("");
            }
        });
    }
}
