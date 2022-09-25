package lms_127

fun task5(valueForA: Int, valueForB: Int): Pair<Int, Int> {
    // Do not change or delete these variables
    var a = valueForA
    var b = valueForB
    a = b.also { b = a }
    print("a is ")
    println(a)
    print("b is ")
    println(b)

    // Do not erase or change this statement
    return Pair(a, b)
}
fun main(){
    task5(valueForA = 1 , valueForB = 2)
}