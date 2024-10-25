package Questão_03;

public class Pessoa {
    double altura;
    double peso;
    
    double calcularImc(){
        return peso/(altura*altura);
    }
}
