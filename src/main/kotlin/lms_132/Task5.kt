package lms_132

fun task5(word: String?): Boolean {

    var result = false
    val newWord = word?.toLowerCase()
    val duplicateLetter = mutableListOf<Char>()
    // is word null or empty, result = false
    if (newWord.isNullOrEmpty()) {
        result = false
    } else {
        // go over the word
        newWord.forEach { letter ->
            // is there any duplicate letter? then false
            if (letter in newWord) {
                result = false
            }else{
                // is there any duplicates letter? then false
                if(letter !in duplicateLetter){
                    result = true
                }
            }
        }
    }
    // is there any duplicate letter? then false
    return result

}
fun main (){
    println(task5(word = "hola"))
}
