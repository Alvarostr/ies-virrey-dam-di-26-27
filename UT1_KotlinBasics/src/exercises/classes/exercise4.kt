package exercises.classes

/*
 * EXERCISE 4 · PRODUCT CATALOGUE WITH DATA CLASSES
 *
 * In Block 4 we used a Map<String, Double> (name -> price). Now each product is an object
 * that carries ALL its information, and the catalogue is a MutableList<Product>.
 *
 * Key ideas:
 *  - data class -> toString(), equals() and copy() are generated for us.
 *  - All the properties are val: a product is never modified, it is REPLACED by a copy.
 *  - The helper functions are private: they are only visible in this file, so they cannot
 *    clash with functions of other exercises in the same package (section 5).
 */
data class Product(val name: String, val price: Double, val stock: Int)

private const val DISCOUNT_PERCENTAGE = 10.0
private const val FULL_PERCENTAGE = 100.0

private fun formatPrice(price: Double): String = "%.2f €".format(price)

// ---------- Operations ----------

private fun showCatalogue(catalogue: List<Product>) {
    if (catalogue.isEmpty()) {
        println("The catalogue is empty")
        return
    }
    for (product in catalogue) {
        // Each object has its own properties: product.name, product.price, product.stock
        println("- ${product.name}: ${formatPrice(product.price)} (${product.stock} in stock)")
    }
}

private fun addProduct(catalogue: MutableList<Product>, product: Product) {
    // any { } answers: is there already a product with this name?
    if (catalogue.any { it.name == product.name }) {
        println("${product.name} is already in the catalogue")
        return
    }
    catalogue.add(product)
    println("${product.name} added")
}

// find returns Product? (Block 4): the product, or null if no product has that name.
private fun findProduct(catalogue: List<Product>, name: String): Product? =
    catalogue.find { it.name.equals(name, ignoreCase = true) }

private fun showProductsWithStock(catalogue: List<Product>) {
    val available = catalogue.filter { it.stock > 0 }   // a new list: catalogue does not change
    println("With stock: ${available.map { it.name }}")
}

private fun showMostExpensive(catalogue: List<Product>) {
    // maxByOrNull returns the WHOLE product with the highest price, or null if the list is empty.
    val mostExpensive = catalogue.maxByOrNull { it.price }
    println("Most expensive: ${mostExpensive?.name ?: "none"}")
}

private fun applyDiscount(catalogue: MutableList<Product>, name: String) {
    // We need the POSITION of the product to replace it in the list.
    // indexOfFirst returns -1 if it does not exist (like indexOf, not null!).
    val index = catalogue.indexOfFirst { it.name == name }
    if (index == -1) {
        println("$name not found: no discount applied")
        return
    }

    val product = catalogue[index]
    val newPrice = product.price - product.price * DISCOUNT_PERCENTAGE / FULL_PERCENTAGE

    // copy() creates a NEW product with the same name and stock and the new price.
    // Then we put the new product in the same position of the list.
    catalogue[index] = product.copy(price = newPrice)
    println("$name: ${formatPrice(product.price)} -> ${formatPrice(newPrice)}")
}

// ---------- Main ----------

fun main() {
    val catalogue = mutableListOf(
        Product("Keyboard", 25.0, 10),
        Product("Mouse", 12.5, 0),
        Product("Monitor", 149.99, 3),
        Product("USB cable", 4.5, 50)
    )

    println("--- Catalogue ---")
    showCatalogue(catalogue)

    println("\n--- Adding products ---")
    addProduct(catalogue, Product("Webcam", 39.9, 5))
    addProduct(catalogue, Product("Mouse", 9.99, 2))          // already exists

    println("\n--- Searching ---")
    // ?: gives a message when find returns null.
    println(findProduct(catalogue, "monitor") ?: "Product not found")
    println(findProduct(catalogue, "Printer") ?: "Product not found")

    println("\n--- Stock and prices ---")
    showProductsWithStock(catalogue)
    showMostExpensive(catalogue)

    println("\n--- 10 % discount ---")
    applyDiscount(catalogue, "Keyboard")
    applyDiscount(catalogue, "Printer")
    println(findProduct(catalogue, "Keyboard"))               // the new Keyboard object
}


