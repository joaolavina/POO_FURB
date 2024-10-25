package model.questao1;

public class PrevidenciaPrivada extends Investimento {
    
    private double saldo;
    private double valorPadraoInvestimento;
    
    public double getValorPadraoInvestimento() {
        return valorPadraoInvestimento;
    }

    public void setValorPadraoInvestimento(double valorPadraoInvestimento) {
        this.valorPadraoInvestimento = valorPadraoInvestimento;
    }

    public void investir() {
       investir( getValorPadraoInvestimento() );
    }
    
    public void investir(double valor) {
        setSaldo( getSaldo() + valor );
    }

    @Override
    public double calcularValorDesembolsar() {
        return getValorPadraoInvestimento();
    }
}
