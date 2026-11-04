package exercises.classes

/*
 * EXERCISE 6 · EXTENSION FUNCTIONS
 *
 * Key ideas:
 *  - fun Type.name() adds a function to an existing type without modifying it.
 *  - Inside the function, "this" is the value the function is called on (it can be omitted).
 *  - Behind the scenes, it is a static function that receives the value as first parameter:
 *    19.5.toEuros() is the same as toEuros(19.5), written in a nicer way.
 *
 * NOTE: the statement asks for a file called Extensions.kt. Here everything is in one file
 * (extensions + main). In a real project, the extensions would go in Extensions.kt and
 * could be used from any file of the package.
 */

private const val CURRENCY = "€"

// 1. Double.toEuros()
// "this" is the Double. format uses the language of the computer: 19,50 or 19.50.
fun Double.toEuros(): String = "%.2f $CURRENCY".format(this)

// 2. String.isValidEmail()
// Rules: exactly one '@', and at least one '.' AFTER the '@'.
fun String.isValidEmail(): Boolean {
    // Guard clause: if there is not exactly one '@', stop here (Block 3).
    if (count { it == '@' } != 1) return false

    // substringAfter returns the text after the '@'. "this." is omitted: count and
    // substringAfter are called on the String itself.
    val domain = substringAfter('@')
    return '.' in domain
}

// 3. String.capitalizeWords()
// split(" ") -> list of words; map -> each word with its first letter in uppercase;
// joinToString(" ") -> back to a single String.
fun String.capitalizeWords(): String =
    split(" ").joinToString(" ") { word ->
        word.replaceFirstChar { it.uppercaseChar() }
    }

// 4. List<Double>.average2()
// The receiver can be any type, also a list. An empty list has no average:
// we check it first to avoid printing "NaN".
fun List<Double>.average2(): String =
    if (isEmpty()) "No data" else "%.2f".format(average())

fun main() {
    println("--- toEuros ---")
    println(19.5.toEuros())                          // 19,50 € (or 19.50 €)
    println((3 * 4.99).toEuros())                    // 14,97 € : parentheses, then the extension

    println("--- isValidEmail ---")
    val emails = listOf("ana@mail.com", "ana.garcia@mail", "anamail.com", "ana@@mail.com", "a@b.es")
    for (email in emails) {
        println("$email -> ${email.isValidEmail()}")
    }

    println("--- capitalizeWords ---")
    println("hello kotlin world".capitalizeWords())  // Hello Kotlin World

    println("--- average2 ---")
    println(listOf(7.5, 4.0, 9.0).average2())        // 6,83 (or 6.83)
    println(emptyList<Double>().average2())          // No data
}