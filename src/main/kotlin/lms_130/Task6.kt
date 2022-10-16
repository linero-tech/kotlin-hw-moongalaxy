package lms_130

fun task6(sentence: String): String {
   val result = String
    val oldstring ="I like Gothenburg"

    var newstring = ""

    oldstring.forEachIndexed { index, letter ->
        newstring += if (index % 2 == 0){
          letter.toUpperCase()
        }else {
            letter
        }
    }
     println("The upper cased text = $newstring")
    return result.toString()

}
  fun main(){
      task6(sentence = "I like Gothenburg")
  }