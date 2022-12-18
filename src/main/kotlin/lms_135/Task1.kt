 package lms_135
 class Rectangle(
     private val base: Double,
     private val height: Double,
 ){
     fun area() = base * height

     fun perimeter(): Double = 2.0 * (base + height)
 }
 fun main() {
     val rect1 = Rectangle(base = 1.0, height = 1.0)
     println(rect1.area())
     println(rect1.perimeter())
 }