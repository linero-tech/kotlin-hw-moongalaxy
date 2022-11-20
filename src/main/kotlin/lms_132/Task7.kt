package lms_132

fun task7(sentence: String?): Map<String, Int> {

    val result = mutableMapOf<String, Int>("letters" to 0, "digits" to 0)

// check if the variable is empty or null!!!

    if (sentence.isNullOrEmpty()) {
        // add new entries in the result!!!

        result += mutableMapOf("letters" to 0, "digits" to 0)
    } else {
        val newSentence = sentence.replace(Regex("[ ,._;']"),"" )

        for (i in newSentence) {

            if (i.isLetter()) {
                result["letters"] = result.getOrDefault("letters", 0) + 1

            } else {
                result["digits"] = result.getOrDefault("digits", 0) + 1
            }
        }
    }

    return result
}

fun main() {
    println(task7(sentence = "1233,.."))
}
