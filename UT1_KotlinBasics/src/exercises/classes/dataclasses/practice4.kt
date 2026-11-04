package exercises.classes.dataclasses

fun main(){
    val contacts = listOf(
        Contact("Ana","1"),
        Contact("Luis","2"),
        Contact("Ana","1"),
        Contact("Ana","1")
    )
    // size counts every element.
    println("Contacts: ${contacts.size}")

    println("Different contacts: ${contacts.distinct().size}")


    println("Different names: ${contacts.map { it.name }.distinct()}")

}