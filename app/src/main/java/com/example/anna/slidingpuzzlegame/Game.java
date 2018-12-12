package com.example.anna.slidingpuzzlegame;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.Random;

public class Game extends AppCompatActivity {
    private ArrayList<Bitmap> pieces;
    private ImageView imageView;
    private Bitmap bitmap;
    //private ImageView imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        bitmap = getIntent().getParcelableExtra("bitmap");
        final RelativeLayout layout = findViewById(R.id.layout);
        imageView = (ImageView) findViewById(R.id.imageView);
        //imageView.setImageBitmap(thumbnail);
        imageView.setImageBitmap(bitmap);

        ImageView circle = (ImageView) findViewById(R.id.circle);

        /*
        Display display = getWindowManager().getDefaultDisplay();
        Point screenSize= new Point();
        display.getSize(screenSize);
        int width = screenSize.x;
        int height = screenSize.y;
        */

        int width = layout.getWidth();
        int height = layout.getHeight();
        Random random = new Random();
        float x = (float) Math.random() * width;
        float y = (float) Math.random() * height;

        Bitmap bitmap = Bitmap.createBitmap(500, 500, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.BLUE);
        canvas.drawCircle(x, y, 10, paint);
        circle.setImageBitmap(bitmap);
    }

}


