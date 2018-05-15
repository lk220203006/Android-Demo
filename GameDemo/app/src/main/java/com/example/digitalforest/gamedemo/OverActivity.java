package com.example.digitalforest.gamedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class OverActivity extends AppCompatActivity {

    Button btnOK;
    EditText etName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.over);

        btnOK = findViewById(R.id.btnOK);
        etName = findViewById(R.id.etName);

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //事件处理程序
                //判断输入的姓名是否为空
                String name = (etName.getText() + "").trim();
                if (name.equals("")){
                    Toast.makeText(OverActivity.this,"test2", Toast.LENGTH_SHORT).show();
                    return;
                }
            }
        });
    }
}
