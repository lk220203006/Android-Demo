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
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class CalcWeight extends AppCompatActivity {
    Button btnCalc;
    EditText etHeight;
    RadioButton rbtF,rbtM;
    CalcService.CalcBinder myBinder;
    TextView textView;
    ServiceConnection serviceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            myBinder = (CalcService.CalcBinder)service;
            double result = myBinder.gerResult();
            textView.setText("您的标准体重是:"+result+"");
            Log.i("TEST",result+"");
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {

        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calcweight);

        btnCalc = findViewById(R.id.btnCalc);
        etHeight = findViewById(R.id.etHeight);
        rbtF = findViewById(R.id.radioButton);
        rbtM = findViewById(R.id.radioButton2);
        textView = findViewById(R.id.textView6);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sex = 0;
                if (rbtM.isSelected()){
                    sex = 0;
                }
                else{
                    sex = 1;
                }
                double height = 0;
                try {
                    height = Double.parseDouble(etHeight.getText()+"");
                }
                catch (Exception e){
                    etHeight.setText("");
                    etHeight.requestFocus();
                    return;
                }

                Intent intent = new Intent();
                intent.setAction("com.action.CalcService");
                intent.setPackage(getPackageName());
                intent.putExtra("sex",sex);
                intent.putExtra("height",height);
                bindService(intent,serviceConnection,BIND_AUTO_CREATE);
            }
        });
    }
}
