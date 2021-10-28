package com.example.chapter4navigation.study

fun main(){
    val numbers = listOf(0, 3, 8, 4, 0, 5, 5, 8, 9, 2)
    println("list: ${numbers}")
    println("sorted: ${numbers.sorted()}")

    //집합합
   val setOfNumbers = numbers.toSet()
    println("set: ${setOfNumbers}")

    //변경 불가 집합
    val set1 = setOf(1,2,3)
    //변경 가능 집합
    val set2 = mutableSetOf(3,2,1)
    println("$set1 == $set2: ${set1 == set2}")

    println("contains 7: ${setOfNumbers.contains(7)}")

}