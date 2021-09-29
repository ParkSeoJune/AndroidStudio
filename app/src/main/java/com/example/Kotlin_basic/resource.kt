package com.example.Kotlin_basic

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_resource.*

class resource : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resource)

        // 1
        val ment = resources.getString(R.string.hello)
        Log.d("ment", "ment : " + ment)

        // 2
        val ment2 = getString(R.string.hello)
        Log.d("ment", "ment : " + ment2)

        val color = getColor(R.color.textview_color)
        Log.d("ment", "color : " + color)

        button.setBackgroundColor(getColor(R.color.textview_color))
    }


}