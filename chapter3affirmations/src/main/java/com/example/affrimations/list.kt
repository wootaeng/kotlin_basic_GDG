package com.example.affrimations

fun main(){
// list 는 삭제 와 추가는 된다. 하지만 변경은 되지않는다
//    val numbers: List<Int> = listOf(1,2,3,4,5,6)
    //위 아래 같은 코드
    val numbers = listOf(1,2,3,4,5,6)

    println("List : ${numbers}")
    println("Size : ${numbers.size}")
    println("1번 배열 : ${numbers[0]}")
    println("2번 배열 : ${numbers[1]}")
    println("마지막 배열(index) : ${numbers.size -1}")
    println("마지막 숫자(element : ${numbers[numbers.size -1]}")
    println("Fisrt : ${numbers.first()}")
    println("Last : ${numbers.last()}")

    //list 에 있는지 확인하는 코드 contains()
    println("contains 4? ${numbers.contains(4)}")
    println("contains 7? ${numbers.contains(7)}")
}