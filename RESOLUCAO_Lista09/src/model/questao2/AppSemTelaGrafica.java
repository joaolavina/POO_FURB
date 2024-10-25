package model.questao2;

import java.util.Scanner;

public class AppSemTelaGrafica {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int altura;
        
        while (true) {
            try {
                altura = Integer.parseInt(teclado.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("A altura informada é incorreta. Digite novamente");
            }
        }
        int comprimento = Integer.parseInt(teclado.nextLine());
        
        Retangulo r = new Retangulo();
        r.setAltura(altura);
        r.setComprimento(comprimento);
        System.out.println(r.calcularArea());
    }

}
