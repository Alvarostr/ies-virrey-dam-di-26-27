package exercises

/**
 * Exercise: Organize a product calculator using functions
 *
 * Write a program that calculates the final price of a product.
 *
 * Product data:
 * - Product name: "Kotlin Course"
 * - Unit price: 99.0
 * - Quantity: 2
 * - Discount percentage: 10.0
 * - Tax percentage: 7.0
 *
 * The program must calculate:
 * - Subtotal
 * - Discount amount
 * - Price after discount
 * - Tax amount
 * - Final price
 *
 * Requirements:
 * - Create functions without parameters to display the welcome and goodbye messages.
 * - Create functions with input parameters to display the product information and the final summary.
 * - Create functions with return values to calculate the different amounts.
 * - Call everything from main.
 */

fun main() {
    val productName: String = "Kotlin Course"
    val unitPrice: Double = 29.99
    val quantity = 3
    val discountPercentage = 10
    val taxPercentage = 7

    val subtotal = calculateSubtotal(unitPrice, quantity)
    val discountAmount = calculateDiscountAmount(subtotal, discountPercentage)
    val priceAfterDiscount = calculatePriceAfterDiscount(subtotal, discountAmount)
    val taxAmount = calculateTaxAmount(priceAfterDiscount, taxPercentage)
    val finalPrice = calculateFinalPrice(priceAfterDiscount, taxAmount)

    showWelcomeMessage()
    showSummary(
        subtotal,
        discountAmount,
        priceAfterDiscount,
        taxAmount,
        finalPrice
    )
    showGoodbyeMessage()
}

fun showSummary(
    subtotal: Double,
    discountAmount: Double,
    priceAfterDiscount: Double,
    taxAmount: Double,
    finalPrice: Double
) {
    println("---------------------")
    println("Subtotal: $subtotal euros")
    println("Discount amount: $discountAmount euros")
    println("Price after discount: $priceAfterDiscount euros")
    println("Tax amount: $taxAmount euros")
    println("Final price: $finalPrice euros")
    println("---------------------")
}

fun calculateSubtotal(unitPrice: Double, quantity: Int): Double {
    return unitPrice * quantity
}

fun calculateDiscountAmount(subtotal: Double, discountPercentage: Int) =
    (subtotal * discountPercentage) / PERCENTAGE_BASE

fun calculatePriceAfterDiscount(subtotal: Double, discountAmount: Double): Double {
    return subtotal - discountAmount
}

fun calculateTaxAmount(priceAfterDiscount: Double, taxPercentage: Int): Double {
    return (priceAfterDiscount * taxPercentage) / PERCENTAGE_BASE
}

fun calculateFinalPrice(priceAfterDiscount: Double, taxAmount: Double): Double {
    return priceAfterDiscount + taxAmount
}

fun showWelcomeMessage() {
    println("============================")
    println("     Product Calculator     ")
    println("============================")
}

fun showGoodbyeMessage() {
    println("============================")
    println("    Calculation complete    ")
    println("============================")
}