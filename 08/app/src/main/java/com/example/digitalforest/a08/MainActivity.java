package com.example.digitalforest.a08;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String[] content = {"aaa","BBB","CCC"};
//                new AlertDialog.Builder(MainActivity.this)
////                        .setMultiChoiceItems(content, null, new DialogInterface.OnMultiChoiceClickListener() {
////                            @Override
////                            public void onClick(DialogInterface dialog, int which, boolean isChecked) {
////                                Toast.makeText(MainActivity.this,"Test",Toast.LENGTH_SHORT).show();
////                            }
////                        })
////                        .setItems(content, new DialogInterface.OnClickListener() {
////                            @Override
////                            public void onClick(DialogInterface dialog, int which) {
////                                Toast.makeText(MainActivity.this,"Test",Toast.LENGTH_SHORT).show();
////                            }
////                        })
//                        .setMessage("这是一个对话框")
//                        .setTitle("测试")
//                        .setPositiveButton("右边的", new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialog, int which) {
//                                Toast.makeText(MainActivity.this,"点击右边的按钮",Toast.LENGTH_SHORT).show();
//                            }
//                        })
////                        .setNegativeButton("中间的",null)
////                        .setNeutralButton("左边的",null)
//                        .setIcon(R.drawable.ic_launcher_foreground)
//                        .show();
//            }
//        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"这是一个测试",Toast.LENGTH_SHORT).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = new Toast(MainActivity.this);
                View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.testview,null);
                toast.setView(view);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL,0,0);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}
