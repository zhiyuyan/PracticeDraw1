package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        int width = getMeasuredWidth();
        int height = getMeasuredHeight();
        RectF rectF = new RectF(width / 2 - 400, height / 2 - 300, width / 2 + 200, height / 2 + 300);

        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

        paint.setColor(Color.rgb(255, 193, 7));
        canvas.drawArc(rectF, -45, 45, true, paint);

        paint.setColor(Color.rgb(156, 39, 176));
        canvas.drawArc(rectF, 0, 10, true, paint);

        paint.setColor(Color.rgb(158,158,158));
        canvas.drawArc(rectF, 10, 10, true, paint);

        paint.setColor(Color.rgb(0,150,136));
        canvas.drawArc(rectF, 20, 45, true, paint);

        paint.setColor(Color.rgb(33,150,243));
        canvas.drawArc(rectF, 65, 115, true, paint);

        paint.setColor(Color.rgb(244,67,54));
        canvas.translate(-20, -20);
        canvas.drawArc(rectF, 180, 135, true, paint);
    }
}
