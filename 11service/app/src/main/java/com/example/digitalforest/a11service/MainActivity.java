package com.example.digitalforest.a11service;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button,button2,button3,button4,button5;
    MyService.MyBinder myBinder;
    ServiceConnection serviceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            Log.i(MyService.TAG,"onServiceConnected");
            myBinder = (MyService.MyBinder)service;
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            Log.i(MyService.TAG,"onServiceDisconnected");
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction("com.action.MyService");
                intent.setPackage(getPackageName());
                startService(intent);
            }
        });

        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction("com.action.MyService");
                intent.setPackage(getPackageName());
                stopService(intent);
            }
        });

        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction("com.action.MyService");
                intent.setPackage(getPackageName());
                bindService(intent,serviceConnection,BIND_AUTO_CREATE);
            }
        });

        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction("com.action.MyService");
                intent.setPackage(getPackageName());
                unbindService(serviceConnection);
            }
        });

        button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cnt = myBinder.getData();
                Toast.makeText(MainActivity.this,cnt+"",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
