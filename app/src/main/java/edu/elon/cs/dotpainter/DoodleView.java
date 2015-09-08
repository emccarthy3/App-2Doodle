package edu.elon.cs.dotpainter;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;

/**
 * Draw dots to the screen on touches.
 *
 * @author J. Hollingsworth and CSC 303 - Fall 2015
 */
public class DoodleView extends View {

    private ArrayList<Line> theLines;
private float x0, y0,x1,y1;
    public DoodleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        theLines = new ArrayList<Line>();

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        x0 = (event.getX());
        y0 = (event.getY());
        return true;
    }
    @Override
public boolean onMoveEvent (MotionEvent event){
        if (event.getAction() == MotionEvent.ACTION_DOWN){
            x0 = event.getX();
            y0 = event.getY();
        }
        else if (event.getAction() == MotionEvent.ACTION_MOVE) {

            int p = event.getPointerCount();
            for (int i = 0; i < p; i++) {
                line.draw(event.getX(i), event.getY(i), paint);
            }
        }
   theLines.add(x0,y0, x1,y1, paint, width);
}
    @Override
    protected void onDraw(Canvas canvas) {

        for (Line lines : theLines) {
            lines.draw(canvas);
        }
        invalidate();
    }
}