package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Leitor {
    
    File arquivo;
    Map<String,Palavra> palavras;

    public Map<String, Palavra> getPalavras() {
        return palavras;
    }
    
    public Leitor(String arq){
        arquivo = new File(arq);
        
        if(!arquivo.exists()){
            throw new IllegalArgumentException("Arquivo não existe");
        } else if(arquivo.isDirectory()){
            throw new IllegalArgumentException("Arquivo é um diretório");
        }
        
        palavras = new TreeMap<>();
    }
    
    public void lerArquivo(){
        try(Scanner scanner = new Scanner(arquivo)){
            scanner.useDelimiter("[,.;:?!()' ]");
            
            while(scanner.hasNext()){
                String pLida = scanner.next();
                if(!palavras.containsKey(pLida)){
                    Palavra p = new Palavra(pLida);
                    palavras.put(pLida, p);
                } else{
                    palavras.get(pLida).aumentarRepeticoes();
                }
            }
            
        } catch (FileNotFoundException e){
            throw new IllegalArgumentException("Arquivo não encontrado");
        } 
    }
    
}
