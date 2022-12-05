package lms_133

fun converter(hours: Int): Int = hours * 3600000

fun main() {
    println(converter(2))//7200000
    println(converter(4))//14400000
    println(converter(1))//3600000
    println(converter(10))//3600000
}

