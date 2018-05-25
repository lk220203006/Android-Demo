package com.example.digitalforest.a06;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class ProgressBarDemo extends AppCompatActivity {
    ProgressBar progressBar;
    Button button;
    TextView textView;
    int progress = 0;
    TextView textView5;
    TextView textView6;
    SeekBar seekBar,seekBar2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.progressbardemo);

        progressBar = findViewById(R.id.progressBar2);
        button = findViewById(R.id.button2);
        textView = findViewById(R.id.textView4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progress += 10;
                progressBar.setProgress(progress);
                textView.setText(progressBar.getProgress()+"");
            }
        });

        textView5 = findViewById(R.id.textView5);
        textView6 = findViewById(R.id.textView6);
        seekBar = findViewById(R.id.seekBar);
        seekBar2 = findViewById(R.id.seekBar2);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textView5.setText(progress+"");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textView6.setText(progress+"");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
