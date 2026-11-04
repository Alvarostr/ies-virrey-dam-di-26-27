package exercises.classes

/*
 * EXERCISE 5 · ORDER STATUS
 *
 * Key ideas:
 *  - An enum class has a closed set of values: no typos, no invalid states.
 *  - Each value has a property (description): the constructor of the enum is called
 *    once per value.
 *  - A when over an enum, used as an expression, does NOT need else if every value is covered.
 *  - nextStatus returns OrderStatus? (Block 4): some statuses have no next status.
 */
enum class OrderStatus(val description: String) {
    PENDING("Waiting for payment"),
    PAID("Payment received, preparing your order"),
    SHIPPED("Your order is on its way"),
    DELIVERED("Delivered. Enjoy it!"),
    CANCELLED("The order was cancelled")
}

// when WITHOUT else: the compiler checks that the 5 values are covered.
// If tomorrow we add RETURNED to the enum, this function stops compiling
// until we decide what its next status is. An "else" would hide that problem.
fun nextStatus(status: OrderStatus): OrderStatus? = when (status) {
    OrderStatus.PENDING -> OrderStatus.PAID
    OrderStatus.PAID -> OrderStatus.SHIPPED
    OrderStatus.SHIPPED -> OrderStatus.DELIVERED
    OrderStatus.DELIVERED -> null      // final status: there is no next one
    OrderStatus.CANCELLED -> null      // final status too
}

fun main() {
    println("--- Following an order ---")

    // current is OrderStatus? because nextStatus can return null.
    var current: OrderStatus? = OrderStatus.PENDING

    // The loop ends when there is no next status (Block 2 while + Block 4 null check).
    while (current != null) {
        // Smart cast: inside the loop, current is OrderStatus (not null).
        println("${current.name}: ${current.description}")
        current = nextStatus(current)
    }

    println("\n--- All the possible statuses ---")
    // entries contains all the values, in the order they were declared.
    for (status in OrderStatus.entries) {
        val next = nextStatus(status)?.name ?: "none"     // ?. and ?: from Block 4
        println("${status.ordinal + 1}. ${status.name} -> next: $next")
    }
}