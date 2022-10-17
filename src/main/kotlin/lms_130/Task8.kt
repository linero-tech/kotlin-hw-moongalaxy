package lms_130

fun task8(items: List<Int>): List<Int> {

    var list = items.toSet()
    var sortedList = list.sorted()
    val result = sortedList.takeLast(3)






    return result
}

fun main(){
    println(task8(items = listOf(60, 9, 7, 10,20, 40, 120)))

}