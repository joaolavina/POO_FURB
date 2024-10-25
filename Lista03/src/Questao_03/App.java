package Questao_03;

import java.util.Scanner;

/**
 *
 * @author jg_la
 */
public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();
                
        System.out.println("Digite a altura: ");
        retangulo.setAltura(Integer.parseInt(input.nextLine()));
        System.out.println("Digite o comprimento: ");
        retangulo.setComprimento(Integer.parseInt(input.nextLine()));
        
        System.out.println("�rea: "+retangulo.calcularArea(retangulo.getComprimento(), retangulo.getAltura()));
        System.out.println("Per�metro: "+retangulo.calcularPerimetro(retangulo.getComprimento(), retangulo.getAltura()));
    }
}
