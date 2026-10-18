package exercises.basics

/**
Number Guessing Game:
Write a program in which the user has to guess a secret number.

Game rules:
- The secret number is fixed.
- The user must enter numbers between 1 and 10.
- The user has a maximum of 3 attempts.
- If the user enters a number outside the range, an error message must be displayed.
- A number outside the range must not count as an attempt.
- If the user guesses correctly, a victory message must be displayed and the game must end.
- If the user guesses wrong, the program must indicate whether the secret number is higher or lower.
- If the user runs out of attempts, a defeat message must be displayed.

Example:
- Secret number: 7
- Maximum attempts: 3
- Valid range: 1..10

The program must keep track of:
- How many attempts the user has used.
- How many attempts the user has left.
- Whether the user has won or lost.

Concepts you must use:
- val
- var
- readln()
- toInt()
- if
- else if
- else
- ranges with in or !in
- while
- break
- continue
 */

fun main(){
    val secretNumber = 7
    val minNumber = 1
    val maxNumber = 10
    val maxAttempts = 3

    var attempts = 0
    var hasWon = false

    println("Guess the secret number between $minNumber and $maxNumber")
    println("You have $maxAttempts attempts")

    while(attempts < maxAttempts){
        println("Enter a number:")
        val guess = readln().toInt()

        // 1. Check whether the number is outside the range.
        //    If it is, display a message and use continue.

        if(guess !in minNumber..maxNumber){
            println("The number must be between $minNumber and $maxNumber")
            continue
        }

        // 2. If the number is valid, add one attempt.
        attempts += 1

        // 3. Check whether the user has guessed correctly.
        //    If so, set hasWon to true and use break.
        if(guess == secretNumber){
            hasWon = true
            break
        }
        // 4. If the guess is wrong, indicate whether the secret number is higher or lower.
        else if (guess < secretNumber){
            println("The number is higher")
        }else{
            println("The number is lower")
        }

        // 5. Calculate the remaining attempts and display them if there are any left.
        val remainingAttempts = maxAttempts - attempts
        if(remainingAttempts > 0){
            println("Attempts left: $remainingAttempts")
        }
    }

    // 6. Outside the loop, display whether the user has won or lost.
    if(hasWon){
        println("You win!")
        println("Attempts used: $attempts")
    }else{
        println("You lose! The secret number was $secretNumber")
    }

}