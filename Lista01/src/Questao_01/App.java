package Questao_01;

public class App {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        
        pessoa.peso = 78;
        pessoa.altura = 1.75;
        
        double imc = pessoa.calcularImc();
        System.out.println(imc);
    }
}
