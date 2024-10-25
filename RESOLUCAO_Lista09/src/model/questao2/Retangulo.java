package model.questao2;

public class Retangulo {
    
    private int altura;
    private int comprimento;
    
    public Retangulo() {
    }
    
    public Retangulo(int comprimento, int altura)  {
        setAltura(altura);
        setComprimento(comprimento);
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("Valor incorreto para altura: " + altura);
        }
        
        this.altura = altura;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        if (comprimento <= 0) {
            throw new IllegalArgumentException("Valor incorreto para comprimento: " + comprimento);
        }
        this.comprimento = comprimento;
    }
    
    public int calcularPerimetro() {
        return (2 * getAltura()) + (2 * getComprimento());
    }
    
    
    public int calcularArea() {
        return getAltura() * getComprimento();
    }
            

}