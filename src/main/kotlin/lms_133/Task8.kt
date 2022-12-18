package lms_133

fun vowels(sentence: String): Int {
    val vowelsValues = mapOf('a' to 5, 'e' to 4, 'i' to 3, 'o' to 2, 'u' to 1)
    var result = 0
    sentence.lowercase().forEach { letter ->
        if (letter in vowelsValues) result += vowelsValues.getValue(letter)

    }
    return result
}
fun main (){
    println(vowels("I love Kotlin"))
}