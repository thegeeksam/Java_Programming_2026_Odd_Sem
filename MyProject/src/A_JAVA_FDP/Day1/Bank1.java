package A_JAVA_FDP.Day1;

/* You are required to build a Bank Management System using Java Object-Oriented Programming concepts. The system should allow the creation and handling of two types of bank accounts: Savings Account and Current Account. The system must also manage basic customer information.
Your implementation must strictly demonstrate all four major OOPs principles:
•	Encapsulation
•	Abstraction
•	Inheritance
•	Polymorphism

Sample Input and output:


Enter Customer Name: Pavithra
Enter Customer ID: C001
Enter Email: pavithra@gmail.com
Choose Account Type (1. Savings  2. Current): 1
Enter Account Number: SA101
Enter amount to deposit: 6000
Deposited ₹6000.0 into Savings Account.
Enter amount to withdraw: 2000
Withdrawn ₹2000.0 from Savings Account.

--- Savings Account Details ---
Customer Name: Pavithra
Account Number: SA101
Balance: ₹4000.0
Interest Rate: 5.0%
 */

public class Bank1 {
    public static void main(String[] args) {
        // Create a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.setAccountNumber("SA101");
        savingsAccount.setAccountHolderName("Pavithra");
        savingsAccount.setBalance(6000.0);
        savingsAccount.setInterestRate(5.0);

        // Deposit money into the savings account
        double depositAmount = 6000.0;
        savingsAccount.deposit(depositAmount);
        System.out.println("Deposited ₹" + depositAmount + " into Savings Account.");

        // Withdraw money from the savings account
        double withdrawAmount = 2000.0;
        savingsAccount.withdraw(withdrawAmount);
        System.out.println("Withdrawn ₹" + withdrawAmount + " from Savings Account.");

        // Display account details
        System.out.println("\n--- Savings Account Details ---");
        System.out.println("Customer Name: " + savingsAccount.getAccountHolderName());
        System.out.println("Account Number: " + savingsAccount.getaccountNumber());
        System.out.println("Balance: ₹" + savingsAccount.getbalance());
        System.out.println("Interest Rate: " + savingsAccount.getinterestrate() + "%");
    }
}