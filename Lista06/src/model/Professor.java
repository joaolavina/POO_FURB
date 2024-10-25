package model;

public class Professor {
    
    private String nome;
    private String email;
    private Titulacao titulacao;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public Titulacao getTitulacao(){
        return titulacao;
    }
    
    public void setTitulacao(Titulacao titulacao){
        this.titulacao = titulacao;
    }
}
