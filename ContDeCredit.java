package com.company;
public class ContDeCredit extends ContBancar {
    private double sumaInitiala;
    private double plataLunara;

    public ContDeCredit(double sumaInitiala, double plataLunara) {
        this.sumaInitiala = sumaInitiala;
        this.plataLunara = plataLunara;
    }

    @Override
    public boolean withdraw(double amount) {
        if (getBalance() - amount >= -sumaInitiala) {
            return super.withdraw(amount);
        } else {
            System.out.println("Suma initiala depasita! Adaugata la plata lunara.");
            balance -= plataLunara;
            return false;
        }
    }
}