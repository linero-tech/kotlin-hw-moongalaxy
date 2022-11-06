package lms_131

fun task6(mapa: Map<Int, String>, parameter: String): Map<Int, String> {

    return mapa.filter { entry -> entry.value == parameter }
}

fun main() {
    println(task6(mapOf(20 to "Ana", 40 to "John", 22 to "Ana"), "Ana"))
}
