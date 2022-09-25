package lms_127

fun task9(sentence: String, character: Char): Boolean {
val result=sentence.contains(character, ignoreCase = true)
    println(result)
    return result
}
fun main(){
    task9(sentence = "I code In KOTLIN" , character = 'i')
}