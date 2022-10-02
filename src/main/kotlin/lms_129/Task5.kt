package lms_129

fun task5(sentence: String): Int {

    var result = 0
    for (i in " $sentence ") {
        result = sentence.length

    }
    return result
}
fun main(){
    print( task5( sentence = "I Love GBG"))
}
