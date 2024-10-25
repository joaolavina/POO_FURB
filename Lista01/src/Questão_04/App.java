package Questão_04;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Pessoa[] pessoas = new Pessoa[3];
        
        for(int i=0; i<3; i++){
            Pessoa pessoa = new Pessoa();
            
            pessoas[i]= pessoa;
            pessoa.nome = input.nextLine();
            pessoa.peso = Double.parseDouble(input.nextLine());
            pessoa.altura = Double.parseDouble(input.nextLine());
            
        }
        
        for(int i=3; i>0; i--){
            System.out.println(pessoas[i-1].nome);
            System.out.println(pessoas[i-1].peso);
            System.out.println(pessoas[i-1].altura);
            System.out.println(pessoas[i-1].calcularImc());
        }
        
        input.close();
    }
}
