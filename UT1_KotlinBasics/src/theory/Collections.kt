package theory

import kotlin.collections.iterator

fun main(){
    //7.Lists
//    val courses = listOf("Kotlin", "Java", "Phyton", "Kotlin")
//    println(courses)
//    println(courses.size)
//    println(courses[0])
//    println(courses.first())
//    println(courses.last())
//    println("Java" in courses)
//    println(courses.indexOf("Phyton"))

    //8.Mutable list: MutableList
//    val cart = mutableListOf("Keyboard, Mouse")
//    cart.add("Monitor")
//    cart.add(0,"Laptop")
//    println(cart)
//
//    cart[1] = "Wireless keyboard"
//    cart.remove("Mouse")
//    cart.removeAt(0)
//    println(cart)
//
//    println(cart.isEmpty())
//    cart.clear()
//    println(cart.size)
    //9.Traversing lists.
//    val courses = listOf("Kotlin", "Java", "Phyton")
//    for (course in courses){
//        println("-$course")
//    }
//    for((index,course) in courses.withIndex()){
//        println("-${index +1}. $course ")
//    }
//
//    courses.forEach { println(it.uppercase()) }

    //10. Common operations: filter, map, find....
//    val prices = listOf(12.5, 99.0, 5.0, 45.0, 20.0)
//
//    val cheap = prices.filter { it<20 }
//    val withTax = prices.map { it * 1.21 }
//    val firstExpensive = prices.find{it>40}
//    val overThousand = prices.find {it>1000}
//    val howManyCheap = prices.count{it<20}
//
//    println("$cheap $firstExpensive $overThousand $howManyCheap")
    //10.1 find and null safety
//    val courses = listOf("Kotlin", "Java", "Python")
//    val result = courses.find { it.startsWith("S") }
//    println(result ?: "No course starts with S")
//
//    val length = courses.find { it.startsWith("J") }?.length ?: 0
//    println(length)
    //10.2 Chaining Operations.
//    val prices = listOf(12.5, 99.0, 5.0, 45.0, 20.0)
//
//    val total = prices
//        .filter{it >= 10}
//        .map{it * 0.9}
//        .sum()
//
//    println("Total: ${"%.2f".format(total)}")
    //11. Sets.
//    val tags = setOf("kotlin", "android", "kotlin", "compose")
//    println(tags)
//    println(tags.size)
//
//    val visitors = mutableSetOf<String>()
//    println(visitors.add("ana"))
//    println(visitors.add("luis"))
//    println(visitors.add("ana"))
//    println(visitors)
//    println("luis" in visitors)
//
//    val numbers = listOf(3,2,3,2,1)
//    val numbersNotRepeat = numbers.toSet()
//    println(numbersNotRepeat)
//    //println(numbersNotRepeat[0])
//    //12. Maps
//    val prices = mapOf(
//        "Kotlin Course" to 9.99,
//        "Java Course" to 19.99,
//        "Python Course" to 14.99
//    )
//    println(prices["Java Course"])
//    println(prices["Swift Course"])
//    println(prices.size)
//    println("Kotlin Course" in prices)
//    //How to avoid null results.
//    println(prices["Swift Course"]?:0.0)
    //12.1 Mutable maps and traversal.
    val stock = mutableMapOf("Keyboard" to 10, "Mouse" to 25)
    stock["Monitor"] = 5
    println(stock)
    stock["Mouse"] = 20
    println(stock)
    stock.remove("Keyboard")
    println(stock)

    for((product,units) in stock){
        println("$product: $units units")
    }

    println(stock.keys)
    println(stock.values)
    println(stock.values.sum())
}