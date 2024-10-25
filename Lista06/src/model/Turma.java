package model;

import java.util.ArrayList;

public class Turma {
    
    private String disciplina;
    private String codigo;
    private Professor professor = new Professor();  
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    
   public Turma(String disciplina, String codigo){
       this.disciplina = disciplina;
       this.codigo = codigo;
   }    

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
   
    public Professor getProfessor(){
        return professor;
    }
    
    public void setProfessor(Professor professor){
        this.professor = professor;
    }
    
    public ArrayList<Aluno> getAlunos(){
        return alunos;
    }
    
    public void incluirAlunos(Aluno aluno){
        if(alunos.size() == 30){
            throw new IllegalArgumentException("Não é possível adicionar mais que 30 alunos");
        }
        alunos.add(aluno);
    }
    
    public void removerAlunos(Aluno aluno){
        alunos.remove(aluno);
    }
    
    public double obterMelhorNotaEnem(){
        double maiorNota = 0;
        for(Aluno i: alunos){
            if(i.getNotaEnem() > maiorNota){
                maiorNota = i.getNotaEnem();
            }
        }
        return maiorNota;
    }
    
    public ArrayList<Aluno> obterAlunosMelhorNotaEnem(){
        ArrayList<Aluno> maioresNotasEnem = new ArrayList<Aluno>();
        for(Aluno i: alunos){
            if(i.getNotaEnem() == obterMelhorNotaEnem()){
                maioresNotasEnem.add(i);
            }
        }
        return maioresNotasEnem;
    }
}
