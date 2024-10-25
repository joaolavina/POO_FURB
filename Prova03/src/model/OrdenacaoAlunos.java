package model;

import java.util.Comparator;

public class OrdenacaoAlunos implements Comparator<Aluno>{
   
    @Override
    public int compare(Aluno o1, Aluno o2){
        int ordem;
        
        if(o1.getNotaEnem() > o2.getNotaEnem()){
            ordem = -1;
        } else if(o1.getNotaEnem() < o2.getNotaEnem()){
            ordem = 1;
        } else{
            ordem = o1.getDataNascimento().compareTo(o2.getDataNascimento());
        }
        
        return ordem;
    }
}
