package com.example.digitalforest.test_ui_thread01;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //为button1添加一个动画操作
        Button button = findViewById(R.id.button);
        TranslateAnimation animation = new TranslateAnimation(0,150,0,0);
        animation.setRepeatCount(30);
        animation.setDuration(5000);
        button.setAnimation(animation);

        final Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                //使用post方式
                /*
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        Log.i("DEBUG","线程开始执行");
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        final int sum = 10;
                        v.post(new Runnable() {
                            @Override
                            public void run() {
                                Log.i("DEBUG","POST开始执行");
                                button2.setText("" + sum);
                            }
                        });
                        Log.i("DEBUG","线程结束执行");
                    }
                }).start();
                */
                //使用AsyncTask方式
                new DownloadFilesTask().execute();
            }
        });
    }

    private class DownloadFilesTask extends AsyncTask<String, Void, Integer> {
        protected Integer doInBackground(String... urls) {
           try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int sum = 10;
            return sum;
        }

       protected void onProgressUpdate(Integer... progress) {
       }

       protected void onPostExecute(Integer result) {
          Button button = findViewById(R.id.button2);
          button.setText("" + result);
       }
    }
}
