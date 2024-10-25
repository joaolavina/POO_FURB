package model;

import java.time.LocalDate;

public class Aluno {
    private int matricula;
    private String nome;
    private double notaEnem;
    
    private LocalDate dataNascimento;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotaEnem() {
        return notaEnem;
    }

    public void setNotaEnem(double notaEnem) {
        this.notaEnem = notaEnem;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(int ano, byte mes, byte dia) {
        dataNascimento = LocalDate.of(ano, mes, dia);
    }
}
