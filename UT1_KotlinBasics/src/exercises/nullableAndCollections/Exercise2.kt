package exercises.nullableAndCollections

/*
 * EXERCISE 2 · PREDICT THE OUTPUT
 *
 * Remember the two rules:
 *  - a?.b   -> "if a is not null, give me b; otherwise, null"
 *  - a ?: b -> "a, or b if a is null"
 */

fun main() {
    val a: String? = "Kotlin"
    val b: String? = null

    println(a?.length)
    // 6        a is not null, so ?. gets its length.

    println(b?.length)
    // null     b is null: ?. does not call length, the result is null (no crash).

    println(b?.length ?: -1)
    // -1       b?.length is null, so Elvis uses the value on the right.

    println(a ?: "empty")
    // Kotlin   a is not null, so Elvis keeps the value on the left.

    println(b ?: "empty")
    // empty    b is null, so Elvis uses the value on the right.

    println("12".toIntOrNull()?.plus(1))
    // 13       "12" is a valid number (12), and ?.plus(1) adds 1.
    //          plus(1) is the function version of + 1. We need it because
    //          after ?. we must call a function, we cannot write ?.+ 1

    println("doce".toIntOrNull()?.plus(1) ?: 0)
    // 0        "doce" is not a number -> null. ?.plus(1) is skipped -> null.
    //          Finally, Elvis replaces null with 0.
}
