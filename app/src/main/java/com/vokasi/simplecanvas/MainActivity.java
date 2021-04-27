package com.vokasi.simplecanvas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.widgets.Rectangle;
import androidx.core.content.res.ResourcesCompat;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Canvas mCanvas;
    private Paint mPaint = new Paint();
    private Paint mPaintText = new Paint(Paint.ANTI_ALIAS_FLAG);
    private Bitmap mBitmap;
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageView = findViewById(R.id.my_imageview);
        mPaint.setColor(Color.YELLOW);
        mPaintText.setColor(ResourcesCompat.getColor(getResources(),
                R.color.black, null));
        mPaintText.setTextSize(60);
    }

    public void drawSomething(View view) {
        int vWidth = view.getWidth();
        int vHeight = view.getHeight();
        mBitmap = Bitmap.createBitmap(vWidth,vHeight,Bitmap.Config.ARGB_8888);
        mImageView.setImageBitmap(mBitmap);
        mCanvas = new Canvas(mBitmap);
        mCanvas.drawColor(Color.CYAN);
        mCanvas.drawText("Mazaya Sabrina Nurkholik",200,100,mPaintText);

        Path path = new Path();
        path.moveTo(100,550);
        path.lineTo(550,200);
        path.lineTo(1000,550);
//        path.lineTo(700,800);
        mPaint.setColor(Color.BLACK);
        mCanvas.drawPath(path,mPaint);

        mPaint.setColor(Color.LTGRAY);
        Rect tembok = new Rect();
        tembok.set(200,550,900,1100);
        mCanvas.drawRect(tembok,mPaint);

        mPaint.setColor(Color.BLACK);
        Rect pintu = new Rect();
        pintu.set(250,650,550,1100);
        mCanvas.drawRect(pintu,mPaint);

        mPaint.setColor(Color.BLACK);
        Rect jendela = new Rect();
        jendela.set(650,650,850,900);
        mCanvas.drawRect(jendela,mPaint);

        mPaint.setColor(Color.LTGRAY);
        mPaint.setStrokeWidth(2);
        mCanvas.drawLine(400, 650,400, 1100, mPaint);

        mPaint.setColor(Color.LTGRAY);
        mPaint.setStrokeWidth(2);
        mCanvas.drawLine(750, 650,750, 900, mPaint);

        mPaint.setColor(Color.LTGRAY);
        mPaint.setStrokeWidth(2);
        mCanvas.drawLine(650, 775,850, 775, mPaint);

        mPaint.setColor(Color.LTGRAY);
        mPaint.setStrokeWidth(4);
        mCanvas.drawLine(380, 850,380, 910, mPaint);

        mPaint.setColor(Color.LTGRAY);
        mPaint.setStrokeWidth(4);
        mCanvas.drawLine(420, 850,420, 910, mPaint);

        view.invalidate();
    }
}