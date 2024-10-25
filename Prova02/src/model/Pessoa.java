package model;

public class Pessoa implements Pesavel {

    private String nome;
    private double peso;

    public Pessoa(String nome, double peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("Valor do peso inválido");
        } else {
            this.nome = nome;
            this.peso = peso;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public double getPeso() {
        return peso;
    }

    @Override
    public void setPeso(double peso) {
        this.peso = peso;
    }
}
