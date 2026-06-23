/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * Lab3 - Demonstrating Bank Account Operations
 * *
 * * This Java snippet illustrates:
 * * - Creating a SavingsAccount class that extends BankAccount
 * * - Implementing deposit, withdraw, and getBalance methods
 * * - Using Scanner for user input to perform operations on the account
 * *
 * @package Z_Lab.Lab3;
 * @author Dr. S. Sampath Kumar
 * @since 21-08-2025
 * @version 1.0
 */

package Z_Lab.Lab3;

import java.util.Scanner;

public class Lab3 {
    static {
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();

        System.out.print("Enter account number: ");
        String accNo = sc.nextLine();

        SavingsAccount account = new SavingsAccount(name, accNo);

        System.out.print("Enter deposit amount: ");
        double deposit = sc.nextDouble();
        account.deposit(deposit);

        System.out.print("Enter withdrawal amount: ");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);

        System.out.println("Current Balance: Rs." + account.getBalance());
    }
}