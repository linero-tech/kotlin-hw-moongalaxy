package lms_130

fun task5(items: List<Int>): List<Int> {

    val result = mutableListOf<Int>()

    for (index in items.indices){

        var number = index * items.get(index)

        println("${index} * ${items[index]} = $number" )

        result.add(number)

    }

    return result
}
fun main (){
    println(task5(items = listOf(1, 5, 11)))
}
