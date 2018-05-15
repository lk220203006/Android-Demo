package com.example.digitalforest.test_listener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Button button = findViewById(R.id.button1);
//        Button button2 = findViewById(R.id.button2);
//        Button button3 = findViewById(R.id.button3);

//        button.setOnClickListener(myListener);
//        button2.setOnClickListener(myListener);
//        button3.setOnClickListener(myListener);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this,"button被点击了",Toast.LENGTH_SHORT).show();
//            }
//        });
        final Button button = findViewById(R.id.button1);
//        button.setOnLongClickListener(new View.OnLongClickListener() {
//            @Override
//            public boolean onLongClick(View v) {
//                System.out.println("onLongClick");
//                return true;
//            }
//        });
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                System.out.println("onClick");
//            };
//        });
//        button.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                //event对象记录了事件发生现场情况
//                int actionType = event.getAction();
//                if (actionType == MotionEvent.ACTION_DOWN){
//                    System.out.println("ACTION_DOWN");
//                }
//                else if (actionType == MotionEvent.ACTION_MOVE){
//                    System.out.println("ACTION_MOVE");
//                }
//                else if (actionType == MotionEvent.ACTION_UP){
//                    System.out.println("ACTION_UP");
//                }
//                return true;
//            }
//        });
//        button.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//            @Override
//            public void onFocusChange(View v, boolean hasFocus) {
//                if (hasFocus){
//                    System.out.println("hasfocus");
//                }
//                else{
//                    System.out.println("diss focus");
//                }
//            }
//        });

        button.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                //keycode
                if (event.getAction() == KeyEvent.ACTION_UP) {
                    System.out.println(keyCode);
                    if (keyCode == 29) {
                        button.setX(button.getX() - 20);
                    } else if (keyCode == 32) {
                        button.setX(button.getX() + 20);
                    } else if (keyCode == 51) {
                        button.setY(button.getY() - 20);
                    } else if (keyCode == 47) {
                        button.setY(button.getY() + 20);
                    } else {

                    }
                }
                return true;
            }
        });

//        ViewGroup viewGroup = findViewById(R.id.layout1);
//        viewGroup.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                int actionType = event.getAction();
//                if (actionType == MotionEvent.ACTION_DOWN){
//                    System.out.println("ACTION_DOWN");
//                }
//                else if (actionType == MotionEvent.ACTION_MOVE){
//                    System.out.println("ACTION_MOVE");
//                    button.setX(event.getX());
//                    button.setY(event.getY());
//                }
//                else if (actionType == MotionEvent.ACTION_UP){
//                    System.out.println("ACTION_UP");
//                }
//                return true;
//            }
//        });
    }

//    public void test2(View v){
//        v.setX(v.getX()+10);
//        Toast.makeText(MainActivity.this,"button被点击了2",Toast.LENGTH_SHORT).show();
//    }

//    private View.OnClickListener myListener = new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            switch (v.getId()){
//                case R.id.button1:
//                    Toast.makeText(MainActivity.this,"button被点击了",Toast.LENGTH_SHORT).show();
//                    break;
//                case R.id.button2:
//                    Toast.makeText(MainActivity.this,"button2被点击了",Toast.LENGTH_SHORT).show();
//                    break;
//                case R.id.button3:
//                    Toast.makeText(MainActivity.this,"button3被点击了",Toast.LENGTH_SHORT).show();
//                    break;
//            }
//        }
//    };
}
