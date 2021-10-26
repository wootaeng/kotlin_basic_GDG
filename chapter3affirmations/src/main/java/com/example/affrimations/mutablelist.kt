package com.example.affrimations

fun main(){
    //빈목록을 출력시에는 유형을 명시적으로<> 선언해야한다
//    val entrees = mutableListOf<String>()
    //변수의 유형을 미리 지정해서 선언하는 방법
    val entrees:MutableList<String> = mutableListOf()

    println("Entrees : $entrees")
    //항목 추가
    println("Entrees : ${entrees.add("noodles")}")
    println("Entrees : $entrees")
    println("Entrees : ${entrees.add("spaghetti")}")
    println("Entrees : $entrees")

    val moreItems = listOf("ravioli", "lasagna", "fettuccine")

    //addAll 을 이용해서 여러개 추기하기
    println("Add list: ${entrees.addAll(moreItems)}")
    println("Entrees: $entrees")
    //삭제하기
    println("Remove spaghetti: ${entrees.remove("spaghetti")}")
    println("Entrees: $entrees")
    //목록에 없는 것 삭제시도 false 를 반환
    println("Remove item that doesn't exist: ${entrees.remove("rice")}")
    println("Entrees: $entrees")
    //특정 배열 순서 삭제하기
    println("Remove first element: ${entrees.removeAt(0)}")
    println("Entrees: $entrees")
    //전체 삭제하기
    entrees.clear()
    println("Entrees: $entrees")
    println("Empty? ${entrees.isEmpty()}")

}