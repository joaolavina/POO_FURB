package model.questao1;

public class MensalidadeEnsino extends Despesa {
    
    private int nrCreditos;
    private double precoCredito;

    public int getNrCreditos() {
        return nrCreditos;
    }

    public void setNrCreditos(int nrCreditos) {
        this.nrCreditos = nrCreditos;
    }

    public double getPrecoCredito() {
        return precoCredito;
    }

    public void setPrecoCredito(double precoCredito) {
        this.precoCredito = precoCredito;
    }
    

    @Override
    public double calcularValorDesembolsar() {
        return getNrCreditos() * getPrecoCredito();
    }

    public MensalidadeEnsino(int nrCreditos, double precoCredito) {
        setNrCreditos(nrCreditos);
        setPrecoCredito(precoCredito);
    }
    
    
}
