package lms_131

fun task13(sentence: String): String {

    val words = sentence.toLowerCase().split("\\W+|\\s+".toRegex())
    val counting = words.groupingBy { it }.eachCount()

    var result = ""
    var maxValue = 0
    for ((key, value) in counting.entries) {
        if (value > maxValue) {
            maxValue = value
            result = key
        }
    }

    return result
}
fun main(){
    println(task13("this this THIS is still the very very same"))
}