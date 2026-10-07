package exercises
/**
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

const val COMPANY_NAME = "AristiDevs SL"
const val CURRENCY_SYMBOL = "$"
const val TAX_PERCENTAGE = 7.0
const val CONTINGENCY_PERCENTAGE = 5.0
const val INITIAL_PAYMENT_PERCENTAGE = 30.0


fun main() {

    val clientName = "IES VIRREY MORCILLO"
    val projectName = "Developing Interface"

    val hourlyRate = 45.0
    val estimatedHours = 80
    val discountPercent = 10.0

    val designCost = 600.0
    val licenseCost = 150.0
    val otherExpenses = 100.0

    //RESULT:
    println("=======================================")
    println("              BUDGET              ")
    println("=======================================")
    println("Company: $COMPANY_NAME")
    println("Client: $clientName")
    println("PROJECT: $projectName")
    println("=======================================")

    val laborCost = hourlyRate * estimatedHours
    println("Total labor cost based on estimated hours: $laborCost")

    val additionalCost = designCost + licenseCost + otherExpenses
    println("Total additional costs: $additionalCost")

    val basePrice = laborCost + additionalCost
    println("Project base price: $basePrice $CURRENCY_SYMBOL")

    val contingencyAmount = (basePrice * CONTINGENCY_PERCENTAGE) / PERCENTAGE_BASE
    println("Contingency amount: $contingencyAmount")

    val subtotal = basePrice + contingencyAmount
    println("Subtotal before discount: $subtotal")

    val discountAmount = (subtotal * discountPercent) / PERCENTAGE_BASE
    val priceAfterDiscount = subtotal - discountAmount
    println("Discount ($discountPercent%): $discountAmount $CURRENCY_SYMBOL")
    println("Price after discount: $priceAfterDiscount $CURRENCY_SYMBOL")

    val taxAmount = (priceAfterDiscount * TAX_PERCENTAGE)/PERCENTAGE_BASE
    val finalPrice = priceAfterDiscount + taxAmount
    println("Tax ($TAX_PERCENTAGE%): $taxAmount $CURRENCY_SYMBOL")
    println("Final price: $finalPrice$CURRENCY_SYMBOL")

    val initialPayment = (finalPrice * INITIAL_PAYMENT_PERCENTAGE) /PERCENTAGE_BASE
    val remainingAmount = finalPrice - initialPayment

    println("Down payment ($INITIAL_PAYMENT_PERCENTAGE%): $initialPayment$CURRENCY_SYMBOL")
    println("Remaining balance: $remainingAmount$CURRENCY_SYMBOL")

    println("=======================================")
}

