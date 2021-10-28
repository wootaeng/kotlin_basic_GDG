package com.example.chapter4navigation.study

fun main(){
    val tripe: (Int) -> Int = { a:Int ->a*3}
    println(tripe(5))

    val words = listOf("about", "acute", "awesome", "balloon", "best", "brief", "class", "coffee", "creative")

    //b 로 시작하는 단어
//    val filteredWords = words.filter { it.startsWith("b", ignoreCase = true) }
    //b 로 시작하는 단어를 무작위로
//    val filteredWords = words.filter { it.startsWith("b", ignoreCase = true) }.shuffled()
    //b 로 시작하는 단어 중 무작위로 2개만
//    val filteredWords = words.filter { it.startsWith("b", ignoreCase = true) }.shuffled().take(2)
    //b 로 시작하는 단어 중 2개를 정렬
    val filteredWords = words.filter { it.startsWith("b", ignoreCase = true) }
        .shuffled().take(2).sorted()

    println(filteredWords)
    //c 로 시작하는 단어를 1개
    val filterWords2 = words.filter { it.startsWith("c", ignoreCase = true) }
        .shuffled().take(1).sorted()
    println(filterWords2)

}