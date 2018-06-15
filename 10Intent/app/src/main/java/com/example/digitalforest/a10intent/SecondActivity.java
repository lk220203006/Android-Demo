package com.example.digitalforest.a10intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    EditText etName,etPwd;
    Button btnOK,btnCancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        etName = findViewById(R.id.nameET);
        etPwd = findViewById(R.id.pwdET);
        btnOK = findViewById(R.id.btnOK);
        btnCancel = findViewById(R.id.btnCancel);

//        Intent intent = getIntent();
////        String content = intent.getStringExtra("content");
////        int cnt = intent.getIntExtra("count",0);
//
//        Bundle bundle = intent.getBundleExtra("bundle");
//        String content = bundle.getString("content");
//        int cnt = bundle.getInt("count",0);
//
//        etName.setText(content+" "+cnt);

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent();
                intent1.putExtra("test","this is test");
                setResult(0x0001,intent1);
                finish();
            }
        });
    }
}
