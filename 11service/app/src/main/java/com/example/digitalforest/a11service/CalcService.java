package com.example.digitalforest.a11service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

public class CalcService extends Service {
    double result = 0;
    CalcBinder calcBinder = new CalcBinder();
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        int sex = intent.getIntExtra("sex",0);
        double height = intent.getDoubleExtra("height",0);
        calc(sex,height);
        return calcBinder;
    }

    private void calc(int sex,double height){
        if (sex == 0){
            result = (height-80)*0.7;
        }
        else{
            result = (height-70)*0.6;
        }
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    class CalcBinder extends Binder {
        public double gerResult(){
            return result;
        }
    }
}
