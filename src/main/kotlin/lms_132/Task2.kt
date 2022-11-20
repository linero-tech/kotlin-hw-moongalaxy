package lms_132

fun task2(items: List<Int?>?): Int {

        var result = 0
        items?.forEach { item ->
            if (item == null) result += 1
        }
        return result
    }
    fun main (){
        println(task2(items = listOf( null, 1 , 2 ,null,3)))
    }