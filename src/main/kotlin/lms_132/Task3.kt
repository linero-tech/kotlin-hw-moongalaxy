package lms_132

fun task3(sentence: String?): String {

    return if (sentence.isNullOrEmpty()) "*"
    else sentence.replace(Regex("[aeiouAEIOU]"), "*")
}

fun main() {
    println(task3(sentence = "*"))
}
