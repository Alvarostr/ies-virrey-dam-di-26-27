fun main(){

    val userRole: String = "admin"

    when(userRole){
        "admin" -> println("Hello Admin")
        "editor" -> println("Hello Editor")
        "viewer" -> println("Hello Viewer")
        else -> println("Hello Unknow role")
    }

    val permission2 = when(userRole){
        "admin" -> "Full access"
        "editor" -> "Editing access"
        "viewer" -> "Viewer access"
        else -> "Unknow role"
    }

    val score = 67
    val example = when {
        score > 50 -> "Passed"
        score > 70 && permission2 == "Full access" -> "Passed with merit"
        else -> "Awesome result!!!"
    }

    //ranges

    val level = 8
    when{
        level > 0 && level <= 3 -> println("Low Score")
        level > 3 && level <= 5 -> println("Beginner")
        level > 6 && level <= 8 -> println("Intermediate")
        level > 8 -> print("Advanced")
    }

    val myRange: IntRange = 0..10

    when(level){
        in 0..3 -> println("Low Score")
        in 3..5 ->println("Beginner")
        in 6..8 -> println("Intermediate")
        in 9 ..10 -> print("Advanced")
        else -> print("Advanced")
    }

}