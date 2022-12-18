package lms_133

fun counter(sentence: String): Boolean {

    val listLetter = listOf('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
        'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z')
    var positionSum = 0

    sentence.forEach { character ->
        val lowercaseCharacter = character.lowercaseChar()
        if (lowercaseCharacter in listLetter) {
            positionSum += listLetter.indexOf(lowercaseCharacter) + 1
        }
    }

    return positionSum % 2 == 0
}

fun main() {
    println(counter("alexa"))
}