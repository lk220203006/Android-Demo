package com.example.digitalforest.gamedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class RadioButton extends AppCompatActivity {

    TextView textView;
    RadioGroup radioGroup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);

        textView = findViewById(R.id.textView);

        radioGroup = findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int money = 0;
                switch (checkedId){
                    case R.id.radioButton:
                        money = 50;
                        break;
                    case R.id.radioButton2:
                        money = 100;
                        break;
                    case R.id.radioButton3:
                        money = 150;
                        break;
                }
                textView.setText(getString(R.string.amount) + ":"+ money);
            }
        });
    }
}
