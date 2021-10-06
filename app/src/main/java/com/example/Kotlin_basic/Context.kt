package com.example.Kotlin_basic

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Context : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_context)

        val context : Context = this
        val applicationContext : Context = applicationContext as Context
    }
}