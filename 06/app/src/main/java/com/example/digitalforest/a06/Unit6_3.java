package com.example.digitalforest.a06;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;

public class Unit6_3 extends AppCompatActivity {
    TabHost tabHost;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unit6_3);
        tabHost = findViewById(R.id.tabhost2);
        tabHost.setup();

        button = findViewById(R.id.btnClick);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tabHost.addTab(tabHost.newTabSpec("TEST").setIndicator("test").setContent(new TabHost.TabContentFactory() {
                    @Override
                    public View createTabContent(String tag) {
                        View view = LayoutInflater.from(getApplicationContext()).inflate(R.layout.tab,null);
                        return view;
                    }
                }));
            }
        });


        tabHost.addTab(tabHost.newTabSpec("TEST").setIndicator("Click").setContent(R.id.tab1));
        tabHost.addTab(tabHost.newTabSpec("TEST").setIndicator("",getDrawable(R.drawable.b)).setContent(R.id.tab2));
    }
}
