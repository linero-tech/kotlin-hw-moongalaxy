package lms_133
    fun remover(sentence: String): String = sentence.replace(Regex("[aeiouAEIOU]"), "")
    fun main() {
        println(remover(sentence = "Sweden is nice"))
    }