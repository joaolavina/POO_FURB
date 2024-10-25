package model;

public class Tripulante extends Pessoa{

    private Funcao funcao;

    public Funcao getFuncao() {
        return funcao;
    }

    public void setFuncao(Funcao funcao) {
        this.funcao = funcao;
    }
    
    public Tripulante(String nome, double peso, Funcao funcao){
        super(nome, peso);
        this.funcao = funcao;
    }
}
