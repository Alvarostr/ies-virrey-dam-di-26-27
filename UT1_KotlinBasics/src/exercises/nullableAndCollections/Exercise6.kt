package exercises.nullableAndCollections

/*
 * EXERCISE 6 · MANAGE A PRODUCT LIST
 *
 * Key ideas:
 *  - MutableMap<String, Double>: product name (key) -> price (value).
 *  - map[key] = value adds a new pair OR replaces the value of an existing key.
 *  - map[key] returns Double? : the key may not exist.
 *  - One function per operation; main only calls them.
 */

fun formatPrice(price: Double): String = "%.2f €".format(price)

// 1. Show all the products
fun showProducts(products: Map<String, Double>) {
    if (products.isEmpty()) {
        println("The catalogue is empty")
        return
    }
    for ((name, price) in products) {
        println("- $name: ${formatPrice(price)}")
    }
}

// 2. Add a product or update its price
fun addOrUpdateProduct(products: MutableMap<String, Double>, name: String, price: Double) {
    // We check BEFORE assigning, to tell the user what happened.
    val existed = name in products
    products[name] = price          // the same line adds or updates
    println(if (existed) "$name updated to ${formatPrice(price)}" else "$name added")
}

// 3. Remove a product
fun removeProduct(products: MutableMap<String, Double>, name: String) {
    // remove(key) returns the removed value, or null if the key did not exist.
    val removedPrice = products.remove(name)
    if (removedPrice == null) {
        println("$name did not exist")
    } else {
        println("$name removed")
    }
}

// 4. Show the price of a product chosen by the user
fun showPriceOf(products: Map<String, Double>) {
    print("Product name: ")
    val name = readln().trim()
    // products[name] is Double?  ->  ?.let formats it only if it exists,
    // and Elvis gives the message when it does not.
    val message = products[name]?.let { formatPrice(it) } ?: "Product not found"
    println(message)
}

// 5. Products cheaper than a given price
fun showCheaperThan(products: Map<String, Double>, maxPrice: Double) {
    // filter also works on maps. In the lambda, `it` is a pair (entry):
    // it.key is the product and it.value is the price.
    val cheap = products.filter { it.value < maxPrice }
    println("Cheaper than ${formatPrice(maxPrice)}: ${cheap.keys}")
}

// 6. Total value and most expensive product
fun showCatalogueSummary(products: Map<String, Double>) {
    println("Total value: ${formatPrice(products.values.sum())}")

    // maxByOrNull returns the entry with the highest value, or null if the map is empty.
    val mostExpensive = products.maxByOrNull { it.value }
    if (mostExpensive != null) {
        println("Most expensive: ${mostExpensive.key} (${formatPrice(mostExpensive.value)})")
    }
}

fun main() {
    val products = mutableMapOf(
        "Keyboard" to 25.0,
        "Mouse" to 12.5,
        "Monitor" to 149.99,
        "USB cable" to 4.5
    )

    showProducts(products)
    println()
    addOrUpdateProduct(products, "Webcam", 39.9)     // new product
    addOrUpdateProduct(products, "Mouse", 10.0)      // existing product: price updated
    removeProduct(products, "USB cable")
    removeProduct(products, "Printer")               // did not exist
    println()
    showPriceOf(products)
    showCheaperThan(products, 30.0)
    showCatalogueSummary(products)
}