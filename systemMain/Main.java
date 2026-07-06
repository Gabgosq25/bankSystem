package systemMain;

import java.util.Locale;
import bankAccount.BankAccount;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insert your name: ");
        String accountName = sc.nextLine();
        System.out.print("Please insert your account number: ");
        int accountNumber = sc.nextInt();
        BankAccount account;
        System.out.print("Do you want to deposit money? (yes/no): ");
        String depositChoice = sc.next();
        if (depositChoice.equalsIgnoreCase("yes")) {
            System.out.print("Please insert the amount to deposit: ");
            double depositAmount = sc.nextDouble();
            account = new BankAccount(accountName, accountNumber, depositAmount);
            System.out.printf("Deposit successful! Your new balance is: %.2f%n ", account.getAccountBalance());
        } else if (depositChoice.equalsIgnoreCase("no")) {
            account = new BankAccount(accountName, accountNumber);
            System.out.printf("No deposit made. Your current balance is: %.2f%n", account.getAccountBalance());
          
        } else {
            System.out.println("Invalid choice. Please enter 'yes' or 'no'.");
            account = new BankAccount(accountName, accountNumber);
        }
        

        System.out.println("Account created successfully!");
        System.out.println("Hello " + accountName + ", welcome to the bank!");
        System.out.println("Account Name: " + account.getAccountName());
        System.out.println("Account Number: " + account.getAccountNumber());

        String continueChoice;
        do {
            System.out.println("Do you want to continue? (yes/no): ");
            continueChoice = sc.next();
            if (continueChoice.equalsIgnoreCase("yes")) {
                System.out.printf("Account Number: %d, Account Name: %s, Balance: %.2f%n", account.getAccountNumber(),
                        account.getAccountName(), account.getAccountBalance());
                System.out.println("Option 1: Deposit");
                System.out.println("Option 2: Withdraw");
                System.out.print("Please select an option: ");
                int option = sc.nextInt();
                if (option == 1) {
                    System.out.print("Please insert the amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    System.out.printf("Deposit successful! Your new balance is: %.2f%n", account.getAccountBalance());
                } else if (option == 2) {
                    System.out.print("Please insert the amount to withdraw:");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    System.out.printf("Withdrawal successful! Your new balance is: %.2f%n",
                            account.getAccountBalance());
                }
            }
        } while (continueChoice.equalsIgnoreCase("yes"));

        System.out.println("Thank you for using our banking system. Goodbye!");

        sc.close();
    }
}
