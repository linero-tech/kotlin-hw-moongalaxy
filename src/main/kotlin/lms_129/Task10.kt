package lms_129



fun task10(password: String): Boolean {
    val result = true
    if (password.length < 6) return false
    else if (password.length > 10) return false
    if (password.firstOrNull { it.isDigit() } == null) return false
    if (password.filter { it.isLetter() }.firstOrNull { it.isUpperCase() } == null) return false
    if (password.filter { it.isLetter() }.firstOrNull { it.isLowerCase() } == null) return false
    if (password.firstOrNull { !it.isLetterOrDigit() } == null) return false
    return result
}

fun main(){
    println(task10("123456dD$7"))
}