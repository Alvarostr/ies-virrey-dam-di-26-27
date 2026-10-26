package exercises.nullableAndCollections

/*
 * CHALLENGE · SHOP WITH STOCK
 *
 * Data structures:
 *  - prices: Map<String, Double>        -> read-only: prices do not change during the purchase
 *  - stock:  MutableMap<String, Int>    -> changes every time a product goes into the cart
 *  - cart:   MutableList<String>        -> a List allows repetitions: 2 keyboards = "Keyboard" twice
 *
 * Uses readIntOrDefault from Exercise 1 (same package).
 * There is no !! anywhere: every possible null is handled with if, ?. or ?:
 */

const val SHOP_TAX_PERCENTAGE = 21.0
const val SHOP_FULL_PERCENTAGE = 100.0

const val SHOP_SHOW_CATALOGUE = 1
const val SHOP_ADD_TO_CART = 2
const val SHOP_SHOW_CART = 3
const val SHOP_CHECKOUT = 4
const val SHOP_EXIT = 5

fun printShopMenu() {
    println()
    println("1. Show catalogue")
    println("2. Add product to cart")
    println("3. Show cart")
    println("4. Finish purchase")
    println("5. Exit without buying")
}

fun showCatalogue(prices: Map<String, Double>, stock: Map<String, Int>) {
    for ((product, price) in prices) {
        // stock[product] is Int?: if a product had no stock entry, we show 0.
        val units = stock[product] ?: 0
        println("- $product: ${formatPrice(price)} ($units left)")
    }
}

fun addToCart(stock: MutableMap<String, Int>, cart: MutableList<String>) {
    print("Product: ")
    val product = readln().trim()

    // stock[product] is Int?: null if the product is not in the catalogue.
    // We use an if (not ?: return) because we also want to tell the user what happened.
    val units = stock[product]
    if (units == null) {
        println("$product is not in the catalogue")
        return
    }
    // From here on, units is Int (smart cast).
    if (units == 0) {
        println("Sorry, $product is out of stock")
        return
    }

    stock[product] = units - 1      // one unit less in the shop...
    cart.add(product)               // ...and one more in the cart
    println("$product added to the cart")
}

// Total of the cart, without tax. sumOf adds up the result of the lambda for each element.
fun cartSubtotal(cart: List<String>, prices: Map<String, Double>): Double =
    cart.sumOf { prices[it] ?: 0.0 }

fun addTax(amount: Double): Double = amount + amount * SHOP_TAX_PERCENTAGE / SHOP_FULL_PERCENTAGE

fun showCart(cart: List<String>, prices: Map<String, Double>) {
    if (cart.isEmpty()) {
        println("Your cart is empty")
        return
    }
    println("Cart: $cart")
    println("Total (21 % tax included): ${formatPrice(addTax(cartSubtotal(cart, prices)))}")
}

fun printReceipt(cart: List<String>, prices: Map<String, Double>) {
    println("========== RECEIPT ==========")
    // distinct() removes repetitions: each product appears once in the receipt.
    for (product in cart.distinct()) {
        // count { } tells how many times the product is in the cart.
        val units = cart.count { it == product }
        val price = prices[product] ?: 0.0
        println("$product x$units: ${formatPrice(units * price)}")
    }
    val subtotal = cartSubtotal(cart, prices)
    println("-----------------------------")
    println("Subtotal: ${formatPrice(subtotal)}")
    println("Total (21 % tax): ${formatPrice(addTax(subtotal))}")
}

fun main() {
    val prices = mapOf("Keyboard" to 25.0, "Mouse" to 12.5, "Monitor" to 149.99)
    val stock = mutableMapOf("Keyboard" to 3, "Mouse" to 0, "Monitor" to 1)
    val cart = mutableListOf<String>()

    var finished = false
    while (!finished) {
        printShopMenu()
        when (readIntOrDefault("Choose an option: ", INVALID_OPTION)) {
            SHOP_SHOW_CATALOGUE -> showCatalogue(prices, stock)
            SHOP_ADD_TO_CART -> addToCart(stock, cart)
            SHOP_SHOW_CART -> showCart(cart, prices)
            SHOP_CHECKOUT -> {
                if (cart.isEmpty()) {
                    println("Your cart is empty: add something first")
                } else {
                    printReceipt(cart, prices)
                    finished = true
                }
            }
            SHOP_EXIT -> {
                println("See you soon!")
                finished = true
            }
            else -> println("Invalid option")
        }
    }
}