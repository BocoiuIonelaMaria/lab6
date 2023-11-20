package com.company;
}
public class ContBancar {
    public double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Fonduri insuficiente!");
            return false;
        }
    }

    public double getBalance() {
        return balance;
    }
}