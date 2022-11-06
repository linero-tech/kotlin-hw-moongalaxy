package lms_131

fun task3(a: Map<Int, String>, b: Map<Int, String>): List<Int> {

    val result = mutableListOf<Int>()
    val listAKeys = a.keys
    val listBKeys = b.keys

    listAKeys.forEach {key ->
        if (key in listBKeys) {
            result.add(key)
        }
    }

    //val result = listAKeys intersect listAKeys

    return result.toList()
}

fun main() {
    println(task3(
        mapOf(1 to "A", 2 to "B", 3 to "C"),
        mapOf(1 to "A", 2 to "B", 4 to "D")
    ))
}