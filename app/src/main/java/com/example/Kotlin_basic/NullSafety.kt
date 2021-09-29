package com.example.Kotlin_basic

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class NullSafety : AppCompatActivity() {

    // private lateinit var lateNumber: Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_null_safety)
//
//        val number : Int = 10
//        val number1 : Int? = null
//
////        val number3 = number? + number1
//        val number3 = number1?.plus(number) // null이 아니면 plus 즉 ?이하가 실행되는데 null이기 때문에 val number3 = number1만 됨
////        Log.d("number", "number3 : " + number3) // null이 나옴
//
//        // 삼항연산자 -> 엘비스 연산자(?:)
//        val number4 = number1 ?: 10 // number1이 null이 아니면 number4에 들어가고 null이면 10이 number4에 들어간다
////        Log.d("number", "number4 : " + number4)
//
//        lateNumber = 10
//        Log.d("number", "late number : " + lateNumber)
    }

    fun plus(a: Int, b: Int?): Int {
        if(b != null) return a + b
        else return a
    }

    fun plus2(a: Int, b: Int?): Int? {
        return b?.plus(a)  // b가 Null이면 Null만 나감
    }
}