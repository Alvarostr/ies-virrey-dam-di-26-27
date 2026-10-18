package exercises.basics

/**
Month and Season:
Write a program that asks the user to enter a number from 1 to 12.

The program must determine:
- The name of the month.
- The season that month belongs to.

Rules:
- 12, 1, and 2 belong to "Winter".
- 3, 4, and 5 belong to "Spring".
- 6, 7, and 8 belong to "Summer".
- 9, 10, and 11 belong to "Autumn".

Examples:
- If the user enters 1, the program must display "January" and "Winter".
- If the user enters 4, the program must display "April" and "Spring".
- If the user enters 8, the program must display "August" and "Summer".
- If the user enters 10, the program must display "October" and "Autumn".
- If the user enters a number that is not between 1 and 12, it must display "Invalid month".

Concepts you must use:
- readln()
- toInt()
- if
- ranges with in
- when
- else
 */

fun main(){
    println("Enter a month number (1-12):")
    val monthOfTheYear = readln().toInt()

    val monthName = when(monthOfTheYear){
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

    if(monthOfTheYear in 1..12){
        val seasonName = when(monthOfTheYear){
            in 3..5 -> "Spring"
            in 6..8 -> "Summer"
            in 9..11 -> "Autum"
            else -> "Winter"
        }
        println("Selected month: $monthName | Season: $seasonName")
    }else{
        println(monthName)
    }
}