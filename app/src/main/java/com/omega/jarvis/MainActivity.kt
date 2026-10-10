package com.omega.jarvis
import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import android.graphics.Color

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tv = TextView(this)
        tv.text = "JARVIS OMEGA\nONLINE\nID:99999999\nStatus: OPERATIONAL"
        tv.textSize = 24f
        tv.setTextColor(Color.CYAN)
        tv.setBackgroundColor(Color.BLACK)
        tv.setPadding(100, 300, 100, 100)
        setContentView(tv)
    }
}
