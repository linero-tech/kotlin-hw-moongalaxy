package lms_133

fun counter(word: String): Boolean {
    val alphabet = listOf('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','x',
        'y','z')
    var indexSum = 0
    word.lowercase().forEach {letter ->
        if (letter in alphabet) {
            val index = alphabet.indexOf(letter)+1
            indexSum += index
        }

    }
    return indexSum % 2 == 0
}

fun main() {
    println(counter("a a"))
}
