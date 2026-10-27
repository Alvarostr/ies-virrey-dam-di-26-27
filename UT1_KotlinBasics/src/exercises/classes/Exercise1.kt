package exercises.classes

fun main() {
    // No "new" keyword: we call the constructor like a function.
    val laura = Student("Laura", "2DAM", 7.5)
    val pablo = Student("Pablo")                    // uses the default group and mark

    // Named arguments make the call self-explanatory and allow any order (Block 3).
    val marta = Student(mark = 4.0, name = "Marta")

    println(laura)
    println(pablo)
    println(marta)

    // mark is var: we can change it. Behind the scenes Kotlin calls setMark().
    pablo.mark = 6.25
    println("After the exam: $pablo")               // passed is calculated again

    // pablo.name = "Pedro"   // ERROR: val cannot be reassigned
}