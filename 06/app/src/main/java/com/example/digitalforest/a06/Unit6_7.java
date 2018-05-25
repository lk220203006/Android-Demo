package com.example.digitalforest.a06;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Timer;
import java.util.TimerTask;

public class Unit6_7 extends AppCompatActivity {

    Button btnStartGame;
    TextView textView;
    ProgressBar progressBar;

    int progress = 0;
    Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what){
                case 0x001:
                    progressBar.setVisibility(View.VISIBLE);
                    textView.setVisibility(View.VISIBLE);
                    progressBar.setProgress(progress);
                    break;
                case 0x002:
                    textView.setText("游戏加载完成");
                    progressBar.setVisibility(View.INVISIBLE);
                    timerTask.cancel();
                    timer.cancel();
                    break;
            }
        }
    };
    Timer timer = new Timer();
    TimerTask timerTask = new TimerTask() {
        @Override
        public void run() {
            if (progress < 100) {
                progress++;
                Log.i("TEST", progress + "");
                handler.sendEmptyMessage(0x001);
            }
            else {
                handler.sendEmptyMessage(0x002);
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unit6_7);

        textView = findViewById(R.id.textView7);
        progressBar = findViewById(R.id.progressBar5);
        btnStartGame = findViewById(R.id.btnStartGame);

        textView.setVisibility(View.INVISIBLE);
        progressBar.setVisibility(View.INVISIBLE);
        btnStartGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timer.schedule(timerTask,0,100);
            }
        });
    }
}
