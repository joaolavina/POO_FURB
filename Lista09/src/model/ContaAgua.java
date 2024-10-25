package model;

public class ContaAgua extends Despesa{
    
    private int metrosCubicos;
    private double precoMetroCubico;
    
    public ContaAgua(int metrosCubicos, double precoMetroCubico){
        this.metrosCubicos = metrosCubicos;
        this.precoMetroCubico = precoMetroCubico;
    }

    @Override
    public double calcularValorDesembolsar(){
        return metrosCubicos * precoMetroCubico;
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
    
    
}
