package model;

/**
 * Classe que representa uma despesa em um sistema financeiro.
 *
 * @see Movimentacao
 * 
 * @author Bernardo_Nicoletti, Guilherme_Pedroso, Jo�o_Lavina
 */
public class Despesa extends Movimentacao {

    /**
     * Tipo de despesa associado � movimenta��o.
     */
    TipoDespesa tipo;

    /**
     * Construtor que inicializa a Despesa com informa��es espec�ficas.
     *
     * @param dia   O dia da movimenta��o.
     * @param mes   O m�s da movimenta��o.
     * @param ano   O ano da movimenta��o.
     * @param valor O valor da movimenta��o.
     * @param tipo  O tipo de despesa associado � movimenta��o.
     */
    public Despesa(int dia, int mes, int ano, double valor, TipoDespesa tipo) throws IllegalArgumentException {
        super(dia, mes, ano, valor);
        this.tipo = tipo;
    }

    /**
     * Obt�m o tipo de despesa associado � movimenta��o.
     *
     * @return O tipo de despesa.
     */
    public TipoDespesa getTipo() {
        return tipo;
    }

    /**
     * Define o tipo de despesa associado � movimenta��o.
     *
     * @param tipo O tipo de despesa a ser definido.
     */
    public void setTipo(TipoDespesa tipo) {
        this.tipo = tipo;
    }

    /**
     * Sobrescreve o m�todo toString para fornecer uma representa��o em string da Despesa.
     *
     * @return Uma string representando a despesa no formato "Despesa;Tipo;Dia/M�s;Valor".
     */
    @Override
    public String toString() {
        return "DESPESA;" + getTipo() + ";" + getDia() + "/" + getMes() + "/" + getAno() + ";" + getValor();
    }
}