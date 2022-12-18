package lms_133

fun censorship(sentence: String): String{
    val listOfWords = sentence.split(" ")
    val result = mutableListOf<String>()

    listOfWords.forEach{ word ->
        result += if (word.replace(Regex("[.,;:]"), "").length> 4) {
            word.replace(Regex("\\w"), "*")
        }else{
            word
        }
    }

    return result.joinToString (separator = " ")

}

fun main(){
    println(censorship(sentence = "I live in Sweden"))
    println(censorship(sentence = "abc abcd abcdef"))
    println(censorship(sentence = "abc abcdef abcd"))
    println(censorship(sentence = "abc xyz"))
    println(censorship(sentence = ""))
}
