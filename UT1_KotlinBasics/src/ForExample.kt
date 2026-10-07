fun main(){
//    println("Class number 1")
//    println("Class number 2")
//    println("Class number 3")
//    println("Class number 4")
//    println("Class number 5")

    for(lessonNumber in 1..5){
        println("Class number $lessonNumber")
    }
    var doubledNumber = 1
    for(lessonNumber in 1..5){
        doubledNumber = 2 * doubledNumber
        println("Class number $doubledNumber")
    }


    for(lessonNumber in 1..5){
        var doubledNumber2 = 1
        doubledNumber2 = 2 * doubledNumber2
        println("Class number $doubledNumber2")
    }

    var firstLesson = 1
    var lastLesson = 100

    for(lessonNumber in firstLesson..lastLesson step 2){
        println("Class number $lessonNumber")
    }
}