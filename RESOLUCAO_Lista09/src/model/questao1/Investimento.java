package model.questao1;

public abstract class Investimento implements Desembolsavel {
    
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
