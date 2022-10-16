package lms_130

fun task7(items: List<Int>): Int {
    var result = 0
    result = if (items.isEmpty()){
        0
    }else
        items.first()
    for (number in items){
        if (number < result){
            result = number
        }
    }
    return result
}
fun main (){
    println(task7(items = listOf()))
}

