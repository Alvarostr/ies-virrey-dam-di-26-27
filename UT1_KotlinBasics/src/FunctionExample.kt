fun main(){
//separator()
//showProductName()
//showProductName2("Kotlin Course")
//showProductName2(productName = "Java Course")
//showProductName3("Kotlin Course", 9.99)
//    showProductName4()
//    showProductName3(price =21.99, productName = "Java Course")
//    showProductName3(productName = "Java Course", price = 19.99)
//    showProductName3(price = 19.99, productName = "Java Course")
//println("Price is: ${showProductTotal(10.0,3)}")
//    println("Price is: ${showProductTotal(10.0,3)}")
//calculatePrice(10.0)
//calculatePrice(10.0, 5.0)
    println(separator())
}

//1.Functions in Kotlin
fun separator(){
    println("======================")
}
fun showProductName(){
    println("The product is: An Apple")
}
//2.Functions with Input Parameters
fun showProductName2(productName: String){
    println("Product: $productName")
}

fun showProductName3(productName: String, price: Double){
    println("Product: $productName")
    println("Price: $price")
}

fun showProductName4(productName: String = "Java Course", price: Double = 8.88){
    println("Product: $productName")
    //return
    println("Price: $price")
}

//3.Functions with Output Parameters

fun showProductTotal(price: Double, quantity: Int):Double{
    val total = price * quantity
    return total
}
//Another way to do this.
fun showProductTotal2(price: Double, quantity: Int)= price * quantity

//4. Early Returns in Functions
fun calculateSubTotal(price: Double, quantity: Int): Double{
    val subtotal = price * quantity
    return subtotal
    println("Subtotal calculated")
}

fun calculateShipingCost(subtotal:Double):Double{
    if(subtotal>50){
        return 0.0
    }
    return 4.99
}

//5. Function Overloading
fun calculatePrice(price: Double):Double{
    println("CalculatePrice 1")
    return price
}

fun calculatePrice(price: Double, discountPercentage: Double):Double{
    println("CalculatePrice 2")
    return price
}

fun showProductId(productId:Int){
    println("The ID is $productId")
}
fun showProductId(productId: String){
    println("The ID is $productId")
}

//6. Single Responsibility in Functions
//Single Responsibility Principle (SRP), “S” in SOLID.
fun processOrder(price: Double, discountPercentage: Double){
    val discountPrice = (price * discountPercentage) /100
    val finalPrice = price - discountPrice

    println("Initial Price: $price")
    println("Discount: $discountPrice")
    println("Final price: $finalPrice")
    println("Order procesed correctly.")
}