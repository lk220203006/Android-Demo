package com.example.digitalforest.gamedemo;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;

public class checkbox extends AppCompatActivity {
    CheckBox chkItc,chkBold;
    EditText etContent;
    int style;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);

        chkItc = findViewById(R.id.chkItc);
        chkBold = findViewById(R.id.chkBold);
        etContent = findViewById(R.id.etContent);

        CheckChange checkChange = new CheckChange();
        chkItc.setOnCheckedChangeListener(checkChange);
        chkBold.setOnCheckedChangeListener(checkChange);
    }

    class CheckChange implements CompoundButton.OnCheckedChangeListener{
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            switch (buttonView.getId()){
                case R.id.chkItc:
                    if (isChecked){
                        style += Typeface.ITALIC;
                    }
                    else{
                        style -= Typeface.ITALIC;
                    }
                    break;
                case R.id.chkBold:
                    if (isChecked){
                        style += Typeface.BOLD;
                    }
                    else{
                        style -= Typeface.BOLD;
                    }
                    break;
            }
            etContent.setTypeface(Typeface.DEFAULT,style);
        }
    }
}
