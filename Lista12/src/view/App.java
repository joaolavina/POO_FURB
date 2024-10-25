package view;

import java.util.ArrayList;
import java.util.List;
import model.*;

public class App {
    public static void main(String[] args) {
        
        try{
        List<Cidade> cidades = new ArrayList<>();
        Leitor l = new Leitor("src//municipios.csv");
        
        l.lerArquivo();
        
        System.out.println("Cidade com menor população \n" + l.getCidadeMenorPopulacao());
        System.out.println("Cidade com maior população \n" + l.getCidadeMaiorPopulacao());
        
        l.Serializar("src//serializar.bin");;

        cidades = l.Desserializar("src//serializar.bin");
        
        for(Cidade c : cidades){
            System.out.println(c.toString());
        }

        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
}
