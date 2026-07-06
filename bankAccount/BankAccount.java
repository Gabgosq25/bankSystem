package bankAccount;

public class BankAccount {

    private String accountName;
    private int accountNumber;
    private double accountBalance;

    public void deposit(double amount) {
        accountBalance += amount;
    }


    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
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
