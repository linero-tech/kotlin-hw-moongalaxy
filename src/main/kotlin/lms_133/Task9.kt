package lms_133

fun harshad(number: Int): Boolean{
    if (number == 0) return false

    var digitSum = 0
    number.toString().forEach { digit ->
        digitSum += digit.digitToInt()
    }
    return number % digitSum == 0
}
fun main() {

    println(harshad(number = 1)) //
    println(harshad(number = 2)) //
    println(harshad(number = 10)) //
    println(harshad(number = 12)) //

    println(harshad(number = 0)) //
    println(harshad(number = 11)) //
    println(harshad(number = 13)) //
    println(harshad(number = 15)) //

}
