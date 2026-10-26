package exercises.nullableAndCollections

/*
 * EXERCISE 3 · CREATE YOUR OWN CONTACT BOOK
 *
 * Key ideas:
 *  - A MutableList declared with val: the variable always points to the same list,
 *    but we can add and remove elements.
 *  - find { } returns the first element that meets a condition, or null (String?).
 *  - One function per menu option (single responsibility, Block 3).
 *  - readIntOrDefault (Exercise 1) makes the menu crash-proof.
 */

const val OPTION_ADD = 1
const val OPTION_SHOW = 2
const val OPTION_SEARCH = 3
const val OPTION_DELETE = 4
const val OPTION_EXIT = 5
const val INVALID_OPTION = -1

fun printContactMenu() {
    println()
    println("1. Add contact")
    println("2. Show contacts")
    println("3. Search contact")
    println("4. Delete contact")
    println("5. Exit")
}

// The list is received as a parameter: the function can modify its content.
fun addContact(contacts: MutableList<String>) {
    print("Name: ")
    val name = readln().trim()

    // Guard clauses (Block 3): reject invalid data first.
    if (name.isBlank()) {
        println("The name cannot be empty")
        return
    }
    // Note: `in` is case-sensitive, so "Ana" and "ana" count as different contacts.
    // Improvement: contacts.any { it.equals(name, ignoreCase = true) }
    if (name in contacts) {
        println("$name is already in your contact book")
        return
    }

    contacts.add(name)
    println("$name added")
}

// Showing does not modify anything, so a read-only List is enough here.
// A MutableList can always be passed where a List is expected.
fun showContacts(contacts: List<String>) {
    if (contacts.isEmpty()) {
        println("No contacts yet")
        return
    }
    // withIndex() gives the position and the element. Positions start at 0,
    // so we add 1 to show the list numbered from 1.
    for ((index, contact) in contacts.withIndex()) {
        println("${index + 1}. $contact")
    }
}

fun searchContact(contacts: List<String>) {
    print("Search: ")
    val text = readln().trim()

    // find returns String?: the first contact that contains the text, or null.
    // ignoreCase = true makes "ana" find "Ana" (named argument, Block 3).
    val found = contacts.find { it.contains(text, ignoreCase = true) }

    // Elvis: if nothing was found, show a message instead of "null".
    println(found ?: "Not found")
}

fun deleteContact(contacts: MutableList<String>) {
    print("Name to delete: ")
    val name = readln().trim()

    // remove() returns true if the element existed and was removed, false otherwise.
    // We use that Boolean directly in an if.
    if (contacts.remove(name)) {
        println("$name deleted")
    } else {
        println("$name was not in your contact book")
    }
}

fun main() {
    // Empty list: the type must be written, Kotlin has no elements to infer it from.
    val contacts = mutableListOf<String>()

    do {
        printContactMenu()
        // Letters or empty input -> INVALID_OPTION. It never crashes.
        val option = readIntOrDefault("Choose an option: ", INVALID_OPTION)

        when (option) {
            OPTION_ADD -> addContact(contacts)
            OPTION_SHOW -> showContacts(contacts)
            OPTION_SEARCH -> searchContact(contacts)
            OPTION_DELETE -> deleteContact(contacts)
            OPTION_EXIT -> println("Goodbye!")
            else -> println("Invalid option, choose a number from 1 to 5")
        }
    } while (option != OPTION_EXIT)   // do-while: the menu is shown at least once (Block 2)
}

