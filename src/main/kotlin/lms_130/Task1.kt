package lms_130

fun task1(items: List<Int>): Int {
    /*    val result = 0
        val list = listOf(1, 2, 3, 4, 5)
        val randomElement = list.random()

        return result*/
    var result = 0 
    if (items.isNotEmpty()){
    val randomIndex= (0..items. lastIndex).random()
    result = items[randomIndex]
    }
    return result
    }
    fun main(){
    println(task1(listOf(1, 30, 50)))


}