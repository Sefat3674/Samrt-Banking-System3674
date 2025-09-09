package models

abstract class BankAccount(
    val accountNumber: Int,
    val holderName: String,
    private var balance: Double
) {
    fun getBalance() = balance

    open fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Deposited $$amount. New balance: $$balance")
        }
    }

    open fun withdraw(amount: Double): Boolean {
        return if (balance >= amount) {
            balance -= amount
            println("Withdrawn $$amount. New balance: $$balance")
            true
        } else {
            println("Insufficient balance")
            false
        }
    }
}

class SavingsAccount(
    accountNumber: Int,
    holderName: String,
    balance: Double,
    private val interestRate: Double
) : BankAccount(accountNumber, holderName, balance) {

    fun addInterest() {
        val interest = getBalance() * interestRate / 100
        deposit(interest)
        println("Interest added: $$interest")
    }
}
