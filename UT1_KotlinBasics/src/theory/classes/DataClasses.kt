package theory.classes

import jdk.jfr.Percentage

data class Product(val name:String, val price:Double, val stock: Int = 0)

//13.Extensions functions
fun Double.toEurosTwo(): String = "%.2f €".format(this)

fun Product.withDiscount(percentage: Double): Product =
    copy(price = price - price * percentage / 100)

val Product.isCheap: Boolean
    get() = price <20.0
fun main(){
    //10. Data classes
    val keyboard = Product("Keyboard",25.0,10)
    println(keyboard)

    val sameKeyBoard = Product("Keyboard", 25.0, 10)
    println(keyboard == sameKeyBoard)
    println(keyboard === sameKeyBoard)

    val cheaper = keyboard.copy(price=19.95)
    println(cheaper)
    println(keyboard == cheaper)
    println(keyboard === cheaper)
////
    val (name,price,quantity) = keyboard


    println("$name costs $price and has $quantity units")
//    //10.1 Data classes and collections
    val catalogue = listOf(
        Product("Keyboard", 25.0, 10),
        Product("Mouse", 12.5, 0),
        Product("Monitor", 149.99, 3)
    )
    val available = catalogue.filter { it.stock > 0 }
    println(available)
    val names = available.map { it.name }
    val mostExpensive = catalogue.maxByOrNull { it.price }
    val stockValue = catalogue.sumOf { it.price * it.stock }
    println(names) // [Keyboard, Monitor]
    println(mostExpensive?.name) // Monitor
    println("%.2f".format(stockValue)) // 699.97
}