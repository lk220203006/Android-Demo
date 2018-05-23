package com.example.digitalforest.layout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class test7 extends AppCompatActivity {
    Button btn1,btn2;
    LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test7);

        btn1 = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
        linearLayout = findViewById(R.id.LinearLayoutBottom);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout.setVisibility(View.VISIBLE);
            }
        });
    }
}
