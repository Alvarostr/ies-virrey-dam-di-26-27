fun main(){
//    val greeting = uppercaseString("hello world")
//    val upperCaseString2 = { text: String -> text.uppercase()}
//    println(uppercaseString(greeting))
//    println(upperCaseString2(greeting))
//    println(double(5))
//    val double = {number: Int -> number * 2}
//    println(double(4))

//    //1. LAMBDAS.
//    //A lambda can have any parameters
//    val sayHello = {println("Hello")}
//    sayHello()
//    val greet = {name: String -> "Hello, $name"}
//    print(greet("Laura"))
//    val add = {a: Int, b: Int -> a+b}
//    println(" ${add(3,4)}")

//    //Lambda's body can have several lines
//    val finalPrice = {price: Double, discount: Double ->
//        val discountAmount = price * discount /100
//        println("You save $discountAmount")
//        price - discountAmount
//    }
//    //remember the rule: the last line is the value the lambda returns
//    println(finalPrice(80.0, 25.0))
//
//    //The variable that stores a lambda can be var
//    var operation = {a: Int -> a + 1}
//    operation = {a: Int -> a*10}
//    println(operation(3))

//    //2.FUNCTION TYPES
//    val product: (Int, Int) -> Int = {a, b -> a*b}
//    println(product(2,5))
//
//    val isAdult: (Int) -> Boolean
//    isAdult = {age -> age >= 18}
//    println(isAdult(21))
//
//    val showMenu: () -> Unit  = {println("1. Play 2. Exit")}
//    showMenu()
//
//    //Ctrl + Shift + P
//    val add2 = {a:Int, b:Int -> a+b}
//
//    //3. The implicit parameter it
//    val double: (Int) -> Int = {number -> number *2}
//    val doubleShort: (Int) -> Int = {it * 2}  //same lambda that previous
//
//    repeat(2){
//        repeat(3){
//            print("$it ")
//        }
//        println("outer $it ")
//    }
//    repeat(2){row ->
//        repeat(3) { col -> print("($row, $col)")}
//        println()
//    }

    //4. Higher-order functions
    val sum = calculate(10,5,{x,y ->x+7})
    val product = calculate(10,5,{x,y -> x*y})
    val maximum = calculate(10,5,{x,y ->if(x>y) x else y})

    println("$sum $product $maximum")

    //4.1 Passing a function you already have
    println(calculate(10,5, ::subtract))

}
fun uppercaseString(text: String): String{
    return text.uppercase()
}
fun double(number: Int):Int{
    return number * 2
}

//4. Higher-order functions
fun calculate(a:Int, b:Int, operation:(Int, Int) ->Int):Int{
    return operation(a,b)
}
//4.1 Passing a function you already have
fun subtract(a: Int, b: Int): Int = a -b


