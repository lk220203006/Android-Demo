package com.example.digitalforest.mysave;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test1);

        TextView textView = findViewById(R.id.tvTest);
        textView.setTypeface(Typeface.MONOSPACE,Typeface.ITALIC);
        textView.setTextSize(24);
        textView.setTextColor(Color.BLUE);

        Button button = findViewById(R.id.btnOK);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //事件
                Log.i("TEST","onclick");
            }
        });
    }
}
