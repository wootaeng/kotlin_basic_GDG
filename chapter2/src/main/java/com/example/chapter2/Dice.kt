package com.example.chapter2

fun main(){
    //Dice 함수를 사용할 변수
    //Dice 클래스에 정수를 입력하게 만들었기에 아래처럼 Dice(정수) 으로 작성해야한다
    val myFirstDice = Dice(6)
    //sides 속성을 사용
    //println(myFirstDice.sides)
    //주사위를 굴리기 위해 roll() 메서드를 호출, 숫자는 랜덤하게 나온다
    //myFirstDice.roll()
    //주사위를 굴렸을때 나오는 roll() 를 담는다
    //val diceRoll = myFirstDice.roll()
    //출력하기
    println("Your ${myFirstDice.numSides} sided dice rolled ${myFirstDice.roll()}")

    val mySecondDice = Dice(20)
    println("Tour ${mySecondDice.numSides} sided dice rolled ${mySecondDice.roll()}!")


}

//Dice class 생성
//Dice 클래스에 직접 numSides 정수 적용
class Dice(val numSides:Int){


    //주사위 굴리기 구현
    //주사위 값을 return 하기 위해 Int 지정
    fun roll():Int {
        //1..6 까지의 숫자가 랜덤으로 나오는 변수 생성
        //val randomNuber = (1..6).random()
        //주사위 숫자가 하드코딩(1..6)이 아니라 최대 nunSide 값으로 지정되게 변경
        //val randomNuber = (1..numSide).random()
        //주사위 값을 반환 받기
        return (1..numSides).random()
    }
}