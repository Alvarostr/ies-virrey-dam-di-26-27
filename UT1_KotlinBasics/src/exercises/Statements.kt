package exercises

/*
EXERCISE ONE
Calculator: Create a calculator that takes the following parameters:
- Product name
- Unit price
- Quantity
- Discount (%)
- Tax (%)

The program must calculate the following values.
Example: subtotal of 100, 10% discount, 10% tax.
- Subtotal (100)
- Discount amount (10)
- Total price after discount (90)
- Tax amount (9)
- Total (99)
 */
/**
 EXERCISE TWO
FINAL PROJECT — COMPLETE PROJECT QUOTE CALCULATOR

Write a Kotlin program that generates a complete quote for a software
development project.

The quote must include the following data:

- Company name.
- Client name.
- Project name.
- Hourly rate.
- Estimated number of hours.
- Design cost.
- License cost.
- Other expenses.
- Contingency percentage.
- Discount percentage.
- Tax percentage.
- Down payment percentage.

The program must calculate:

1. Total labor cost based on the estimated hours.
2. Sum of all additional costs.
3. Base price of the project.
4. Amount added for contingencies.
5. Subtotal before discount.
6. Discount amount.
7. Price after discount.
8. Tax amount.
9. Final price of the quote.
10. Down payment amount.
11. Remaining balance.


Required formulas:

- Labor cost: hourly rate multiplied by the estimated number of hours.
- Additional costs: sum of the design cost, the license cost, and other expenses.
- Base price: sum of the labor cost and the additional costs.
- Contingency amount: base price multiplied by the contingency percentage and divided by the percentage base.
- Subtotal: sum of the base price and the contingency amount.
- Discount amount: subtotal multiplied by the discount percentage and divided by the percentage base.
- Price after discount: subtotal minus the discount amount.
- Tax amount: price after discount multiplied by the tax percentage and divided by the percentage base.
- Final price: price after discount plus the tax amount.
- Down payment: final price multiplied by the down payment percentage and divided by the percentage base.
- Remaining balance: final price minus the down payment.

Requirements:

- Use clear and descriptive variable names.
- Use val whenever the value does not need to change.
- Store the general quote rules as constants.
- Use Int for whole-number quantities and Double for prices and percentages.
- Avoid using magic numbers or strings directly in calculations.
- Break the calculations down into small, easy-to-follow steps.
- At the end, display a complete summary using a String.

Do not use yet:

- Additional functions.
- Conditionals.
- Loops.
- Classes.
- Console input.
 */
/**
 * EXERCISE THREE
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

/**
 * EXERCISE FOUR
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

/**
 * EXERCISE FIVE
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
