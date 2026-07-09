/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * This Java snippet illustrates:
 * * - Defines a class BankAccount with a public variable
 * *   'dBalance' and a method checkBalance()
 * * - Demonstrates the need for encapsulation by showing how
 * *   direct access to the variable can lead to inconsistent states
 * *
 * @package II_Unit.Encapsulation;
 * @author Dr. S. Sampath Kumar
 * @since 09-07-2026
 * @version 1.0
 */

package II_Unit.Encapsulation;

class BankAccount {
    public double dBalance = 1000.00;

    public void checkBalance() {
        System.out.println("Balance: " + dBalance);
    }
}

public class A_NeedForEncapsulation {
    public static void main(String[] args) {
        BankAccount objAccount = new BankAccount();

        objAccount.checkBalance();
        // Direct modification is possible because dBalance is public
        objAccount.dBalance = 100000.00;
        objAccount.checkBalance();
    }
}