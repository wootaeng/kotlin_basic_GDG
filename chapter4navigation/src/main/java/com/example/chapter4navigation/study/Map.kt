package com.example.chapter4navigation.study

fun main(){
    //key, value 를 짝지어 저장하는 collection
    val peopleAges = mutableMapOf<String, Int>(
        "Fred" to 30,
        "Ann" to 23
    )
    println(peopleAges)
    //Map 에 항목 추가는 put()
    peopleAges.put("Barbara",43)
    //아래방법도 가능
    peopleAges["Joe"] = 51

    println(peopleAges)

    //key값은 고유하지만 value는 중복이 가능하다
    peopleAges["Fred"] = 31
    println(peopleAges)

    //for 문도 있지만 collection (list,set,map) 에서는 forEach 를 사용하는게 좀더 유용하다
    //특수식별자 it을 사용
//    peopleAges.forEach { print("${it.key} is ${it.value}, ") } //Fred is 31,Ann is 23,Barbara is 43,Joe is 51,
    //map 함수를 사용(위에 Map 이랑은 다름) 컬렉션의 각 항목에 변환을 적용
    println(peopleAges.map { "${it.key} is ${it.value}" }.joinToString(","))

    //filter
    val filterName = peopleAges.filter { it.key.length <4 }
    println(filterName)
}