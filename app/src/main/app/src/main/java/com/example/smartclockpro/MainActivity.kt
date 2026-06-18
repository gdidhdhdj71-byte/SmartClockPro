package com.example.smartclockpro

import android.os.Bundle
import android.os.Handler
import android.widget.TextView
import androidx.activity.ComponentActivity
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : ComponentActivity() {

    private lateinit var txtClock: TextView
    private val handler = Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        txtClock = findViewById(R.id.txtClock)

        startClock()
    }

    private fun startClock() {
        handler.post(object : Runnable {
            override fun run() {
                val time =
                    SimpleDateFormat(
                        "HH:mm:ss",
                        Locale.getDefault()
                    ).format(Date())

                txtClock.text = time

                handler.postDelayed(this, 1000)
            }
        })
    }
}
