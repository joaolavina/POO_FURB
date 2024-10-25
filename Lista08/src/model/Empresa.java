package model;

import java.util.ArrayList;

public class Empresa {
    
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private String nome;
    
    public Empresa(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void incluirFuncionario(Funcionario f){
        funcionarios.add(f);
    }
    
    public void removerFuncionario(Funcionario f){
        funcionarios.remove(f);
    }
    
    public ArrayList<Funcionario> getFuncionarios(){
        return funcionarios;
    }
    
    public double calcularCustosSalarios(){
        double custosSalario = 0;
        
        for (Funcionario f : funcionarios){
            custosSalario += f.calcularSalario();
        }
        
        return custosSalario;
    }
}
