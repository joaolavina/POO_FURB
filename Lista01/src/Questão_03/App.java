package Questão_03;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Scanner input = new Scanner(System.in);
        
        for(int i=0; i<3; i++){
            pessoa.peso = Double.parseDouble(input.nextLine());
            pessoa.altura = Double.parseDouble(input.nextLine());

            double imc = pessoa.calcularImc();
            System.out.println(imc);
        }
    }
}
