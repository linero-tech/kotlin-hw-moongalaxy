package lms_130

fun task9(items: List<Int>): List<Int> {
    val result = mutableListOf<Int>()
    for (index in items.indices){
        if (index == 0){
            result.add(items.get(0) * items.get(0))

        }else{
            result.add(items.get(index) * items.get(index -1) )

        }

    }


    return result
}
fun main (){
    println(task9(items = listOf(5,2,3,4)))
}
