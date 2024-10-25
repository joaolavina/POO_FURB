package model.figura;

public class Circulo extends Figura{
    
    private int raio;
    
    public Circulo(int raio){
        this.raio = raio;
    }
    
    @Override
    public double calcularArea(){
        return Math.PI*raio*raio;
    }
}
