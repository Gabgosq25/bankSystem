package bankAccount;

public class BankAccount {

    private String accountName;
    private final int accountNumber;
    private double accountBalance;

    public BankAccount(String accountName, int accountNumber) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
    }
    public BankAccount(String accountName, int accountNumber, double accountBalance) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public void deposit(double amount) {
        if (amount >= 0) {
            this.accountBalance += amount;
        }

    }

    public void withdraw(double amount) {
        this.accountBalance -= (amount + 5.00);
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountName() {
        return accountName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

}
