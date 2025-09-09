import models.SavingsAccount
import services.BankingService

fun main() {
    val service = BankingService()

    val acc1 = SavingsAccount(1001, "John Doe", 500.0, 5.0)
    val acc2 = SavingsAccount(1002, "Jane Smith", 1000.0, 3.0)

    service.addAccount(acc1)
    service.addAccount(acc2)

    acc1.deposit(200.0)
    acc2.withdraw(150.0)
    acc1.addInterest()

    service.printAccounts()  // ✅ should now work
}
