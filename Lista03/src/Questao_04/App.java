package Questao_04;

import java.util.Scanner;

/**
 *
 * @author jg_la
 */
public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o comprimento e a altura");
        Retangulo retangulo = new Retangulo(Integer.parseInt(input.nextLine()), Integer.parseInt(input.nextLine()));
        
        System.out.println("Área: "+retangulo.calcularArea(retangulo.getComprimento(), retangulo.getAltura()));
        System.out.println("Perímetro: "+retangulo.calcularPerimetro(retangulo.getComprimento(), retangulo.getAltura()));
    }
}
