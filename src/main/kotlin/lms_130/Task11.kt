package lms_130

fun task11_1(guests: List<String>): Int {


    val result = guests.size
    return result

}

fun task11_2(guests: List<String>, condition: String): List<String> {

    val result = mutableListOf<String>()
    for (guest in guests) {
        if (guest.contains(condition)) {
            result.add(guest)

        }

    }

    return result
}

fun main() {

    // Change the condition to either "-V", "-A", or "-K" to test your code under different conditions
    val conditionOfInterest = "-V"
    val listOfAttendees = listOf(
        "Stéphanie-A",
        "Edmée-K",
        "Maëlla-K",
        "Océanne-K",
        "Géraldine-K",
        "Maëline-K",
    )

    println("The event has a total of ${task11_1(listOfAttendees)} attendees.")
    println("The attendees with condition $conditionOfInterest are ${task11_2(listOfAttendees, conditionOfInterest)}")
}
