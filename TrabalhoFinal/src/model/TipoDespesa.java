package model;

/**
 * Enumeração que representa os tipos de despesas possíveis em um sistema financeiro.
 * Cada tipo de despesa é associado a uma categoria específica.
 * 
 * @author Bernardo_Nicoletti, Guilherme_Pedroso, João_Lavina
 */
public enum TipoDespesa implements ITipoMovimentacao{

    /**
     * Representa despesas relacionadas à alimentação.
     */
    ALIMENTACAO,

    /**
     * Representa despesas relacionadas ao transporte.
     */
    TRANSPORTE,

    /**
     * Representa despesas relacionadas à residência.
     */
    RESIDENCIA,

    /**
     * Representa despesas relacionadas à saúde.
     */
    SAUDE,

    /**
     * Representa despesas relacionadas à educação.
     */
    EDUCACAO,

    /**
     * Representa despesas relacionadas ao entretenimento.
     */
    ENTRETERIMENTO,

    /**
     * Representa outros tipos de despesas não categorizadas.
     */
    OUTROS
}

