package exercises.classes.dataclasses

private const val PASS_MARK = 5.0
data class Grade(val student: String, val subject: String, val mark:Double)

val grades = listOf(
    Grade("Laura", "DI", 8.5),
    Grade("Pablo","DI",4.0),
    Grade("Marta", "DI", 6.75),
    Grade("Laura", "PMDM",9.0),
    Grade("Pablo","PMDM",5.5)
)
fun main(){
    //1.Average of all the marks.
    val average = grades.map{it.mark}.average()
    println("1.Average: ${"%.2f".format(average)}")
    //2.Students with a failed mark
    val failed = grades.filter { it.mark<PASS_MARK }.map{it.student}
    println("2.Failed: $failed")
    //3.Best grade
    val best = grades.maxByOrNull { it.mark }
    println("3.Best grade: {$best ?:No grades")
    //4. Sorted from highest to lowest.
    val ranking = grades
        .sortedByDescending { it.mark }
        .map{"${it.student} ${it.mark}"}
    println("4. Ranking: $ranking")

    //5. Laura's average.
    val lauraAverage = grades
        .filter{it.student == "Laura"}
        .map{it.mark}
        .average()
    println("5. Laura's average: $lauraAverage")
    //6. Students without repetitions.
    val students = grades.map{it.student}.distinct()
    println("6.Students: $students")
}