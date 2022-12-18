package lms_133

fun washing(washes: Int, months: Int): Double = (months * 30 * washes * 21).toDouble() / 60
fun main() {
    println(washing(washes = 8, months = 7))
}
