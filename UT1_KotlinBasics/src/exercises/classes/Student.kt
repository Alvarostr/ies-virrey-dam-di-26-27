package exercises.classes


/*
 * EXERCISE 1 · FROM JAVA TO KOTLIN
 *
 * The Java class had 3 attributes, 2 constructors, 3 getters, 1 setter and 1 method:
 * about 20 lines. In Kotlin, the whole class fits in a few lines.
 *
 * Decisions:
 *  - name  -> val : a student's name does not change.
 *  - group -> val : it does not change during the course. (A var would also be acceptable
 *                   if students can change group; the important thing is to decide on purpose.)
 *  - mark  -> var : the mark changes, so it needs a setter.
 */

// private top-level constant (section 5): only visible in this file,
// so it cannot clash with constants of other exercises in the same package.
private const val PASS_THRESHOLD = 5.0

class Student(
    val name: String,
    val group: String = "2DAM",     // default values replace the second Java constructor:
    var mark: Double = 0.0          // Student("Ana") works just like this(name, "2DAM", 0.0)
) {
    // Computed property (section 2.1): it is calculated EVERY time it is read.
    // If we wrote  val passed = mark >= 5  it would be calculated only once,
    // when the student is created, and would not change after setting a new mark.
    val passed: Boolean
        get() = mark >= PASS_THRESHOLD

    override fun toString(): String =
        "$name ($group) - mark: $mark - ${if (passed) "passed" else "failed"}"

}