package com.example.chapter2

fun main(){

    //val 은 변경이 불가능한 변수
    //1..6 kotlin 에서 .. 은 범위를 나타낸다 시작 숫자, 점 두개, 끝숫자가 순서대로 나오기에
    //1..6 을 java 처럼 int 로 명시하지 않아도 시스템이 int로 알아서 인식한다
    // val diceRange: IntRange = 1..6
    val diceRange = 1..6

    // 랜덤한 숫자를 만들기 위한 random() 함수를 이용한 randomNumber 변수 지정
    val randomNumber = diceRange.random()

    //출력하기 위한 println , ${} 로 감싸면 "" 안에서도 변수값을 사용할 수 있다
    println("Rnadom number: ${randomNumber}")
    //작동을 시키면 랜덤한 숫자가 나오게된다
}

