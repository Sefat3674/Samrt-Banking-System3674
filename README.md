🏦 Kotlin Bank Account System

A simple Object-Oriented Programming (OOP) project in Kotlin that simulates a basic banking system. This project demonstrates core OOP concepts such as encapsulation, inheritance, polymorphism, and abstraction.

✅ Features

BankAccount (Abstract Class): Base class for all account types.

SavingsAccount (Subclass): Supports interest calculation and deposits/withdrawals.

Deposit and Withdraw: Allows adding or removing funds safely.

Interest Calculation: Add interest to savings accounts.

Encapsulation: Balance is private and accessible via getter.

Polymorphism: Methods can be overridden for custom behavior.

Abstraction: Users interact with accounts without worrying about internal logic.

🛠️ OOP Concepts Demonstrated
Concept	Kotlin Feature Example	Scenario
Class/Object	SavingsAccount / account	Blueprint (class) vs instance (object)
Encapsulation	private var balance + getBalance()	Protect balance from direct access
Inheritance	class SavingsAccount : BankAccount	SavingsAccount inherits BankAccount features
Polymorphism	open fun deposit()	Methods behave differently in subclasses
Abstraction	abstract class BankAccount	Hide internal implementation
Constructor	SavingsAccount(...)	Initialize object with required properties
Access Modifier	private, public	Control visibility of data
Overriding	override fun deposit()	Customize parent method in child class
🏗️ Project Structure
src/
 ├─ models/
 │   ├─ BankAccount.kt
 │   └─ SavingsAccount.kt
 └─ Main.kt


models/ → Contains Kotlin classes for bank accounts

Main.kt → Example usage and testing of accounts

⚡ Example Usage
fun main() {
    val account = SavingsAccount(1001, "John Doe", 1000.0, 5.0)

    println("Initial Balance: ${account.getBalance()}")
    account.deposit(500.0)
    account.withdraw(200.0)
    account.addInterest()
}


Output:

Initial Balance: 1000.0
Deposited $500.0. New balance: $1500.0
Withdrawn $200.0. New balance: $1300.0
Deposited $65.0. New balance: $1365.0
Interest added: $65.0

📌 Key Concepts

Encapsulation: Keeps data safe (balance is private).

Inheritance: Allows code reuse and hierarchy (SavingsAccount extends BankAccount).

Polymorphism: Methods like deposit() can be overridden.

Abstraction: Users interact via methods without knowing the implementation.

🧪 Future Improvements

Add more account types: CurrentAccount, FixedDepositAccount.

Implement interface for tax or loanable accounts.

Add transaction history tracking.

Add JUnit tests for automated testing.

📂 Getting Started

Clone the repository

git clone https://github.com/your-username/kotlin-bank-system.git


Navigate to project folder

cd kotlin-bank-system


Compile and run

kotlinc src/models/*.kt src/Main.kt -include-runtime -d BankSystem.jar
java -jar BankSystem.jar

📄 License

This project is MIT Licensed – feel free to use and modify.
