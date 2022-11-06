package lms_131

fun task15(sentence: String): Map<Char, Int> {

    val result = mutableMapOf<Char, Int>()
    val cleanSentence = sentence.lowercase().replace(Regex("[,;.:]"), "")
    val listWords = cleanSentence.split(" ")

    listWords.forEach { word ->
        val firstLetter = word[0]
        result[firstLetter] = result.getOrDefault(firstLetter, 0) + 1
    }

    return result
}

fun main() {
    println(task15("This is the Very small Text"))
}

