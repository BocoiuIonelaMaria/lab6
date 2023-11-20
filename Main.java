package com.company;
public class Main {
    public static void main(String[] args) {
        ContDeEconomii contEconomii = new ContDeEconomii(500);
        ContDeCredit contCredit = new ContDeCredit(1000, 200);

        contEconomii.deposit(600);
        contEconomii.withdraw(300);
        System.out.println("Sold economii: " + contEconomii.getBalance());

        contCredit.deposit(1200);
        contCredit.withdraw(800);
        System.out.println("Sold credit: " + contCredit.getBalance());
    }
}