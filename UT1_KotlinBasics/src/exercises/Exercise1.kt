package exercises
/*
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
const val TAXES = 21
const val PERCENTAGE_BASE = 100
fun main(){
    val productName:String = "Kotlin Course"
    val unitPrice:Double = 199.9
    val quantity:Int = 8
    val discount:Double = 15.0


    val subTotal:Double = quantity * unitPrice
    val totalDiscountPerUnit = (discount * unitPrice)/PERCENTAGE_BASE
    val totalDiscount = totalDiscountPerUnit * quantity
    val finalTotalAfterDiscount = subTotal - totalDiscount
    val calculateTaxes = (TAXES * finalTotalAfterDiscount)/PERCENTAGE_BASE
    val total = finalTotalAfterDiscount + calculateTaxes

    println("My order is: ")
    println("1. Product:               $productName")
    println("2. Unit price:            $unitPrice€")
    println("3. Quantity:              $quantity")

    println("4: Subtotal:              $subTotal€")
    println("5. PVP after discount:    ${finalTotalAfterDiscount}€")
    println("6. Tax:                   $TAXES%  $calculateTaxes ")
    println("7. TOTAL:                 ${total + TAXES}€")

}