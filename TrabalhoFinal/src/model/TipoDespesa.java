package model;

/**
 * Enumera��o que representa os tipos de despesas poss�veis em um sistema financeiro.
 * Cada tipo de despesa � associado a uma categoria espec�fica.
 * 
 * @author Bernardo_Nicoletti, Guilherme_Pedroso, Jo�o_Lavina
 */
public enum TipoDespesa implements ITipoMovimentacao{

    /**
     * Representa despesas relacionadas � alimenta��o.
     */
    ALIMENTACAO,

    /**
     * Representa despesas relacionadas ao transporte.
     */
    TRANSPORTE,

    /**
     * Representa despesas relacionadas � resid�ncia.
     */
    RESIDENCIA,

    /**
     * Representa despesas relacionadas � sa�de.
     */
    SAUDE,

    /**
     * Representa despesas relacionadas � educa��o.
     */
    EDUCACAO,

    /**
     * Representa despesas relacionadas ao entretenimento.
     */
    ENTRETERIMENTO,

    /**
     * Representa outros tipos de despesas n�o categorizadas.
     */
    OUTROS
}

