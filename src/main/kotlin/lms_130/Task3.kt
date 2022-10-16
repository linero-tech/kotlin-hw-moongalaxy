package lms_130

fun task3(items: List<Int>): List<Int> {
    val result= listOf<Int>()
    val mylist = listOf(1, 1, 1, 2, 2, 3)
    println(mylist)

    val duplicateitems = mutableListOf<Int>()
    val uniquelistOfItem = mutableListOf<Int>()
/*
    println("the duplicate items are $duplicateitems")

*/
    val setOfValues = mylist.toSet()
    println("The original list as a set = $setOfValues")
    println("The duplicate ")
    
    return result
}
fun main (){
    println(task3(items = listOf()) )
}
