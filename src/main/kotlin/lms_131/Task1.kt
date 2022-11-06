package lms_131

fun task1(): Map<Int, Int> {


    val result = mutableMapOf<Int, Int>()
    for (number in 10..20) {
        if (number % 2 != 0) {
            result[number] = number * 2
        }
    }

    return result
}

fun main() {
    println(task1())
}
