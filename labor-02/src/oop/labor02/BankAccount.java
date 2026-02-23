package oop.labor02;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String anumber) {
        this.accountNumber = anumber;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount > this.balance) {
            return false;
        } else {
            this.balance -= amount;
            return true;
        }
    }
}