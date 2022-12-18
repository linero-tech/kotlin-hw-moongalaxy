package lms_133

fun groceries(stock: List<Map<String, Any>> = listOf(mapOf("product" to "", "quantity" to 0, "price" to 0.0))): Double {

    var result = 0.0

    stock.forEach { item ->
        val quantity = item["quantity"].toString()
        val price = item["price"].toString()
        val itemPrice = quantity.toDouble() * price.toDouble()
        result += itemPrice
    }

    return result
}

fun main() {
    println(groceries(listOf(
        mapOf(
            "product" to "Milk",
            "quantity" to 3,
            "price" to 1.50
        ),
        mapOf(
            "product" to "Meat",
            "quantity" to 3,
            "price" to 2.50
        )
    )))
}
