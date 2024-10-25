package Questao_01;

public class Pessoa {
    private String nome;
    private double altura;
    private double peso;
    
    public void setNome(String nomeRecebido){
        nome = nomeRecebido;
    }
    
    public void setAltura(double alturaRecebida){
        altura = alturaRecebida;
    }
    
    public void setPeso(double pesoRecebido){
        peso = pesoRecebido;
    }
    
    public String getNome(){
        return nome;
    }
    
    public double getAltura(){
        return altura;
    }
 
    public double getPeso(){
        return peso;
    }
    
    double calcularImc(){
        return peso/(altura*altura);
    }
}
