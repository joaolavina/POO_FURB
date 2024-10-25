package model;

/**
 * Representa uma movimentação de receita em um sistema financeiro.
 * Estende a classe {@link Movimentacao}.
 *
 * @see Movimentacao
 * 
 * @author Bernardo_Nicoletti, Guilherme_Pedroso, João_Lavina
 */
public class Receita extends Movimentacao {

    /**
     * Enumeração que define os tipos de receita possíveis.
     */
    TipoReceita tipo;

    /**
     * Construtor para criar uma instância de Receita.
     *
     * @param dia   O dia da movimentação.
     * @param mes   O mês da movimentação.
     * @param valor O valor da movimentação.
     * @param tipo  O tipo de receita.
     */
    public Receita(int dia, int mes, int ano, double valor, TipoReceita tipo) throws IllegalArgumentException{
        super(dia, mes, ano, valor);
        setTipo(tipo);
    }

    /**
     * Obtém o tipo de receita associado a esta instância.
     *
     * @return O tipo de receita.
     */
    public TipoReceita getTipo() {
        return tipo;
    }

    /**
     * Define o tipo de receita para esta instância.
     *
     * @param tipo O tipo de receita a ser definido.
     */
    public void setTipo(TipoReceita tipo) {
        this.tipo = tipo;
    }

    /**
     * Retorna uma representação em formato de string da instância Receita.
     *
     * @return Uma string representando a despesa no formato "Despesa;Tipo;Dia/Mês;Valor".
     */
    @Override
    public String toString() {
        return "RECEITA;" + getTipo() + ";" + getDia() + "/" + getMes() + "/" + getAno() + ";" + getValor();
    }
}

