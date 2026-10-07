fun main(){
    //Conditionals in Kotlin: if, else if and else
    val age = 17
    if(age >= 18){
        println("I'm adult")
    }
    val isAdult: Boolean = (age >= 18)

    //else
    if(isAdult){
        println("I'm adult")
    }else{
        println("I'm under-age")
    }

    //if-else-if
    val orderTotal = 15.0
    if(orderTotal>= 100){
        println("Free sent")
    }else if(orderTotal>= 50){
        println("Sent with discount")
    }else{
        println("Normal sent taxes")
    }

    //Operators
    val price = 175.0
    val isPremiumCustomer = false

    if(price >= 100 || isPremiumCustomer){
        println("Free sent")
    }
    //If as an expression: save the result of a condition

    val myAge = 33
    if(myAge >= 18){
        println("Adult")
    }else{
        println("Under-age")
    }
    val accessMessage = if (myAge >= 18){
        "Adult"
    }else{ //else is mandatory
        "Under-age"
    }
    println(accessMessage)
}