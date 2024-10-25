package model;

public class Passageiro extends Pessoa{
    private String assento;

    public String getAssento() {
        return assento;
    }

    public void setAssento(String assento) {
        this.assento = assento;
    }

    public Passageiro(String assento, String nome, double peso) {
        super(nome, peso);
        this.assento = assento;
    }
} 
