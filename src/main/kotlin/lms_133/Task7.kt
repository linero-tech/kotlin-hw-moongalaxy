package lms_133

fun censorship(input: String): String {
    var result = ""
    var foo = ""
    var listOfWords = input.split(' ')
    listOfWords.forEach { word ->
        if (word.length > 4) {
            for (i in word) foo += "*"
            result += input.replace(word, foo)
        }
    }
    return result
}


fun main() {
    println(censorship(input = "I what in whatever"))
}