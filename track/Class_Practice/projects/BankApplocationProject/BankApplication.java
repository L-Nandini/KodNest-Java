package track.Class_Practice.projects.BankApplocationProject;

import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException();
        } else {
            balance += amount;
        }
    }

    public void withdraw(double amount) throws InvalidAmountException, InsufficientBalanceException {
        if (amount <= 0) {
            throw new InvalidAmountException();
        } else if (amount > balance) {
            throw new InsufficientBalanceException();
        } else {
            balance -= amount;
        }
    }

    public void display() {
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Your account Number: " + accountNumber);
    }

    public double getBalance() {
        return balance;
    }

}

class InsufficientBalanceException extends Exception {

    InsufficientBalanceException() {
        super("Insufficient Balance");
    }
}

class InvalidAmountException extends Exception {
    InvalidAmountException() {
        super("Invalid Amount");
    }
}

public class BankApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account holder name :");
        String accountHolderName = sc.nextLine();
        System.out.println("Enter account Number :");
        String accountNumber = sc.nextLine();
        System.out.println("Enter account balance :");
        double balance = sc.nextDouble();
        int n = sc.nextInt();

        BankAccount b = new BankAccount(accountNumber, accountHolderName, balance);

        switch (n) {
            case 1:
                double amount = sc.nextDouble();
                b.display();
                try {
                    b.deposit(amount);
                } catch (InvalidAmountException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 2:
                double withdrawAmount = sc.nextDouble();
                b.display();
                try {
                    b.withdraw(withdrawAmount);
                    System.out.println("Withdrawal successful");
                } catch (InvalidAmountException | InsufficientBalanceException e) {
                    System.out.println(e.getMessage());
                }
                break;
            // default:
            // System.out.println("InValid Choice");
        }
        System.out.println("Your account Balance: " + b.getBalance());
        System.out.println("Transaction Completed");
        sc.close();

    }
}