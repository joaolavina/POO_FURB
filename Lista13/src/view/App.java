package view;

import model.*;

public class App {
    public static void main(String[] args) {
        Leitor l = new Leitor("src//Textoo.txt");
        
        l.lerArquivo();
        
        for(Palavra p : l.getPalavras().values()){
            System.out.println("Palavra: " + p.getPalavra() + "\nRepetições: " + p.getRepeticoes());
        }
    }
}
