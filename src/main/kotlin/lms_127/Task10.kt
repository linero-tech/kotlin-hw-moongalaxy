package lms_127

fun task10_1(assessments: String): Int {
val result = assessments.length
    println(result)
    return result
}

fun task10_2(assessments: String): Char {
val result = assessments[3]
    val string = "MUNA"
    val index = 3
    string[index]
    println("The result is A")
    return result
}

fun task10_3(assessments: String): Char {
    val indexhalfassessments = assessments.length/2
    val result=assessments[indexhalfassessments]
    println(result)
    return result
}

fun task10_4(assessments: String): String {
val result = assessments.substring(0,3)
    println(result)
    return result
}
fun main(){
    task10_1(assessments = "LMHHF")
    task10_2(assessments = "LMFHMF")
    task10_3(assessments = "LMFHM")
    task10_4(assessments = "LMFHM")
}