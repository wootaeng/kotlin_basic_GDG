package com.example.affrimations


open class Item (val name: String, val price: Int)

class Noodles : Item("Noodle", 10){
    override fun toString(): String {
        return name
    }
}
//vegetable 을 담을 클래스
//class Vegetable : Item("Vegetable", 15){
//    override fun toString(): String {
//        return name
//    }
//}
//여러개를 담고 싶을때는 list를 지정해주면 된다
class Vegetables(vararg val toppings: String) : Item("Vegetables", 5) {
    override fun toString(): String {
        if (toppings.isEmpty()) {
            return "$name Chef's Choice"
        } else {
            return name + " " + toppings.joinToString()
        }
    }
}

class Order(val orderNumber: Int) {
    private val itemList = mutableListOf<Item>()

    fun addItem(newItem: Item): Order {
        itemList.add(newItem)
        return this
    }

    fun addAll(newItems: List<Item>): Order {
        itemList.addAll(newItems)
        return this
    }

    fun print() {
        println("Order #${orderNumber}")
        var total = 0
        for (item in itemList) {
            println("${item}: $${item.price}")
            total += item.price
        }
        println("Total: $${total}")
    }
}


fun main(){
    val noodles = Noodles()
    val vegetables = Vegetables("Cabbage", "Sprouts", "Onion")
    val vegetables2 = Vegetables()
    println(noodles)
    println(vegetables)
    println(vegetables2)

//    val order1 = Order(1)
//    order1.addItem(Noodles())
//    order1.print()
//
//    println()
//
//    val order2 = Order(2)
//    order2.addItem(Noodles())
//    order2.addItem(Vegetables())
//    order2.print()
//
//    println()
//
//    val order3 = Order(3)
//    val items = listOf(Noodles(), Vegetables("Carrots", "Beans", "Celery"))
//    order3.addAll(items)
//    order3.print()
    //list 에 담기
    val ordersList = mutableListOf<Order>()

    val order1 = Order(1)
    order1.addItem(Noodles())
    ordersList.add(order1)

    val order2 = Order(2)
    order2.addItem(Noodles())
    order2.addItem(Vegetables())
    ordersList.add(order2)

    val order3 = Order(3)
    val items = listOf(Noodles(), Vegetables("Carrots", "Beans", "Celery"))
    order3.addAll(items)
    ordersList.add(order3)

    // Use builder pattern
    val order4 = Order(4)
        .addItem(Noodles())
        .addItem(Vegetables("Cabbage", "Onion"))
    ordersList.add(order4)

    // Create and add order directly
    ordersList.add(
        Order(5)
            .addItem(Noodles())
            .addItem(Noodles())
            .addItem(Vegetables("Spinach"))
    )

    // Print out each order
    for (order in ordersList) {
        order.print()
        println()
    }
}