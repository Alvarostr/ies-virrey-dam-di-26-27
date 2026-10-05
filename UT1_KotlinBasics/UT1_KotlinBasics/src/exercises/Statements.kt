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
