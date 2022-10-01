package lms_129

fun task2(number: Int): Boolean {

    var result = true

    if (number < 2){
        result = false

    }else{

        for ( i in 2..number/2){
            if (number % i == 0){
                result = false
                break
            }
        }
    }
    return result
}
fun main () {
    println(task2( number = 17))
}
