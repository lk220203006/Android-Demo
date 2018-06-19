package com.example.digitalforest.a11service;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NotificationActivity extends AppCompatActivity {

    TextView textView;
    Button nofityBtn,cancelBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        textView = findViewById(R.id.textView7);
        nofityBtn = findViewById(R.id.notifybtn);
        cancelBtn = findViewById(R.id.cancelbtn);

        nofityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Notification.Builder builder = new Notification.Builder(NotificationActivity.this);
                builder.setContentTitle("Test")
                .setContentText("this is test")
                        .setSmallIcon(R.drawable.ic_launcher_background);

                PendingIntent pendingIntent = PendingIntent.getActivity(getApplicationContext(),0,new Intent(getApplicationContext(),TestActivity.class),PendingIntent.FLAG_UPDATE_CURRENT);
                builder.setContentIntent(pendingIntent);

                NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                manager.notify(1,builder.getNotification());
            }
        });

        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                manager.cancel(1);
            }
        });
    }
}
