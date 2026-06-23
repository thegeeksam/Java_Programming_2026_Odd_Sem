package Z_Lab.Lab3;

public class SavingsAccount implements BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public SavingsAccount(String accountHolder, String accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        System.out.println("Account created for " + accountHolder + " (Account No: " + accountNumber + ")");
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs." + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: Rs." + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}