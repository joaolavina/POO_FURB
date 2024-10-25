package model;

public class PrevidenciaPrivada extends Investimento {
    
    private double valorPadraoInvestimento;
    private double saldo;

    @Override
    public double getSaldo(){
        return saldo;
    }
    
    public double getValorPadraoInvestimento() {
        return valorPadraoInvestimento;
    }

    public void setValorPadraoInvestimento(double valorPadraoInvestimento) {
        this.valorPadraoInvestimento = valorPadraoInvestimento;
    }

    public void investir(){
        setSaldo(getSaldo() + valorPadraoInvestimento);
    }
    
    public void investir(double valor){
        setSaldo(getSaldo() + valor);
    }
    
    @Override
    public double calcularValorDesembolsar(){
        return saldo;
    }
}
