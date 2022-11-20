package lms_132

fun task8(items: List<String?>): List<String> {
    
        val result = mutableListOf<String>()
        items.forEach { item ->
            if (item !== null && item.length > 3) result += item
        }
        return result
    }

    fun main() {
        println(task8(items = listOf("Hello", "Gothenburg", null)))
    }
