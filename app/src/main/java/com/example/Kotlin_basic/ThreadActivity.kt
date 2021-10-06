package com.example.Kotlin_basic

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_thread.*

class ThreadActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thread)


        val runnable: Runnable = object : Runnable {
            override fun run() {
                Log.d("thread-1", "Thread is made")
            }
        }
        val thread : Thread = Thread(runnable)
        button.setOnClickListener {
            thread.start()
        }

        // 람다를 사용하지 않은 방식
        Thread(object: Runnable{
            override fun run() {
                Log.d("thread-1", "Thread2 is made")
            }
        }).start()

        Thread(Runnable {
            Log.d("thread-1", "Thread3 is made")
            Thread.sleep(2000)
            // mainThread에서 돌아가는 thread
            runOnUiThread {
                button.setBackgroundColor(getColor(R.color.textview_color)) // runOnUiThread를 안쓰면 오류가 나는데 그 이유는 UI는 MainThread만 변경 할 수 있기 때문이다.
            }
        }).start()


    }
}