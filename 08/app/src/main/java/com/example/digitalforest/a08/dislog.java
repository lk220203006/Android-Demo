package com.example.digitalforest.a08;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class dislog extends AppCompatActivity {
    MyDialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDialog = new MyDialog(this,R.style.MyDialog);
        myDialog.setTitle("这是一个title");

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.show();
            }
        });
    }

    class MyDialog extends Dialog{

        public MyDialog(@NonNull Context context) {
            super(context);
        }

        public MyDialog(@NonNull Context context, int themeResId) {
            super(context, themeResId);
        }

        protected MyDialog(@NonNull Context context, boolean cancelable, @Nullable OnCancelListener cancelListener) {
            super(context, cancelable, cancelListener);
        }

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            setContentView(R.layout.dialog);
            findViewById(R.id.btnok).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    MyDialog.this.dismiss();
                    Toast.makeText(dislog.this,"OK",Toast.LENGTH_SHORT).show();
                }
            });
            super.onCreate(savedInstanceState);
        }
    }
}
