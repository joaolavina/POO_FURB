package model;

import java.util.ArrayList;

public class Programador extends Funcionario{
    
    private ArrayList<String> linguagens = new ArrayList<>();
    
    public Programador(String nome, double salarioBase){
        super(nome, salarioBase);
    }
    
    public void incluirLinguagem(String linguagem){
        linguagens.add(linguagem);
    }
    
    public void removerLinguagem(String linguagem){
        linguagens.remove(linguagem);
    }
    
    public ArrayList<String> getLinguagens(){
        return linguagens;
    }
    
    @Override
    public double calcularSalario(){
        boolean conheceJava = false;
        
        for(String l : linguagens){
            if(l.equalsIgnoreCase("Java")){
                conheceJava = true;
            }
        }
        
        if(conheceJava){
            return getSalarioBase() * 1.05;
        }
        else{
            return getSalarioBase();
        }
    }
}
