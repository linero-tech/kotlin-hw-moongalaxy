package lms_132

fun task1(sentence: String?): Int {


        return sentence?.length ?: 0
    }

    fun main() {
        println(task1(sentence = null))
    }
