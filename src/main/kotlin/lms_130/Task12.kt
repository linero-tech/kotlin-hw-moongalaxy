package lms_130

import java.security.PKCS12Attribute

fun task12_1(sells: List<Int>): String {

    val days = listOf<String>("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    val maxSellVallue = sells.maxOrNull()
    val indexOfMaxSellValue = sells.indexOf(maxSellVallue)
    val result = days[indexOfMaxSellValue]

    println(result)

    return result
}

fun task12_2(sells: List<Int>): String {

    val days = listOf<String>("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    val maxSetlVallue = sells.minOrNull()
    val indexOfMaxSellValue = sells.indexOf(maxSetlVallue)
    val result = days[indexOfMaxSellValue]

    println(result)

    return result
}

fun task12_3(sells: List<Int>): Int {

    var result = 0
    sells.forEach {
        result += it
    }

    println(result)

    return result
}
fun main() {
    val listOfsells  = listOf( 1, 2,)
}