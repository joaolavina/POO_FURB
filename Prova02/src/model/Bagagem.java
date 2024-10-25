package model;

public class Bagagem implements Pesavel{
    private double peso;

    public Bagagem(double peso) {
        if(peso <= 0){
            throw new IllegalArgumentException("Valor do peso inválido");
        }
        else{
        this.peso = peso;
        }
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
