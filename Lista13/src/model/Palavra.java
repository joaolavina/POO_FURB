package model;

public class Palavra {
    
    private String palavra;
    private int repeticoes = 0; 

    public Palavra(String palavra) {
        this.palavra = palavra;
        repeticoes++;
    }
    
    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public int getRepeticoes() {
        return repeticoes;
    }

    public void aumentarRepeticoes() {
        repeticoes++;
    }
}
