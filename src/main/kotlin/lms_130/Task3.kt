package lms_130

fun task3(items: List<Int>): List<Int> {
    val result= listOf<Int>()

    val duplicateitems = mutableListOf<Int>()
    val uniquelistOfItem = mutableListOf<Int>()

    for (number in items) {
        if (number in uniquelistOfItem) {
            duplicateitems.add(number)
        }else {
            uniquelistOfItem
        }
    }

    return result
}
fun main (){
    println(task3(items = listOf(1, 1, 1, 2, 2, 3)) )
}
