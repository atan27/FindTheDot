package com.example.anna.findthedot;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Game extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        // variable imageView displays taken/chosen image
        ImageView imageView;

        // variable bitmap is the bitmap image of photo from gallery or the photo taken from the camera
        Bitmap bitmap;

        // displays selected photo from gallery onto this new activity
        bitmap = getIntent().getParcelableExtra("bitmap");
        imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageBitmap(bitmap);

        // declares the view in which the circle image will be displayed
        ImageView circle = (ImageView) findViewById(R.id.circle);

        // creates a bitmap image for the circle to place onto canvas
        Bitmap bitmap2 = Bitmap.createBitmap(54, 54, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap2);
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.BLUE);


        // generates random floats for the circle to be placed at
        float x = (float) Math.random() * bitmap2.getWidth();
        float y = (float) Math.random() * bitmap2.getHeight();


        // draws the canvas circle on the bitmap image at a random point
        canvas.drawCircle(x, y, 10, paint);

        // displays the circle at the random point
        circle.setImageBitmap(bitmap2);

        circle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                endOfGame();
            }
        });
    }

    public void endOfGame() {
        Intent intent = new Intent(this, End.class);
        startActivity(intent);
    }
}


