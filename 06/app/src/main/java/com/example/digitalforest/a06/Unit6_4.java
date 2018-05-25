package com.example.digitalforest.a06;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Unit6_4 extends AppCompatActivity {
    MyLogin myLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unit6_4);

        myLogin = findViewById(R.id.mylogin);
        myLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
