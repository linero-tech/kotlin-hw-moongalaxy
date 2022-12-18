package lms_132

fun task9(identification: String?): Boolean {

    var result = false

    if (identification != null &&
        Regex("([0-9]{4})(1[0-2]|0[1-9])(3[01]|[12][0-9]|0[1-9])[\\-]([0-9]{4})$").containsMatchIn(identification) &&
        identification.substring(0, 4).toInt() >= 1947) {
        result = true
    }


    return result
}

fun main() {
    println(task9(identification = "19921131-1090"))

}
