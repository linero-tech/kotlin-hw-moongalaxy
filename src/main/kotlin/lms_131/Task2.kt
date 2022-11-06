package lms_131

fun task2(mapa: Map<Int, Int>): Int {


    var result = 0
    mapa.keys.forEach {key -> result += key}

    return result
}

fun main() {
    println(task2(mapOf(1 to 10, 2 to 20, 3 to 30)))
}
