package model;

/**
 * Representa uma movimenta��o de receita em um sistema financeiro.
 * Estende a classe {@link Movimentacao}.
 *
 * @see Movimentacao
 * 
 * @author Bernardo_Nicoletti, Guilherme_Pedroso, Jo�o_Lavina
 */
public class Receita extends Movimentacao {

    /**
     * Enumera��o que define os tipos de receita poss�veis.
     */
    TipoReceita tipo;

    /**
     * Construtor para criar uma inst�ncia de Receita.
     *
     * @param dia   O dia da movimenta��o.
     * @param mes   O m�s da movimenta��o.
     * @param valor O valor da movimenta��o.
     * @param tipo  O tipo de receita.
     */
    public Receita(int dia, int mes, int ano, double valor, TipoReceita tipo) throws IllegalArgumentException{
        super(dia, mes, ano, valor);
        setTipo(tipo);
    }

    /**
     * Obt�m o tipo de receita associado a esta inst�ncia.
     *
     * @return O tipo de receita.
     */
    public TipoReceita getTipo() {
        return tipo;
    }

    /**
     * Define o tipo de receita para esta inst�ncia.
     *
     * @param tipo O tipo de receita a ser definido.
     */
    public void setTipo(TipoReceita tipo) {
        this.tipo = tipo;
    }

    /**
     * Retorna uma representa��o em formato de string da inst�ncia Receita.
     *
     * @return Uma string representando a despesa no formato "Despesa;Tipo;Dia/M�s;Valor".
     */
    @Override
    public String toString() {
        return "RECEITA;" + getTipo() + ";" + getDia() + "/" + getMes() + "/" + getAno() + ";" + getValor();
    }
}

