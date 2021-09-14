package com.example.Kotlin_basic

fun main(args: Array<String>){
    val a: Int? = null
    val b: Int = 10
    val c: Int = 100

    if (a == null){
        println("a is null")
    } else {
        println("a is not null")
    }

    if (b + c == 100) {
        println("b plus c is 110")
    } else {
        println("b plus c is not 110")
    }


    // 엘비스 연산자  ?:
    val number: Int? = null
    val number2 = number ?: 10 // number가 null이라면 10대입
    println()
    println(number2)

    val num1: Int = 10
    val num2: Int = 20

    // 값을 리턴하는 if문은 반드시 리턴해야 한다
    val max = if (num1 >num2) {
        num1 // 10
    } else if (num1 == num2){
        num2 // 20
    } else {
        100
    }
}