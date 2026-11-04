package theory.classes

object ShopSettings{
    init {
        println("Creating object")
    }
    const val TAX_PERCENTAGE = 21.0
    var currency = "€"

    fun formatPrice(price: Double) = "%.2f %s".format(price, currency)
}

class DogTwo(val name: String){
    companion object{
        const val MAX_AGE = 20
        var dogsCreated = 0
    }
    init {
        dogsCreated++
    }
}
fun String.initial():Char = this.firstOrNull()?.uppercaseChar()?:'?'
fun Double.toEuros():String = "%.2f".format(this)
fun Int.isEven(): Boolean = this % 2 == 0
fun main(){
    println(ShopSettings.formatPrice(9.5))
    ShopSettings.currency = "$"
    println(ShopSettings.formatPrice(9.5))

    DogTwo("Rex")
    DogTwo("Toby")
    println(DogTwo.dogsCreated)
    println(DogTwo.MAX_AGE)

    println("laura".initial())
    println(19.5.toEuros())
    println(7.isEven())
}