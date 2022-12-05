package lms_133

fun fizzBuzzFoo(number: Int): String {
    val fizz = number % 3 == 0
    val buzz = number % 5 == 0
    return if (fizz && buzz) "FizzBuzz"
    else if (buzz) "Buzz"
    else if (fizz) "Fizz"
    else "Foo"
}