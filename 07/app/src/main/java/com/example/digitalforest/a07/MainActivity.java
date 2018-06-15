package com.example.digitalforest.a07;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuBuilder;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

import java.lang.reflect.Method;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textview);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflate = new MenuInflater(this);
        inflate.inflate(R.menu.menu3,menu);

//        menu.add(Menu.NONE,0x001,1,"AAA");
//        menu.add(Menu.NONE,0x002,3,"BBB");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.item10:
                textView.setTextSize(10*2);
                break;
            case R.id.item12:
                textView.setTextSize(12*2);
                break;
            case R.id.item14:
                textView.setTextSize(14*2);
                break;
            case R.id.itemRed:
                textView.setTextColor(Color.RED);
                break;
            case R.id.itemBlue:
                textView.setTextColor(Color.BLUE);
                break;
            case R.id.itemGreen:
                textView.setTextColor(Color.GREEN);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        Log.i("TEST","onPrepareOptionsMenu");
//        if (menu != null) {
//            if (menu.getClass() == MenuBuilder.class) {
//                try {
//                    Method m = menu.getClass().getDeclaredMethod("setOptionalIconsVisible", Boolean.TYPE);
//                    m.setAccessible(true);
//                    m.invoke(menu, true);
//                } catch (Exception e) {
//                }
//            }
//        }
        return super.onPrepareOptionsMenu(menu);
    }
}
