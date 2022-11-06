package lms_131

fun task10(mapa: Map<Int, String>): Map<String, Int> {

    val result = mutableMapOf<String, Int>()
    mapa.forEach {entity -> result[entity.value] = entity.key}

    return result
}
fun main (){
    println(task10(mapa = Map<Int, String>(1 to "A", 2 to "B", 3 to "C")))
}