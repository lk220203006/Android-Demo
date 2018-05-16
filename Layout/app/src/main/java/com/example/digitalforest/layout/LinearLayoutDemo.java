package com.example.digitalforest.layout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class LinearLayoutDemo extends AppCompatActivity {

    Button btn1,btn2;
    LinearLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);

        layout = findViewById(R.id.layout);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setOrientation(LinearLayout.HORIZONTAL);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setOrientation(LinearLayout.VERTICAL);
            }
        });
    }
}
