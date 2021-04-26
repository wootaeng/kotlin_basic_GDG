package com.example.chapter2

/*
    if 문의 사용법
 */
fun main(){
    val num = 5
    if (num > 4){
        println("4보다 크다")
    }

    val num2 = 4
    if (num2 > 4){
        println("4보다 크니?")
    }else if (num2 ==4) {
        println("4랑 같아")
    }else {
        println("4보다 작지")
    }
}