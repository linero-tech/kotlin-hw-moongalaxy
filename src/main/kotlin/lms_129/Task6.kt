package lms_129

fun task6(number: Int): Int {

    var result = 0
    var n = number

    while ( n > 0) {
        result  = result * 10 + n % 10
        n /=10
    }
    return result
}
fun main (){
    println( task6( number = 876))
}