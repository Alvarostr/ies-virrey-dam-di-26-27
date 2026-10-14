fun main(){
    println("1. Lambda Expressions")
    println(upperCaseString("Hello World"))
    //Like a lambda expression
    val upperCaseStringLambda = {text:String -> text.uppercase()}
    println(upperCaseStringLambda("Hello World"))
    //Lambda without parameters
    val lambdaWithoutParameters = {"Log message"}
    println(lambdaWithoutParameters())
    println("2. Using Lambdas as function parameters")
    //Pass to another function
    val numbers = listOf(1, -2,3,-4,5,-6)
    //Adds lambda directly
    val positives = numbers.filter ({x ->x>0})
    //Lambda assing to a variable
    val isNegative = {x: Int -> x<0}
    val negatives = numbers.filter (isNegative )
    println(positives)
    println(negatives)
    //Another example using map function
    val doubled = numbers.map{x -> x*2}
    val toTripled = {x:Int -> x * 3}
    val tripled = numbers.map {toTripled}
    println(doubled)
    println(tripled)

    //FUNCTION TYPES
    println("3. Function Types")
    val lowerCaseString: (String) -> String = { text -> text.lowercase()}
    println(lowerCaseString("HELLO WORLD"))
    //RETURN FROM A FUNCTION
    println("4. Return from a function")
    val timesInMinutes = listOf(2, 10,15,1)
    val min2sec = toSeconds("minute")
    val totalTimeInSeconds = timesInMinutes.map(min2sec).sum()
    println(timesInMinutes.map(min2sec))
    println("Total time is $totalTimeInSeconds")

    //5. Trailing lambdas.
    var r1 = calculateTwo(10,5,{x,y -> x + y})
    var r2 = calculateTwo(10,5) {x,y -> x-y}
    var r3 = calculateTwo(10,5){ x, y ->
        println("Adding $x and $y")
        x+y
    }
    println("$r1 $r2, $r3")
}
fun upperCaseString(text:String):String{
    return text.uppercase()
}
//4. RETURN FROM A FUNCTION
fun toSeconds(time:String): (Int) -> Int {
    when (time) {
        "hour" -> return { value -> value * 60 * 60 }
        "minute" -> return { value -> value * 60 }
        "second" -> return { value -> value }
        else -> return { value -> value }
    }

}
//5. Trailing lambdas.
fun calculateTwo(a:Int, b:Int, operation:(Int, Int) -> Int):Int{
    return operation(a,b)
}