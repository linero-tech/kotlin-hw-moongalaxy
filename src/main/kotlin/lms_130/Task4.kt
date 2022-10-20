package lms_130

fun task4(items: List<Int>, factor: Int): List<Int> {

val result = mutableSetOf<Int>()

for (number in items){
    if (number % factor == 0 && number !in result){

        result.add(number)

    }
}

return result.toList()
}

fun main (){
    println(  task4(factor = 2, items = listOf(1, 2, 3, 4, 5, 6)))
}


