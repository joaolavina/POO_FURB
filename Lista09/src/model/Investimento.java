package model;

public abstract class Investimento implements Desembonsavel{
    
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
