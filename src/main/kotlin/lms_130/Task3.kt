package lms_130

fun task3(items: List<Int>): List<Int> {


    var result = mutableSetOf<Int>()
    val uniqueListOf = mutableListOf<Int>()
    for (number in items){
        if (number in uniqueListOf){
            result.add(number)
        }else{
            uniqueListOf.add(number)
        }

    }


    return result.toList()
}

fun main () {
    println( task3(items = listOf(1, 1, 1, 2, 2, 3 )))
}

