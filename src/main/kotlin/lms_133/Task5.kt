package lms_133

fun groceries(groceryList: List<Map<String, Any>>): Double {
    var result = 0.0
    if(groceryList.isEmpty()) {
        result
    }else{
        groceryList.forEach  { input ->
            val input1 = input.getValue("quantity")
            val input2 = input.getValue("price")
            result = input1 as Int * input2 as Double
        }
    }
    return result
}

fun main(){
    println(groceries(groceryList =
    listOf(mapOf("product" to "milk", "quantity" to 1, "price" to 1.50))))
}
