package lms_132

fun task6(items: List<Int?>): List<Int?> {

        val result = mutableListOf<Int?>()
        items.forEachIndexed { index, item -> if (item != null) result += item * index
        else {
            result += null
        }
        }
        return result
    }
    fun main() {
        println(task6(items = listOf(1, 2, null)))
    }