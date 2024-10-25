package view;

import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import model.*;

public class App {
    public static void main(String[] args) {
        Leitor leitor = new Leitor();
        
        Set<String> valeItajai = new HashSet<>();
        Set<String> litoraneas = new TreeSet<>();
        
        try {
            valeItajai = leitor.lerArquivo("src//valeitajai.txt");
            litoraneas = leitor.lerArquivo("src//litoraneas.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
            return;
        }    
               
        // CIDADES DO VALE
        for (String cidade : valeItajai){
            System.out.println(cidade);
        }
        
        // QUANTIDADE CIDADES DO VALE
        System.out.println(valeItajai.size());
        
        // CIDADES LITORÂNEAS
        for (String cidade : litoraneas){
            System.out.println(cidade);
        }
        
        // QUANTIDADE CIDADES LITORANEAS
        System.out.println(litoraneas.size());
        
        // CIDADES DO VALE E LITORÂNEAS
        for (String cidadeVale : valeItajai) {
            for (String cidadeLitoranea : litoraneas){
                if(cidadeVale.trim().equalsIgnoreCase(cidadeLitoranea.trim())){
                    System.out.println(cidadeVale);
                }
            }
        }
        
        
        // CIDADES DO VALE E NÃO LITORÂNEAS
       for (String cidadeVale : valeItajai){
           boolean temIgual = false;
           for(String cidadeLitoranea : litoraneas){
               if(cidadeVale.trim().equalsIgnoreCase(cidadeLitoranea.trim())){
                   temIgual = true;
               }
           }
           
           if(!temIgual){
               System.out.println(cidadeVale);
           }
       }
       
       // CIDADES LITORÂNEAS E NÃO VALE
       for(String cidadeLitoranea : litoraneas){
           boolean temIgual = false;
           for(String cidadeVale : valeItajai){
               if(cidadeLitoranea.trim().equalsIgnoreCase(cidadeVale.trim())){
                   temIgual = true;
               }
           }
           
           if(!temIgual){
               System.out.println(cidadeLitoranea);
           } 
       }
       
        // REMOVER DO VALE CIDADES QUE COMEÇAM COM A
        Iterator<String> iterador = valeItajai.iterator();
        while(iterador.hasNext()){
            String c = iterador.next();
            if(c.startsWith("A") || c.startsWith("a")){
                iterador.remove();
            }
        }
    }
}
