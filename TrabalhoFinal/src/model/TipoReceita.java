package model;

/**
 * Enumeração que representa os tipos de receitas possíveis em um sistema financeiro.
 * Cada tipo de receita é associado a uma categoria específica.
 * 
 * @author Bernardo_Nicoletti, Guilherme_Pedroso, João_Lavina
 */
public enum TipoReceita implements ITipoMovimentacao{

    /**
     * Representa a receita proveniente do salário.
     */
    SALARIO,

    /**
     * Representa a receita correspondente ao décimo terceiro salário.
     */
    DECIMO_TERCEIRO,

    /**
     * Representa a receita relacionada às férias.
     */
    FERIAS,

    /**
     * Representa outros tipos de receitas não categorizados.
     */
    OUTROS
}
