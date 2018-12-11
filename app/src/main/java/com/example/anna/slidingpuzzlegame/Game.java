package com.example.anna.slidingpuzzlegame;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;

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
        final LinearLayout layout = findViewById(R.id.layout);
        imageView = (ImageView) findViewById(R.id.imageView);
        //imageView.setImageBitmap(thumbnail);
        imageView.setImageBitmap(bitmap);
    }

}


