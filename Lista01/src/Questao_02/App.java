package Questao_02;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Scanner input = new Scanner(System.in);
        
        pessoa.peso = Double.parseDouble(input.nextLine());
        pessoa.altura = Double.parseDouble(input.nextLine());
        
        double imc = pessoa.calcularImc();
        System.out.println(imc);

        input.close();
    }
}
