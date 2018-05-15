package com.example.digitalforest.gamedemo;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ScreenActivity extends AppCompatActivity {
    TextView textView;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen);
        textView = findViewById(R.id.tvScreen);
        editText = findViewById(R.id.editText);

        editText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_UP) {
                    Log.i("TEST", "" + keyCode);
                }
                return false;
            }
        });
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        String pos = "x=" + event.getX() + ",y=" + event.getY();
        textView.setText(pos);
        if (event.getAction() == MotionEvent.ACTION_DOWN){
            Log.i("TEST","ACTION_DOWN");
            textView.setBackgroundColor(Color.GRAY);
        }
        else if (event.getAction() == MotionEvent.ACTION_UP){
            Log.i("TEST","ACTION_UP");
            textView.setBackgroundColor(Color.YELLOW);
        }
        else if (event.getAction() == MotionEvent.ACTION_MOVE){
            Log.i("TEST","ACTION_MOVE");
            textView.setBackgroundColor(Color.LTGRAY);
        }
        return super.onTouchEvent(event);
    }


}
