package com.example.john.testapp;

/**
 * Created by John on 2017-04-01.
 */

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.SurfaceHolder;

public class TextDrawer {

    private Paint paint;
    private Color col = new Color();

    public void surfaceCreated(SurfaceHolder holder){

        paint = new Paint();
        paint.setColor(col.WHITE);
        paint.setTextSize(24);

    }

    /*public void draw(Canvas canvas) {
        canvas.drawText("Something", 0, paint.getTextSize(), paint);
    }*/
}
