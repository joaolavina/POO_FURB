package model.questao1;

public class ContaAgua extends Despesa {
    
    private int metrosCubicos;
    private double precoMetroCubico;

    @Override
    public double calcularValorDesembolsar() {
        return getPrecoMetroCubico() * getPrecoMetroCubico();
    }

    public int getMetrosCubicos() {
        return metrosCubicos;
    }

    public void setMetrosCubicos(int metrosCubicos) {
        this.metrosCubicos = metrosCubicos;
    }

    public double getPrecoMetroCubico() {
        return precoMetroCubico;
    }

    public void setPrecoMetroCubico(double precoMetroCubico) {
        this.precoMetroCubico = precoMetroCubico;
    }
    
    public ContaAgua(int metrosCubicos, double precoMetroCubico) {
        setMetrosCubicos(metrosCubicos);
        setPrecoMetroCubico(precoMetroCubico);
    }
    
}
