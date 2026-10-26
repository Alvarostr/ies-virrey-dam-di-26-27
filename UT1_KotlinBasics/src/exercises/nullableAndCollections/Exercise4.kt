package exercises.nullableAndCollections

/*
 * EXERCISE 4 · MARKS ANALYSIS
 *
 * Key ideas:
 *  - List functions that receive a lambda: in the lambda, `it` is each mark.
 *  - filter, map and sorted return a NEW list: `marks` never changes.
 *  - maxOrNull / minOrNull return Double? because the list could be empty.
 */

const val PASS_MARK = 5.0
const val MAX_MARK = 10.0
const val EXTRA_POINT = 1.0

fun main() {
    val marks = listOf(7.5, 4.0, 9.0, 5.5, 3.0, 8.0, 6.5)

    // average() returns a Double. format gives two decimals.
    println("Average: ${"%.2f".format(marks.average())}")              // 6,21 or 6.21

    // maxOrNull() is Double?: Elvis gives a value if the list were empty.
    // (max() also exists, but it crashes with an empty list.)
    val highest = marks.maxOrNull() ?: 0.0
    val lowest = marks.minOrNull() ?: 0.0
    println("Highest: $highest | Lowest: $lowest")                      // 9.0 | 3.0

    // count { } counts the elements that meet the condition.
    val passed = marks.count { it >= PASS_MARK }
    println("Passed: $passed of ${marks.size}")                         // 5 of 7

    // Chaining: first filter, then sort. Read it from top to bottom.
    val failingSorted = marks
        .filter { it < PASS_MARK }
        .sorted()
    println("Failing marks: $failingSorted")                            // [3.0, 4.0]

    // map transforms each element. minOf chooses the smallest of two values,
    // so a 9.5 + 1 becomes 10.0, never 10.5.
    val roundedUp = marks.map { minOf(it + EXTRA_POINT, MAX_MARK) }
    println("With an extra point: $roundedUp")

    // any { } answers: is there at least one element that meets the condition?
    val someoneGotTen = marks.any { it == MAX_MARK }
    println("Did anyone get a 10? $someoneGotTen")                      // false

    // marks has not changed: every operation created a new list.
    println("Original marks: $marks")
}