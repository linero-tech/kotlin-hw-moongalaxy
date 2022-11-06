package lms_131

fun task14(sentence: String): Char {

    val result: Char
    val dictionary = mutableMapOf<Char, Int>()
    val cleanedSentence = sentence.lowercase().replace(Regex("[.,;]"),"").replace(" ", "")

    cleanedSentence.forEach{letter ->
        if (letter in dictionary.keys) {
            val currentScore = dictionary[letter]!!
            val newScore = currentScore + 1
            dictionary[letter] = newScore
        } else {
            dictionary[letter] = 1
        }

    }

    var maxKey = cleanedSentence[0]
    var maxValue = 0
    for ((key, value) in dictionary.entries) {
        if (value > maxValue) {
            maxValue = value
            maxKey = key
        }
    }

    result = maxKey
    return result
}

fun main(){
    println(task14(sentence = "I am it"))
}
