package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.annotation.ColorRes;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    private static int SPACE = 28;

    // 项目数量
    private int mCount = 7;

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        // 综合练习
        // 练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        int width = getMeasuredWidth();
        int height = getMeasuredHeight();
        RectF rectF = new RectF(200, 100, width - 200, height - 300);

        drawAxis(canvas, rectF);

        // 每个直方图项的宽度
        int itemWidth = (int) ((rectF.width() - (mCount + 1) * SPACE) / mCount);

        RectF rectF1 = new RectF(rectF.left + SPACE, rectF.bottom - 4, rectF.left + SPACE + itemWidth, rectF.bottom - 2);
        drawItem(canvas, rectF1, "Froyo");

        rectF1 = new RectF(rectF.left + SPACE + (SPACE + itemWidth) * 1, rectF.bottom - 30, rectF.left + (SPACE + itemWidth) * 2, rectF.bottom - 2);
        drawItem(canvas, rectF1, "GB");

        rectF1 = new RectF(rectF.left + SPACE + (SPACE + itemWidth) * 2, rectF.bottom - 30, rectF.left + (SPACE + itemWidth) * 3, rectF.bottom - 2);
        drawItem(canvas, rectF1, "ICS");

        rectF1 = new RectF(rectF.left + SPACE + (SPACE + itemWidth) * 3, rectF.bottom - 200, rectF.left + (SPACE + itemWidth) * 4, rectF.bottom - 2);
        drawItem(canvas, rectF1, "JB");

        rectF1 = new RectF(rectF.left + SPACE + (SPACE + itemWidth) * 4, rectF.bottom - 360, rectF.left + (SPACE + itemWidth) * 5, rectF.bottom - 2);
        drawItem(canvas, rectF1, "KitKat");

        rectF1 = new RectF(rectF.left + SPACE + (SPACE + itemWidth) * 5, rectF.bottom - 420, rectF.left + (SPACE + itemWidth) * 6, rectF.bottom - 2);
        drawItem(canvas, rectF1, "L");

        rectF1 = new RectF(rectF.left + SPACE + (SPACE + itemWidth) * 6, rectF.bottom - 180, rectF.left + (SPACE + itemWidth) * 7, rectF.bottom - 2);
        drawItem(canvas, rectF1, "M");
    }

    private void drawAxis(Canvas canvas, RectF rectF) {
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setStrokeWidth(2);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.WHITE);

        canvas.drawLine(rectF.left, rectF.top, rectF.left, rectF.bottom, paint);

        canvas.drawLine(rectF.left, rectF.bottom, rectF.right, rectF.bottom, paint);
    }

    private void drawItem(Canvas canvas, RectF rectF, String text) {
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.GREEN);

        canvas.drawRect(rectF, paint);

        paint.setTextSize(36);
        Rect rect = new Rect();
        paint.getTextBounds(text, 0, text.length(), rect);
        paint.setColor(Color.WHITE);
        canvas.drawText(text, rectF.centerX()- rect.width() / 2, rectF.bottom + rect.height() + 4, paint);
    }
}
