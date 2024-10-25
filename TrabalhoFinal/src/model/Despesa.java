package model;

/**
 * Classe que representa uma despesa em um sistema financeiro.
 *
 * @see Movimentacao
 * 
 * @author Bernardo_Nicoletti, Guilherme_Pedroso, João_Lavina
 */
public class Despesa extends Movimentacao {

    /**
     * Tipo de despesa associado à movimentação.
     */
    TipoDespesa tipo;

    /**
     * Construtor que inicializa a Despesa com informações específicas.
     *
     * @param dia   O dia da movimentação.
     * @param mes   O mês da movimentação.
     * @param ano   O ano da movimentação.
     * @param valor O valor da movimentação.
     * @param tipo  O tipo de despesa associado à movimentação.
     */
    public Despesa(int dia, int mes, int ano, double valor, TipoDespesa tipo) throws IllegalArgumentException {
        super(dia, mes, ano, valor);
        this.tipo = tipo;
    }

    /**
     * Obtém o tipo de despesa associado à movimentação.
     *
     * @return O tipo de despesa.
     */
    public TipoDespesa getTipo() {
        return tipo;
    }

    /**
     * Define o tipo de despesa associado à movimentação.
     *
     * @param tipo O tipo de despesa a ser definido.
     */
    public void setTipo(TipoDespesa tipo) {
        this.tipo = tipo;
    }

    /**
     * Sobrescreve o método toString para fornecer uma representação em string da Despesa.
     *
     * @return Uma string representando a despesa no formato "Despesa;Tipo;Dia/Mês;Valor".
     */
    @Override
    public String toString() {
        return "DESPESA;" + getTipo() + ";" + getDia() + "/" + getMes() + "/" + getAno() + ";" + getValor();
    }
}