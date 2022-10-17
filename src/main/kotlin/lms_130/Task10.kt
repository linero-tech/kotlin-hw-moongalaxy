package lms_130

fun task10(items: List<Int>): List<Int> {
    val result = mutableListOf<Int>()

    var number = 0

    for (i in items){
        if (i  % 2 == 0){
            number = i * 2
            result.add(number)

        }else{ i % 2 == 1
            number = i * 3

            result.add(number)

        }
    }

    return result

}
fun main(){
    println(task10(items = listOf(1, 2, 3, 4, 5 )))
}
