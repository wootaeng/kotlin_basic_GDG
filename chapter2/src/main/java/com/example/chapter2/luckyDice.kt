package com.example.chapter2

fun main(){
    val myFirstDice = Dice2(6)
    //val diceRoll = myFirstDice.roll()
    //println("Your ${myFirstDice.numSides} sided dice rolled ${diceRoll}!")
    val rollResult = myFirstDice.roll()
    val luckyNumber =4
    if (rollResult == luckyNumber){
        println("You win!")
    } else if (rollResult == 1) {
        println("So sorry! You rolled a 1. Try again!")
    } else if (rollResult == 2) {
        println("Sadly, you rolled a 2. Try again!")
    } else if (rollResult == 3) {
        println("Unfortunately, you rolled a 3. Try again!")
    } else if (rollResult == 4) {
        println("No luck! You rolled a 4. Try again!")
    } else if (rollResult == 5) {
        println("Don't cry! You rolled a 5. Try again!")
    } else {
        println("Apologies! you rolled a 6. Try again!")
    }
}

class Dice2(val numSides:Int){

    fun roll():Int {
        return (1..numSides).random()
    }
}