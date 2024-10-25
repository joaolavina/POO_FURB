package Questao_02;

public class Pessoa {
    double altura;
    double peso;
    
    double calcularImc(){
        return peso/(altura*altura);
    }
}
