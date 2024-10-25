package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Leitor {
    
    public Set<String> lerArquivo(String arq) throws FileNotFoundException{
        File arquivo = new File(arq);
        
        Scanner scanner = new Scanner(new File(arq), "ISO-8859-1");
        
        Set<String> dados = new HashSet<>();
        
        while(scanner.hasNext()){
            dados.add(scanner.nextLine());
        }
        
        return dados;
    }
}
