package exercises.nullableAndCollections

/*
 * EXERCISE 1 · SAFE INPUT
 *
 * Key ideas:
 *  - toIntOrNull() returns Int? : the number, or null if the text is not a number.
 *  - The Elvis operator ?: replaces that null with a default value.
 *  - Result: the function can promise a normal Int (not Int?) to whoever calls it.
 *
 * NOTE: readIntOrDefault is reused in Exercises 3, 6 and the Challenge.
 * All the files of the package exercises.collections can see each other's functions.
 */

const val DEFAULT_AGE = 18
const val DEFAULT_TICKETS = 1

fun readIntOrDefault(message: String, default: Int): Int {
    print(message)
    // trim() removes spaces before and after: " 30 " would be invalid without it.
    // If the text is not a valid number, toIntOrNull() gives null and ?: uses the default.
    return readln().trim().toIntOrNull() ?: default
}

fun main() {
    val age = readIntOrDefault("Age: ", DEFAULT_AGE)
    val tickets = readIntOrDefault("Number of tickets: ", DEFAULT_TICKETS)

    // age and tickets are Int, not Int?: no null checks are needed here.
    println("Age: $age")
    println("Tickets: $tickets")
}