package com.example.Kotlin_basic

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.activity_fragment.*

class FragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)
        Log.d("life_cycle", "onCreate")


        button.setOnClickListener {
            // fragment를 동적으로 작동하는 방법
            val fragmentOne : FragmentOne = FragmentOne()
            val fragmentManager : FragmentManager = supportFragmentManager // supportFragmentManager는 Activity가 가지고 있는데 이미 상속받고 있어서 사용 가능

            // Transaction
            // 작업의 단위 -> 시작과 끝이 있다.
            val fragmentTransaction = fragmentManager.beginTransaction() // 이 코드가 실행되는 순간 Transaction이 실행된다 (시작)
            fragmentTransaction.replace(R.id.container, fragmentOne) // 뷰 아이디와 fragment를 바꿔주는 코드 뷰 아이디에 fragment가 오게 됨 (할 일)
            fragmentTransaction.commit() // 끝
            // 끝을 내는 방법
            // commit    -> 시간 날 때 해 (좀 더 안정적)
            // commitNow -> 지금 바로 해
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("life_cycle","onStart")

    }

    override fun onResume() {
        super.onResume()
        Log.d("life_cycle","onResume")

    }

    override fun onPause() {
        super.onPause()
        Log.d("life_cycle","onPause")

    }

    override fun onStop() {
        super.onStop()
        Log.d("life_cycle","onStop")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("life_cycle","onDestroy")

    }
}