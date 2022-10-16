package lms_130

fun task2(items: List<Int>): Int {


    var result = 0
    for (number in items.indices){
        var list = items[number]
        if (number % 2==0) {
            result += items[number]
        } else if (items.isEmpty()) result = 0
    }

    return result
}

fun main() {
    println(task2(items = listOf(1,2,3,4)))
}
