package lms_131

fun task7(words: List<String>): Map<Int, String> {
    val result = mutableMapOf<Int, String>()
    words.forEachIndexed{index, word -> result[index] = word }

    return result
}