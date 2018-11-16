package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形

        int width = getMeasuredWidth();
        int height = getMeasuredHeight();

        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

        RectF rectF = new RectF(width / 2 - 300, height / 2 - 240, width / 2 + 300, height / 2 + 240);
        canvas.drawArc(rectF, -15f, -80f, true, paint);

        paint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(rectF, -110f, -50f, false, paint);

        paint.setStyle(Paint.Style.FILL);
        canvas.drawArc(rectF, -190f, -140f, false, paint);

    }
}
