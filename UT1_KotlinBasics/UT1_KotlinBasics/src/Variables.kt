fun main(){
    //println, comments and types
    println("Teacher")
    println("30")
    //var, var, infered types and types
    val name = "Teacher"
    var age = 33
    println(name)
    age += 1
    println(age)

    // Number
    var score = 1 //Int
    var score2:Int = 1
    var score3:Long = 3123456789898
    var score4:Float = 3.14159265358979F
    var score5:Double = 3.14159265358979 //More complex than float

    //Alphanumeric
    var example:String = "Daw456¬&%%444ghh"
    var miniExample:Char = 'A'

    //Boolean
    var isPremiun:Boolean = true

    //Operators aritmethic, and logic
    val firstNumber:Int = 2
    val secondNumber:Int = 8
    println("Sum: ")
    println(firstNumber + secondNumber)
    println("subtraction:")
    println(firstNumber - secondNumber)
    println("Multiplication")
    println(firstNumber * secondNumber)
    println("Division")
    println(firstNumber / secondNumber)
    println("Module:")
    println(firstNumber % secondNumber)

    //Comparation operators
    /**
     * == (iqual to)
     * != (not iqual to)
     * > (bigger than)
     * < (fewer than)
     * >= (bigger or equal than)
     * <= (fewer or equal than)
     */
    val number:Int = 30
    val isThirty:Boolean = age == 30
    val isNotThirty:Boolean = age != 37
    val isAdult:Boolean = age >= 18

    /**
     * Logic operators
     * && AND
     * !! OR
     * ! NOT
     */
    val number2:Int = 25
    val hasTicket:Boolean = true
    val canAccess:Boolean = (number2 >= 18) && (hasTicket == true)
    println(canAccess)

    val isPremium2: Boolean = false
    val hasFreeTrial: Boolean = true
    val canEnter = isPremium2 || hasFreeTrial
    println(canEnter)

    val isBlocked = false
    val isNotBlocked = !isBlocked



}