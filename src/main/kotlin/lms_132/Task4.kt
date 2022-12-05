package lms_132

import java.util.*

fun task4(sentence: String?): Map<Char, Int> {
    val result = mutableMapOf('a' to 0, 'e' to 0, 'i' to 0, 'o' to 0, 'u' to 0)
    if (sentence.isNullOrEmpty()) result.clear()
    else {
        sentence.lowercase(Locale.getDefault()).forEach { letter ->
            result.forEach { key, value ->
                if (key == letter) result.put(key, value + 1)
            }
        }
    }
    return result.toSortedMap()
}
fun main() {
    println(task4(sentence = null))
}