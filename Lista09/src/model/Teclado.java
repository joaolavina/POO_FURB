package model;

import java.util.Scanner;

public class Teclado {

    Scanner scanner;

    public Teclado() {
        scanner = new Scanner(System.in);
    }

    public int lerInt() throws NumberFormatException {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Valor incorreto");
            }
        }
    }

    public double lerDouble() throws NumberFormatException {
        try {
            return Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Valor incorreto");
        }

    }

    public boolean lerBoolean() {
        boolean b = false;
        boolean acabo = false;
        String bString = scanner.nextLine();
        do {
            if (bString.equalsIgnoreCase("s") || bString.equalsIgnoreCase("sim") || bString.equalsIgnoreCase("verdadeiro") || bString.equalsIgnoreCase("positivo")) {
                b = true;
                acabo = true;
            } else if (bString.equalsIgnoreCase("n") || bString.equalsIgnoreCase("não") || bString.equalsIgnoreCase("falso") || bString.equalsIgnoreCase("negativo")) {
                b = false;
                acabo = true;
            }
        } while (!acabo);
        return b;
    }

    public String lerString() {
        return scanner.nextLine();
    }
}
