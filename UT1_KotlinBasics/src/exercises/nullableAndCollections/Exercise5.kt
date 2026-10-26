package exercises.nullableAndCollections

/*
 * EXERCISE 5 · UNIQUE VISITORS
 *
 * Key ideas:
 *  - A List keeps repetitions; a Set does not allow them.
 *  - A Map associates each key (user) with a value (number of visits).
 *  - Reading a key that does not exist in a map gives null: Elvis solves it.
 */

fun main() {
    val visits = listOf("ana", "luis", "ana", "marta", "luis", "ana", "pablo")

    // size counts every element, repeated or not.
    println("Total visits: ${visits.size}")                    // 7

    // toSet() creates a Set: repeated values disappear.
    val uniqueVisitors = visits.toSet()
    println("Different users: ${uniqueVisitors.size}")         // 4
    println("Users: $uniqueVisitors")                          // [ana, luis, marta, pablo]

    // Counting visits per user with a MutableMap.
    val visitsPerUser = mutableMapOf<String, Int>()
    for (user in visits) {
        // visitsPerUser[user] is Int?: null the first time we see a user.
        // ?: 0 means "if this user is new, start from 0". Then we add 1.
        visitsPerUser[user] = (visitsPerUser[user] ?: 0) + 1
    }

    // Destructuring (key, value) as in section 12.1.
    for ((user, times) in visitsPerUser) {
        println("$user: $times visit(s)")
    }
}