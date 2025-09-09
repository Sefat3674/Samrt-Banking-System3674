package services
import models.BankAccount

class BankingService {
    private val accounts = mutableListOf<BankAccount>()

    fun addAccount(account: BankAccount) {
        accounts.add(account)
    }

    fun findAccount(accountNumber: Int): BankAccount? {
        return accounts.find { it.accountNumber == accountNumber }
    }

    fun printAccounts() {
        println("All Accounts:")
        accounts.forEach { acc ->
            println("${acc.accountNumber} - ${acc.holderName} - Balance: ${acc.getBalance()}")
        }
    }
}
