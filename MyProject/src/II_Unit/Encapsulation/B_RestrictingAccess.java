/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * Data Hiding - Using private access modifier to restrict direct access
 * *
 * * This Java snippet illustrates:
 * * - Declaring a class BankAccount with a private variable dBalance
 * * - Demonstrating data hiding by restricting direct access to the variable
 * *
 * @package II_Unit.Encapsulation;
 * @author Dr. S. Sampath Kumar
 * @since 09-07-2026
 * @version 1.0
 */

package II_Unit.Encapsulation;

class BankAccount1 {
    private double dBalance = 10000.00;

    // Controlled methods
    public void deposit(double dAmount) {
        if (dAmount > 0) {
            dBalance += dAmount;
        }
    }

    public void withdraw(double dAmount) {
        if (dAmount > 0 && dAmount <= dBalance) {
            dBalance -= dAmount;
        }
    }

    public double getBalance() {
        return dBalance;
    }
}

public class B_RestrictingAccess {
    public static void main(String[] args) {
        BankAccount1 objAccount = new BankAccount1();
        objAccount.deposit(5000.00);
        System.out.println("Current Balance: " + objAccount.getBalance());

        // Direct modification is NOT possible because dBalance is 'private'
        // This would result in a compile-time error
        // The data is protected from uncontrolled access.
        // objAccount.dBalance = 1000000.00;
    }
}

/*
 * * Conclusion:
 * * - The BankAccount class encapsulates the balance and
 * * provides controlled access through methods.
 * * - Public balance → Anyone can modify → Unsafe ❌
 * * - Private balance → Controlled methods → Encapsulation ✅
 * *
 */