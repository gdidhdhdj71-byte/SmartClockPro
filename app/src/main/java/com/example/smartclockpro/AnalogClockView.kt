package com.example.smartclockpro

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class AnalogClockView(
    context: Context,
    attrs: AttributeSet?
) : View(context, attrs) {

    private val paint = Paint()

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        val radius =
            (width.coerceAtMost(height) / 2f) - 20f

        paint.color = Color.BLACK
        paint.strokeWidth = 8f
        paint.style = Paint.Style.STROKE

        canvas.drawCircle(
            width / 2f,
            height / 2f,
            radius,
            paint
        )
    }
}
