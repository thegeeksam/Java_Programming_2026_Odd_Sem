package A_JAVA_FDP.Day1;
// package 0.JAVA_FDP;

//savings account

class SavingsAccount {

    private String accountNumber;
    public static String accountHolderName;
    private double balance;
    private int interestRate;

    public String getaccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getbalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getinterestrate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;

    }
}
// current account

class CurrentAccount extends SavingsAccount {

    private String cAccountNumber;
    public String cAccountHolderName;
    private double cBalance;

    public String getcAccountNumber() {
        return cAccountNumber;
    }

    public void setcAccountNumber(String cAccountNumber) {
        this.cAccountNumber = cAccountNumber;
    }

    public String getcAccountHolderName() {
        return SavingsAccount.accountHolderName;
    }

    public void setcAccountHolderName(String cAccountHolderName) {
        this.cAccountHolderName = SavingsAccount.accountHolderName;
    }

    public double getcBalance() {
        return cBalance;
    }

    public void setcBalance(double cBalance) {
        this.cBalance = cBalance;
    }

}

public class Bank {

    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.setAccountNumber("SA123");
        savingsAccount.setAccountHolderName("sam");
        savingsAccount.setBalance(1000.0);
        savingsAccount.setInterestRate(5);

        CurrentAccount currentAccount = new CurrentAccount();
        // CurrentAccount cs = new SavingsAccount();
        SavingsAccount sc = new CurrentAccount();
        currentAccount.setcAccountNumber("CA123");
        // currentAccount.setcAccountHolderName("sam");
        currentAccount.setcBalance(2000.0);

        System.out.println("Savings Account Number: " + savingsAccount.getaccountNumber());
        System.out.println("Savings Account Holder: " + savingsAccount.getAccountHolderName());
        System.out.println("Savings Account Balance: " + savingsAccount.getbalance());
        System.out.println("Savings Account Interest Rate: " + savingsAccount.getinterestrate() + "%");
        System.out.println("Current Account Number: " + currentAccount.getcAccountNumber());
        System.out.println("Current Account Holder: " + sc.getAccountHolderName());
        System.out.println("Current Account Balance: " + currentAccount.getcBalance());

    }
}
// }