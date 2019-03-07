package com.example.apps;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.EmbossMaskFilter;
import android.graphics.MaskFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;

public class PaintView extends View {
    public  static  int BRUSH_SIZE=15;
    public  static final int DEFAULT_COLOR= Color.RED;
    public  static final int BLack_COLOR= Color.BLACK;
    public  static final int BLUE_COLOR= Color.BLUE;
    public  static  final int ERASE_COLOR=Color.WHITE;
    public static final int DEFAULT_BG_COLOR=Color.WHITE;
    private static final float TOUCH_TOLORENCE=4;
    private float mX,mY;
    private Path mPath;
    private Paint mPaint;
    private ArrayList<FingerPath> paths=new ArrayList<>();
    private int currentColor;
    private int backgroundColor=DEFAULT_BG_COLOR;
    private int stroleWidth;
    private boolean emboss;
    private boolean blur;
    private boolean Erase;
    private Bitmap mBitmap;
    private Canvas mCanvas;
    private Paint mBitmapPaint=new Paint(Paint.DITHER_FLAG);
    public PaintView(Context context) {
        super(context);
    }

    public PaintView(Context context, AttributeSet attrs) {
        super(context, attrs);

        mPaint=new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setDither(true);
        mPaint.setColor(DEFAULT_COLOR);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeJoin(Paint.Join.ROUND);
        mPaint.setStrokeCap(Paint.Cap.ROUND);
        mPaint.setXfermode(null);
        mPaint.setAlpha(0xff);

    }

    public void init(DisplayMetrics metrics){
        int hight=metrics.heightPixels;
        int width=metrics.widthPixels;

        mBitmap=Bitmap.createBitmap(width,hight,Bitmap.Config.ARGB_8888);
        mCanvas=new Canvas(mBitmap);

        currentColor=DEFAULT_COLOR;
        stroleWidth=BRUSH_SIZE;
    }

    public void normal(){
        emboss=false;
        blur=false;
    }

    public void emboss(){
        currentColor=BLack_COLOR;
    }

    public void blur(){
        currentColor=BLUE_COLOR;
    }
    public void Erase(){
        currentColor=ERASE_COLOR;
    }


    public void clear(){
        backgroundColor=DEFAULT_BG_COLOR;
        paths.clear();
        normal();
        invalidate();
    }


    @Override

    protected void onDraw(Canvas canvas)
    {
        canvas.save();
        mCanvas.drawColor(backgroundColor);


        for(FingerPath fp: paths){
            mPaint.setColor(fp.color);
            mPaint.setStrokeWidth(fp.strokWidth);
            mPaint.setMaskFilter(null);
            mCanvas.drawPath(fp.path,mPaint);
        }

        canvas.drawBitmap(mBitmap,0,0,mBitmapPaint);
        canvas.restore();
    }

    private void touchStart(float x,float y)
    {
        mPath=new Path();
        FingerPath fp=new FingerPath(currentColor,emboss,blur,stroleWidth,Erase,mPath);
        paths.add(fp);

        mPath.reset();
        mPath.moveTo(x,y);

        mX=x;
        mY=y;

    }

    private void touchMove(float x,float y)
    {
        float dx=Math.abs(x-mX);
        float dy=Math.abs(y-mY);

        if(dx>=TOUCH_TOLORENCE  || dy>=TOUCH_TOLORENCE)
        {
            mPath.quadTo(mX,mY,(x+mX)/2,(y+mY)/2);
            mX=x;
            mY=y;
        }
    }


    private void touchUp()
    {
        mPath.lineTo(mX,mY);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        float x=event.getX();
        float y=event.getY();

        switch (event.getAction())
        {
            case MotionEvent.ACTION_DOWN:
                touchStart(x,y);
                invalidate();
                break;
            case MotionEvent.ACTION_MOVE:
                touchMove(x,y);
                invalidate();
                break;
            case MotionEvent.ACTION_UP:
                touchUp();
                invalidate();
                break;
        }
        return  true;
    }
}
