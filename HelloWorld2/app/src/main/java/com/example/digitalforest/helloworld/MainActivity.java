package com.example.digitalforest.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void test(View view){
        TextView textView = findViewById(R.id.textView1);
        textView.setText(R.string.msg);
        Toast.makeText(MainActivity.this,"点击了button",Toast.LENGTH_SHORT).show();
        Log.i("test","bbb");
        Log.d("test","ddd");
        Log.e("test","ccc");
    }
}
