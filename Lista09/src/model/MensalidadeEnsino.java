package model;

public class MensalidadeEnsino extends Despesa{
    
    private int nrCreditos;
    
    private double precoCredito;
    
    public MensalidadeEnsino(int nrCreditos, double precoCredito){
        this.nrCreditos = nrCreditos;
        this.precoCredito = precoCredito;
    }
    
    public int getNrCreditos() {
        return nrCreditos;
    }

    public void setNrCreditos(int nrCreditos) {
        this.nrCreditos = nrCreditos;
    }

    public double getPrecoCredito() {
        return precoCredito;
    }

    public void setPrecoCredito(int precoCredito) {
        this.precoCredito = precoCredito;
    }
    
    @Override
    public double calcularValorDesembolsar(){
        return nrCreditos * precoCredito;
    }
    
}
