package lms_129


    fun task4(): Int {
        var result = 0
        for(number in 1..1000){
            if (number % 9 == 0)
                result += number
        }
        return result
    }
    fun main (){
        println(task4())
}
