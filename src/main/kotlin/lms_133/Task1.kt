package lms_133

fun remover (sentence: String):String{
    var result = ""
    sentence.forEach { letter ->
        if (letter.lowercaseChar()in listOf('a', 'e','i','o','u'))
            result += letter
    }
    return result
}
fun main (){
    println(remover("Hello"))
    println(remover("I live in sweden"))
}