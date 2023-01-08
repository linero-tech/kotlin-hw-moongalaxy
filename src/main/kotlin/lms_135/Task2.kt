package lms_135
class Account(var balance: Double) {

    fun deposit(deposit: Double) {
        balance += deposit
    }

    fun withdrawal(amount: Double) {
        if (balance >= amount) {
            balance -= amount
        }
    }

    fun fee(): Double {
        balance *= 0.95

        return balance
    }

}
fun main (){
    val seb = Account(100.00)
}