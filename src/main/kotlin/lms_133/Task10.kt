package lms_133

fun tweet(input: String): String {
    var result = input
    while (result.length != 280) result += "@"
    return result
}
