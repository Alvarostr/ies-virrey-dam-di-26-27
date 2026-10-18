fun main(){
    //3. First way to chek if it is null
    val firstSurname: String? = "Alumbreros"
    if(firstSurname != null)
    {
        println("Length: $firstSurname")
    }else{
        println("No second surname")
    }
    //4.Safe call operator ?.
    val withSurname: String? = "López"
    val withoutSurname: String? = null

    println(withSurname?.length)
    println(withoutSurname?.length)

    //5. Elvis
    val secondSurname: String? = null
    val surnameToShow = secondSurname ?: "(none)"
    println(surnameToShow)

    val length = secondSurname?.length ?:0
    println(length)

    //5.1 Safe keyboard input
    println("How many units?")
    val quantity = readln().toIntOrNull() ?: 1
    println("You ordered $quantity units")

    //5.2Elvis with return
    printDiscountedPrice("50")
    printDiscountedPrice("hello")

    //6. The not-null assertion !!
    val thirdSurname: String? = "Third"
    println(secondSurname!!.length)
}
fun printDiscountedPrice(priceText: String){
    val price = priceText.toDoubleOrNull() ?: return
    println("Price with discount: ${price * 0.9}")
}