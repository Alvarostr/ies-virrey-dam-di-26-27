package exercises.classes.dataclasses

class Box(val label: String)
data class Point(val x: Int,val y: Int)

fun main(){
    println(Box("A") == Box("A") )
    println(Point(1,2) == Point(1,2))

    val p = Point(3,4)
    val(y,x) = p
    println("x=$x y=$y")

    println(p.copy(y=0))
    println(listOf(Point(1,1), Point(2,2)).distinct())

}