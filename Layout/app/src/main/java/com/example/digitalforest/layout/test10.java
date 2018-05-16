package com.example.digitalforest.layout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class test10 extends AppCompatActivity {
    Button btnAdd,btnSub,btnMult,btnDiv,btnDelete,btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test10);

        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMult = findViewById(R.id.btnMult);
        btnDiv = findViewById(R.id.btnDiv);
        btnDelete = findViewById(R.id.btnDelete);
        btnClear = findViewById(R.id.btnClear);

        Listener listener = new Listener();
        btnAdd.setOnClickListener(listener);
        btnSub.setOnClickListener(listener);
        btnMult.setOnClickListener(listener);
        btnDiv.setOnClickListener(listener);
        btnDelete.setOnClickListener(listener);
        btnClear.setOnClickListener(listener);
    }

    class Listener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            btnDelete.setVisibility(View.INVISIBLE);
            btnClear.setVisibility(View.VISIBLE);
        }
    }
}
