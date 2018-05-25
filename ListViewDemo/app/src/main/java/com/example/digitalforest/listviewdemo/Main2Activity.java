package com.example.digitalforest.listviewdemo;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class Main2Activity extends ListActivity {
    String[] datasource = {"北京","上海","广州","长沙"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.listitem,R.id.tvCity,datasource);
        this.setListAdapter(adapter);
    }
}
