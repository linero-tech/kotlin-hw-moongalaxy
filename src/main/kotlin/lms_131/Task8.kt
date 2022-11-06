package lms_131

fun task8(grades: Map<String, List<Double>>): String {

    val sum = mutableMapOf<String, Double>()

    grades.forEach{entry ->
        val grade = entry.value
        var totalSum = 0.0
        grade.forEach{number ->
            totalSum += number
        }
        sum[entry.key]=totalSum/grade.size
    }

    println(sum)

    var maxKey = ""
    var maxValue = 0.0
    for ((key, value) in sum.entries) {
        if (value > maxValue) {
            maxValue = value
            maxKey = key
        }
    }

    return maxKey
}

fun main(){
    println(task8(grades = mapOf("Ana" to listOf(4.0, 4.5, 5.0), "John" to listOf(5.0, 5.0, 3.0), "Lise" to listOf(5.0, 5.0, 5.0 ))))
}