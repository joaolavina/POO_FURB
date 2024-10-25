package Questao_01;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Pessoa[] pessoas = new Pessoa[3];
        
        for(int i=0; i<3; i++){
            Pessoa pessoa = new Pessoa();
            
            pessoas[i]= pessoa;
            pessoa.setNome(input.nextLine());
            pessoa.setPeso(Double.parseDouble(input.nextLine()));
            pessoa.setAltura(Double.parseDouble(input.nextLine()));
            
        }
        
        for(int i=3; i>0; i--){
            System.out.println(pessoas[i-1].getNome());
            System.out.println(pessoas[i-1].getPeso());
            System.out.println(pessoas[i-1].getAltura());
            System.out.println(pessoas[i-1].calcularImc());
        }
        
        input.close();
    }
}
