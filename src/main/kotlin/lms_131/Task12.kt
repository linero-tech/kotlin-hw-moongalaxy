package lms_131

fun task12(a: List<Int>, b: List<String>): Map<Int, String> {

    val result = mutableMapOf<Int, String>()
    for ((index, item) in a.withIndex()) {
        result[item] = b[index]
    }

    return result
}

fun main() {
    println(task12(listOf(1, 2, 3, 4), listOf("W", "X", "Y", "Z")))
}