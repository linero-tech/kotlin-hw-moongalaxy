package lms_132

fun task5(word: String?): Boolean {

        var result = false
        val duplicateLetter = mutableListOf<Char>()
        if (word.isNullOrEmpty()) {
            result = false
        } else {
            word.toLowerCase().forEach { letter ->
                if (letter in word) {
                    result = false
                } else {
                    if (letter !in duplicateLetter) {
                        result = true
                    }
                }
            }
        }
        return result
    }
    fun main() {
        println(task5(word = "isogram"))

}
