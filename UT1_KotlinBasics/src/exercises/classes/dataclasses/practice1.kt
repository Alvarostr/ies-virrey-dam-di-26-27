package exercises.classes.dataclasses

data class Contact(var name: String, var phone: String, var email: String?=null)

fun main(){
    val contact1 = Contact("Contact 1","123456789")
    val contact2 = Contact("Contact 1","123456789")
    println(contact1)
    println(contact1==contact2)
    println(contact1===contact2)
    val contact3 = contact1.copy(phone="987654321", email = "contact1@edu.com")
    println("Contact 1: $contact1")
    println("Copy contact 1: $contact3")
}