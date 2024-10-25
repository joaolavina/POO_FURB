package model;

/**
 * Classe abstrata que representa uma movimentação financeira em um sistema.
 * Implementa a interface {@link Comparable} para permitir a comparação entre
 * movimentações.
 *
 * @author Bernardo_Nicoletti, Guilherme_Pedroso, João_Lavina
 */
public abstract class Movimentacao implements Comparable<Movimentacao> {

    /**
     * Representa o dia da movimentação.
     */
    private int dia;

    /**
     * Representa o mês da movimentação.
     */
    private int mes;

    /**
     * Representa o ano da movimentação.
     */
    private int ano;

    /**
     * Representa o valor da movimentação.
     */
    private double valor;

    /**
     * Construtor para criar uma instância de Movimentacao.
     *
     * @param dia O dia da movimentação.
     * @param mes O mês da movimentação.
     * @param ano O ano da movimentação.
     * @param valor O valor da movimentação.
     */
    public Movimentacao(int dia, int mes, int ano, double valor) throws IllegalArgumentException {
        if ((dia > 0 && dia < 32) && (mes > 0 && mes < 13) && (ano > 0) && (valor > 0)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
            this.valor = valor;
        } else {
            throw new IllegalArgumentException("Dados fornecidos são inválidos");
        }
    }

    /**
     * Método de comparação para ordenar movimentações com base em dia e mês.
     *
     * @param m A movimentação a ser comparada.
     * @return Um valor negativo se esta movimentação for anterior a {@code m},
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
     * Obtém o dia da movimentação.
     *
     * @return O dia da movimentação.
     */
    public int getDia() {
        return dia;
    }

    /**
     * Define o dia da movimentação.
     *
     * @param dia O dia a ser definido.
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     * Obtém o mês da movimentação.
     *
     * @return O mês da movimentação.
     */
    public int getMes() {
        return mes;
    }

    /**
     * Define o mês da movimentação.
     *
     * @param mes O mês a ser definido.
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * Obtém o ano da movimentação.
     *
     * @return O ano da movimentação.
     */
    public int getAno() {
        return ano;
    }

    /**
     * Define o ano da movimentação.
     *
     * @param ano O mês a ser definido.
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    
    public String getData(){
        return dia + "/" + mes + "/" + ano;
    }
    
    /**
     * Obtém o valor da movimentação.
     *
     * @return O valor da movimentação.
     */
    public double getValor() {
        return valor;
    }

    /**
     * Define o valor da movimentação.
     *
     * @param valor O valor a ser definido.
     */
    public void setValor(double valor) {
        this.valor = valor;
    }
}
