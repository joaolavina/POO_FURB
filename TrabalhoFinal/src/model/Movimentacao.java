package model;

/**
 * Classe abstrata que representa uma movimenta��o financeira em um sistema.
 * Implementa a interface {@link Comparable} para permitir a compara��o entre
 * movimenta��es.
 *
 * @author Bernardo_Nicoletti, Guilherme_Pedroso, Jo�o_Lavina
 */
public abstract class Movimentacao implements Comparable<Movimentacao> {

    /**
     * Representa o dia da movimenta��o.
     */
    private int dia;

    /**
     * Representa o m�s da movimenta��o.
     */
    private int mes;

    /**
     * Representa o ano da movimenta��o.
     */
    private int ano;

    /**
     * Representa o valor da movimenta��o.
     */
    private double valor;

    /**
     * Construtor para criar uma inst�ncia de Movimentacao.
     *
     * @param dia O dia da movimenta��o.
     * @param mes O m�s da movimenta��o.
     * @param ano O ano da movimenta��o.
     * @param valor O valor da movimenta��o.
     */
    public Movimentacao(int dia, int mes, int ano, double valor) throws IllegalArgumentException {
        if ((dia > 0 && dia < 32) && (mes > 0 && mes < 13) && (ano > 0) && (valor > 0)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
            this.valor = valor;
        } else {
            throw new IllegalArgumentException("Dados fornecidos s�o inv�lidos");
        }
    }

    /**
     * M�todo de compara��o para ordenar movimenta��es com base em dia e m�s.
     *
     * @param m A movimenta��o a ser comparada.
     * @return Um valor negativo se esta movimenta��o for anterior a {@code m},
     * um valor positivo se for posterior a {@code m}, ou zero se forem iguais.
     */
    @Override
    public int compareTo(Movimentacao m
    ) {
        if (this.getAno() < m.getAno()) {
            return -1;
        } else if ((this.getAno() > m.getAno())) {
            return 1;
        }

        if (this.getMes() < m.getMes()) {
            return -1;
        } else if (this.getMes() > m.getMes()) {
            return 1;
        }

        if (this.getDia() < m.getDia()) {
            return -1;
        } else if (this.getDia() > m.getDia()) {
            return 1;
        }

        return 0;
    }

    /**
     * Obt�m o dia da movimenta��o.
     *
     * @return O dia da movimenta��o.
     */
    public int getDia() {
        return dia;
    }

    /**
     * Define o dia da movimenta��o.
     *
     * @param dia O dia a ser definido.
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     * Obt�m o m�s da movimenta��o.
     *
     * @return O m�s da movimenta��o.
     */
    public int getMes() {
        return mes;
    }

    /**
     * Define o m�s da movimenta��o.
     *
     * @param mes O m�s a ser definido.
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * Obt�m o ano da movimenta��o.
     *
     * @return O ano da movimenta��o.
     */
    public int getAno() {
        return ano;
    }

    /**
     * Define o ano da movimenta��o.
     *
     * @param ano O m�s a ser definido.
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    
    public String getData(){
        return dia + "/" + mes + "/" + ano;
    }
    
    /**
     * Obt�m o valor da movimenta��o.
     *
     * @return O valor da movimenta��o.
     */
    public double getValor() {
        return valor;
    }

    /**
     * Define o valor da movimenta��o.
     *
     * @param valor O valor a ser definido.
     */
    public void setValor(double valor) {
        this.valor = valor;
    }
}
