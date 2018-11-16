package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice5DrawOvalView extends View {

    public Practice5DrawOvalView(Context context) {
        super(context);
    }

    public Practice5DrawOvalView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice5DrawOvalView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawOval() 方法画椭圆

        int width = getMeasuredWidth();
        int height = getMeasuredHeight();

        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        RectF rectF = new RectF(width / 2 - 300, height / 2 - 150, width / 2 + 300, height / 2 + 150);
        canvas.drawOval(rectF, paint);
//        canvas.drawOval(width / 2 - 300, height / 2 - 150, width / 2 + 300, height / 2 + 150, paint);
    }
}
