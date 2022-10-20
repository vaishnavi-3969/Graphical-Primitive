package com.example.graphicalprimitive;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //creating a bitmap
        Bitmap bg = Bitmap.createBitmap(720,1280,Bitmap.Config.ARGB_8888);
        //setting the bitmap as background for the ImageView
        ImageView i = (ImageView) findViewById(R.id.imageView);
        i.setBackgroundDrawable(new BitmapDrawable(bg));
        //creating the canvas object
        Canvas canvas = new Canvas(bg);

        //creating the paint object and set its color and textsize
        Paint paint = new Paint();
        paint.setColor(Color.MAGENTA);
        paint.setTextSize(50);
        paint.setShadowLayer(50,34,34,Color.BLACK);

        //to draw a rectangle
        canvas.drawText("Rectangle",420,150,paint);
        canvas.drawRect(400,200,650,700,paint);
        paint.setColor(Color.GREEN);

        //to draw a circle
        canvas.drawText("Circle",120,150,paint);
        canvas.drawCircle(200,350,150,paint);
        paint.setColor(Color.RED);

        //to draw a square
        canvas.drawText("Square",120,800,paint);
        canvas.drawRect(50,850,350,1150,paint);
        paint.setColor(Color.BLUE);

        //to draw a line
        canvas.drawText("Line",480,800,paint);
        canvas.drawLine(520,850,520,1150,paint);

    }
}
