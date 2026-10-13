package exercises

/**
Month of the Year:
Write a program that asks the user to enter a number from 1 to 12.

The program must convert that number into the name of the corresponding month.

Examples:
- If the user enters 1, the program must display "January".
- If the user enters 5, the program must display "May".
- If the user enters 12, the program must display "December".
- If the user enters a number that is not between 1 and 12, it must display "Invalid month".

Concepts you must use:
- readln()
- toInt()
- when
- else
 */
fun main(){
    println("Enter a month number (1-12):")
    val monthOfTheYear = readln().toInt()

    val result = when(monthOfTheYear){
        1 -> "January"
        2 -> "February"
        3 -> "March"
        4 -> "April"
        5 -> "May"
        6 -> "June"
        7 -> "July"
        8 -> "August"
        9 -> "September"
        10 -> "October"
        11 -> "November"
        12 -> "December"
        else -> "Invalid month"
    }

    println("Selected month: $result")

}