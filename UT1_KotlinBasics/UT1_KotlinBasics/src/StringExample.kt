fun main(){
    val name:String = "Teacher"
    val age:Int = 49

    println("My name is " + name + " and I'm " + age + " years old.")
    println("My name is $name and I'm $age years old.")

    val price:Double = 20.0
    val quantity:Int = 3

    println("The total price is : ${20.0 * quantity}€")
    println("Is he older than 18 years old? ${age>=18}")

    println("This is \n an example")
    println("This is an \"example\"")

    val example:String = "3"
    val example2:Int = 4

    //Casting
    val result = example2 + example.toInt()
    println(result)

}