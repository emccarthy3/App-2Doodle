package edu.elon.cs.dotpainter;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by emccarthy3 on 9/8/2015.
 */
public class Line {


    private float x0, y0, x1, y1;
    private int width;
    private Paint paint;

    public Line(float x0, float y0, float x1, float y1,Paint paint, int width) {
        this.x0 = x0;
        this.y0= y0;
        this.x1 = x1;
        this.y1 = y1;
        // random color
        int red = (int) (Math.random() * 256);
        int green = (int) (Math.random() * 256);
        int blue = (int) (Math.random() * 256);
        int alpha = (int) (Math.random() * 256);
        paint = new Paint();
        paint.setARGB(alpha, red, green, blue);
        this.width = width;
    }
public void setx0(float x01) {
        x0 = x01;
    }
    public float getx0(){
        return x0;
    }
    public void sety0(float y01) {
        y0 = y01;
    }
    public float gety0(){
        return y0;
    }
    public void draw(Canvas canvas) {
        canvas.drawLine(x0, y0, x1, y1, paint);
    }
}
