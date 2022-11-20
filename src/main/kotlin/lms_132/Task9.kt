package lms_132

fun task9(identification: String?): Boolean {

    var result = false

    if (identification != null
        && identification.length == 13

        && identification.substring(0, 4).toInt() >= 1947

        && identification.substring(4, 6).toInt() <= 12

        && identification.substring(6, 8).toInt() <= 31


    ) {
        result = true

    }


    return result
}

fun main() {
    println(task9(identification = "  "))
}
