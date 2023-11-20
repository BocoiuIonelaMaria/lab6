package com.company;
public class ContDeEconomii extends ContBancar {
    private double limita;

    public ContDeEconomii(double limita) {
        this.limita = limita;
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount <= getBalance() && amount <= limita) {
            return super.withdraw(amount);
        } else {
            System.out.println("Limita de retragere depasita sau fonduri insuficiente!");
            return false;
        }
    }
}
