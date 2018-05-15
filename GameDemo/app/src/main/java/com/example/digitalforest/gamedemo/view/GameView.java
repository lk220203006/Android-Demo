package com.example.digitalforest.gamedemo.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

import com.example.digitalforest.gamedemo.R;

import java.util.jar.Attributes;

public class GameView extends View {
    private float planeX = 150;
    private float planeY = 300;
    private float bmpWidth;
    private float bmpHeight;
    Bitmap bitmap;
    GameView gameView;

    public GameView(Context context, AttributeSet attrs){
        super(context,attrs);
        bitmap = BitmapFactory.decodeResource(this.getResources(), R.drawable.baseline_account_balance_black_18dp);
        bmpWidth = bitmap.getWidth();
        bmpHeight = bitmap.getHeight();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawBitmap(bitmap,planeX- new Float(bmpWidth*0.5),planeY-new Float(bmpHeight),null);
        super.onDraw(canvas);
    }

    public void setPlaneX(float planeX) {
        this.planeX = planeX;
    }

    public void setPlaneY(float planeY) {
        this.planeY = planeY;
    }
}
