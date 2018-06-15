package com.example.digitalforest.a10intent;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);

        button = findViewById(R.id.login);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.action.login");
                //传值
//                intent.putExtra("content",editText.getText()+"");

//                Bundle bundle = new Bundle();
//                bundle.putString("content",editText.getText()+"");
//                bundle.putInt("count",10);
//                intent.putExtra("bundle",bundle);
                //接收值回传
                startActivityForResult(intent,0x0001);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 0x0001){
            String string = data.getStringExtra("test");
            Log.i("TEST",string);
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}
