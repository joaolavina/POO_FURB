package model;

public class Aviao {
    private String modelo;
    private int numeroAssentos;
    private double pesoMaximo;

    public Aviao(String modelo, int numeroAssentos, double pesoMaximo) {
        this.modelo = modelo;
        this.numeroAssentos = numeroAssentos;
        this.pesoMaximo = pesoMaximo;
    }

    public String getModelo() {
        return modelo;
    }

    public int getNumeroAssentos() {
        return numeroAssentos;
    }

    public double getPesoMaximo() {
        return pesoMaximo;
    }
    
    
}
