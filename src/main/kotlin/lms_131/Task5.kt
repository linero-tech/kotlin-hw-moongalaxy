package lms_131

fun task5(mapa: Map<Int, Int>, constant: Int): List<Int> {
    val result = mutableListOf<Int>()
    mapa.forEach { entry -> if (entry.value != constant) result.add(entry.key) }

    return result
}

fun main() {
    println(task5(mapOf(1 to 100, 3 to 200, 4 to 500, 6 to 100, 100 to 10), 100))
}