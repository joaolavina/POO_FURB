package model;

/**
 * Enumera��o que representa os tipos de receitas poss�veis em um sistema financeiro.
 * Cada tipo de receita � associado a uma categoria espec�fica.
 * 
 * @author Bernardo_Nicoletti, Guilherme_Pedroso, Jo�o_Lavina
 */
public enum TipoReceita implements ITipoMovimentacao{

    /**
     * Representa a receita proveniente do sal�rio.
     */
    SALARIO,

    /**
     * Representa a receita correspondente ao d�cimo terceiro sal�rio.
     */
    DECIMO_TERCEIRO,

    /**
     * Representa a receita relacionada �s f�rias.
     */
    FERIAS,

    /**
     * Representa outros tipos de receitas n�o categorizados.
     */
    OUTROS
}
