package lms_132

fun task4(sentence: String?): Map<Char, Int> {

    val result = mutableMapOf<Char, Int>()
    val vowels = listOf('a', 'e', 'i', 'o', 'u')
    val newSentence = sentence?.toLowerCase()
    // if sentence is null = empty map
    if (sentence.isNullOrEmpty()) {
        result += result
    }else{
        newSentence?.forEach { letter ->
            if (letter in vowels ){
                result[letter] = result.getOrDefault(letter, 0) + 1
            }
        }
    }
    // Else count vowels in sentence
    // add vowels as key to a map and number of times they appear to value

    return result.toSortedMap()
}
fun main(){
    println(task4(sentence = "Hello"))
}
