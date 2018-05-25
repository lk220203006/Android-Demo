package com.example.digitalforest.gridviewdemo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    String[] datasource = {"AAA","BBB","CCC","DDD","EEE","FFF","GGG","HHH","AAA1","BBB2","CC3C","D4DD","EE5E","FFF6","G7GG","HH8H"};
    GridView gridView;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] num = getResources().getStringArray(R.array.num);
        spinner = findViewById(R.id.spinner);
        gridView = findViewById(R.id.gridview);

        ArrayAdapter<String > adapter = new ArrayAdapter<String>(this,R.layout.griditem,
                R.id.textView,datasource);
        gridView.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String string = num[position];
                gridView.setNumColumns(Integer.parseInt(string));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
