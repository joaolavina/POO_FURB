package Questao_04;

/**
 *
 * @author jg_la
 */
public class Retangulo {

    private int altura;
    private int comprimento;

    public Retangulo() {
        altura = 0;
        comprimento = 0;
    }

    public Retangulo(int comprimento, int altura) {
        this.comprimento = comprimento;
        this.altura = altura;
    }

    public int calcularPerimetro(int comprimento, int altura) {
        return (comprimento * 2) + (altura * 2);
    }

    public int calcularArea(int comprimento, int altura) {
        return comprimento * altura;
    }

    public void setAltura(int altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("Valor incorreto para altura: " + altura);
        } else {
            this.altura = altura;
        }
    }

    public void setComprimento(int comprimento) {
        if (comprimento <= 0) {
            throw new IllegalArgumentException("Valor incorreto para comprimeento: " + altura);
        } else {
            this.comprimento = comprimento;
        }
    }

    public int getAltura() {
        return altura;
    }

    public int getComprimento() {
        return comprimento;
    }
}
