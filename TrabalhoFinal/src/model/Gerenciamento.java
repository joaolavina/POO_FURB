package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Classe responsável pelo gerenciamento das movimentações financeiras em um
 * sistema.
 *
 * @author Bernardo_Nicoletti, Guilherme_Pedroso, João_Lavina
 */
public class Gerenciamento extends ManipuladorArq {

    /**
     * Dia atual para consulta de saldo.
     */
    private int diaAtual;

    /**
     * Mês atual para consulta de saldo.
     */
    private int mesAtual;

    /**
     * Ano atual para consulta de saldo.
     */
    private int anoAtual;

    /**
     * Lista de movimentações financeiras.
     */
    private ArrayList<Movimentacao> movimentacoes = new ArrayList<>();

    /**
     * Construtor que inicializa o Gerenciamento com um dia e mês específicos.
     *
     * @param diaAtual O dia atual para consulta de saldo.
     * @param mesAtual O mês atual para consulta de saldo.
     * @param anoAtual O ano atual para consulta de saldo.
     * @param arq O caminho do arquivo.
     * @throws IllegalArgumentException Se o dia ou mês fornecidos forem
     * inválidos.
     */
    public Gerenciamento(int diaAtual, int mesAtual, int anoAtual, String arq) throws IllegalArgumentException {
        super(arq);
        if ((diaAtual > 0 && diaAtual < 32) && (mesAtual > 0 && mesAtual < 13) && (anoAtual > 0)) {
            this.diaAtual = diaAtual;
            this.mesAtual = mesAtual;
            this.anoAtual = anoAtual;

            movimentacoes = lerArquivo();
            Organizar();
        } else {
            throw new IllegalArgumentException("A data fornecida é inválida.");
        }
    }

    /**
     * Organiza a lista de movimentações em ordem crescente de data.
     */
    private void Organizar() {
        Collections.sort(movimentacoes);
    }

    /**
     * Obtém a lista de todas as movimentações.
     *
     * @return Lista de movimentações.
     */
    public List<Movimentacao> getMovimentacoes() {
        return movimentacoes;
    }

    /**
     * Obtém a lista de despesas presentes nas movimentações.
     *
     * @return Lista de despesas.
     */
    public ArrayList<Despesa> getDespesas() {
        ArrayList<Despesa> gastos = new ArrayList<>();

        for (Movimentacao m : getMovimentacoes()) {
            if (m instanceof Despesa) {
                gastos.add((Despesa) m);
            }
        }
        return gastos;
    }

    /**
     * Obtém a lista de receitas presentes nas movimentações.
     *
     * @return Lista de receitas.
     */
    public ArrayList<Receita> getReceitas() {
        ArrayList<Receita> receitas = new ArrayList<>();

        for (Movimentacao m : getMovimentacoes()) {
            if (m instanceof Receita) {
                receitas.add((Receita) m);
            }
        }
        return receitas;
    }

    /**
     * Inclui uma nova movimentação na lista.
     *
     * @param m A movimentação a ser incluída.
     */
    public void incluirMovimentacao(Movimentacao m) {
        movimentacoes.add(m);
        Organizar();
        addMovimentacaoArq(m);
    }

    /**
     * Obtém o dia atual para consulta de saldo.
     *
     * @return O dia atual.
     */
    public int getDiaAtual() {
        return diaAtual;
    }

    /**
     * Define o dia atual para consulta de saldo.
     *
     * @param diaAtual O dia atual a ser definido.
     */
    public void setDiaAtual(int diaAtual) {
        this.diaAtual = diaAtual;
    }

    /**
     * Obtém o mês atual para consulta de saldo.
     *
     * @return O mês atual.
     */
    public int getMesAtual() {
        return mesAtual;
    }

    /**
     * Define o mês atual para consulta de saldo.
     *
     * @param mesAtual O mês atual a ser definido.
     */
    public void setMesAtual(int mesAtual) {
        this.mesAtual = mesAtual;
    }

    /**
     * Obtém o ano atual para consulta de saldo.
     *
     * @return O ano atual.
     */
    public int getAnoAtual() {
        return anoAtual;
    }

    /**
     * Define o ano atual para consulta de saldo.
     *
     * @param anoAtual O mês atual a ser definido.
     */
    public void setAnoAtual(int anoAtual) {
        this.anoAtual = anoAtual;
    }

}
