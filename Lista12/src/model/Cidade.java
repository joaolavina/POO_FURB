package model;

import java.io.Serializable;

public class Cidade implements Serializable{
    
    private int codigoIBGE;
    private String nomeCidade;
    private String estado;
    private int populacao; 
    private static final long serialVersionUID = 1L;
    
    
    public Cidade (int codigoIBGE, String nomeCidade, String estado, int populacao) {
        this.codigoIBGE = codigoIBGE;
        this.nomeCidade = nomeCidade;
        this.estado = estado;
        this.populacao = populacao;
    }

    public int getCodigoIBGE() {
        return codigoIBGE;
    }

    public void setCodigoIBGE(int codigoIBGE) {
        this.codigoIBGE = codigoIBGE;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }
    
    @Override
    public String toString(){
        return getNomeCidade() + ";" + getEstado() + ";" + getPopulacao();
    }
}
