package exercises.lambdas
fun main(){
    //Exercises of Notes Document about Lambdas.

}
fun exerciseOne(){
    //Exercise One
    val square = {n:Int -> n*n}
    val isEven = {n:Int -> (n%2 == 0)}
    val fullName = {name:String, surname:String -> "$name $surname"}
    val printSeparator = {"-------------"}

    println(square(2))
    println(isEven(5))
    println(fullName("Juan Carlos","Alumbreros Fresneda"))
    println(printSeparator())
}
fun exerciseTwo(){
    //Exercise Two
    val a:(Double) -> Double = {x -> x/2}
    val b:(String) ->Int = {text -> text.length}
    val c:(String, Int) -> String = {name, age -> "$name is $age"}
    val d:()->Unit = {println("Loading")}
    val e:(Int)-> Boolean = {n -> n in 1..10}
}
fun exerciseThree(){
    //Exercise Three
    val add:(Double, Double)->Double = {x,y -> x+y}
    val substract:(Double, Double)->Double = {x,y ->x-y}
    val multiply:(Double, Double) ->Double ={x,y ->x*y}
    val divide:(Double, Double)->Double ={x,y ->x/y}
    print("First Number:")
    val firstNumber = readln().toDouble()
    print("Second Number:")
    val secondNumber = readln().toDouble()
    print("Operator (+ - * /):")
    val operatorChoice:String = readln()
    when(operatorChoice){
        "+" -> print("$firstNumber $operatorChoice $secondNumber = ${calculateThree(firstNumber,secondNumber,add)}")
        "-" -> print("$firstNumber $operatorChoice $secondNumber = ${calculateThree(firstNumber,secondNumber,substract)}")
        "*" -> print("$firstNumber $operatorChoice $secondNumber = ${calculateThree(firstNumber,secondNumber,multiply)}")
        "/" -> print("$firstNumber $operatorChoice $secondNumber = ${calculateThree(firstNumber,secondNumber,divide)}")
        else -> "The operator selected is not valid"
    }
    //calculateThree(2.4,3.5,{a,b ->a*(b+2)})
    //substract(3.0,1.0)

}
fun calculateThree(a:Double, b:Double, operation:(Double, Double) -> Double):Double{
    return operation(a,b)
}
const val VOWELS = "aeiou"
fun exerciseFour(){
    print("Write a sentence: ")
    val sentence = readln()

    val vowelCount = sentence.count { it.lowercaseChar() in VOWELS }
    val spaceCount = sentence.count { it == ' ' }
    val onlyLetters = sentence.filter { it.isLetter() }
    val hasDigit = sentence.any { it.isDigit() }
    val allUppercase = onlyLetters.isNotEmpty() && onlyLetters.all ({ it.isUpperCase() })

    println("Vowels: $vowelCount")
    println("Spaces: $spaceCount")
    println("Only letters: $onlyLetters")
    println("Contains a digit: $hasDigit")
    println("All letters uppercase: $allUppercase")
    }
const val TOTAL_LAPS = 3
fun repeatAction(times: Int, action: (Int) -> Unit) {
    for (repetition in 1..times) {
        action(repetition)
    }
}
fun exerciseFive(){
    repeatAction(TOTAL_LAPS) { lap ->
        println("Lap $lap of $TOTAL_LAPS")
    }
}
const val BLACK_FRIDAY_PERCENTAGE = 30.0
const val STUDENT_PERCENTAGE = 10.0
const val STUDENT_MIN_PRICE = 20.0
const val FULL_PERCENTAGE = 100

fun applyRule(price: Double, rule: (Double) -> Double): Double = rule(price)

fun combineRules(first: (Double) -> Double, second: (Double) -> Double): (Double) -> Double =
    { price -> second(first(price)) }

fun showPrices(ruleName: String, rule: (Double) -> Double) {
    val price50 = applyRule(50.0, rule)
    val price15 = applyRule(15.0, rule)
    println("$ruleName: 50 € -> ${"%.2f".format(price50)} € | 15 € -> ${"%.2f".format(price15)} €")
}
fun challenge(){

    val noDiscount: (Double) -> Double = { it }

    val blackFriday: (Double) -> Double = { price ->
        price - price * BLACK_FRIDAY_PERCENTAGE / FULL_PERCENTAGE
    }

    val studentDiscount: (Double) -> Double = { price ->
        if (price >= STUDENT_MIN_PRICE) price - price * STUDENT_PERCENTAGE / FULL_PERCENTAGE
        else price
    }

    showPrices("No discount", noDiscount)
    showPrices("Black Friday", blackFriday)
    showPrices("Student", studentDiscount)

    // Extra
    val blackFridayForStudents = combineRules(blackFriday, studentDiscount)
    showPrices("Black Friday + Student", blackFridayForStudents)
}



