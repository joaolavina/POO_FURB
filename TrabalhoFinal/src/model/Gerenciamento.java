package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Classe respons�vel pelo gerenciamento das movimenta��es financeiras em um
 * sistema.
 *
 * @author Bernardo_Nicoletti, Guilherme_Pedroso, Jo�o_Lavina
 */
public class Gerenciamento extends ManipuladorArq {

    /**
     * Dia atual para consulta de saldo.
     */
    private int diaAtual;

    /**
     * M�s atual para consulta de saldo.
     */
    private int mesAtual;

    /**
     * Ano atual para consulta de saldo.
     */
    private int anoAtual;

    /**
     * Lista de movimenta��es financeiras.
     */
    private ArrayList<Movimentacao> movimentacoes = new ArrayList<>();

    /**
     * Construtor que inicializa o Gerenciamento com um dia e m�s espec�ficos.
     *
     * @param diaAtual O dia atual para consulta de saldo.
     * @param mesAtual O m�s atual para consulta de saldo.
     * @param anoAtual O ano atual para consulta de saldo.
     * @param arq O caminho do arquivo.
     * @throws IllegalArgumentException Se o dia ou m�s fornecidos forem
     * inv�lidos.
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
            throw new IllegalArgumentException("A data fornecida � inv�lida.");
        }
    }

    /**
     * Organiza a lista de movimenta��es em ordem crescente de data.
     */
    private void Organizar() {
        Collections.sort(movimentacoes);
    }

    /**
     * Obt�m a lista de todas as movimenta��es.
     *
     * @return Lista de movimenta��es.
     */
    public List<Movimentacao> getMovimentacoes() {
        return movimentacoes;
    }

    /**
     * Obt�m a lista de despesas presentes nas movimenta��es.
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
     * Obt�m a lista de receitas presentes nas movimenta��es.
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
     * Inclui uma nova movimenta��o na lista.
     *
     * @param m A movimenta��o a ser inclu�da.
     */
    public void incluirMovimentacao(Movimentacao m) {
        movimentacoes.add(m);
        Organizar();
        addMovimentacaoArq(m);
    }

    /**
     * Obt�m o dia atual para consulta de saldo.
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
     * Obt�m o m�s atual para consulta de saldo.
     *
     * @return O m�s atual.
     */
    public int getMesAtual() {
        return mesAtual;
    }

    /**
     * Define o m�s atual para consulta de saldo.
     *
     * @param mesAtual O m�s atual a ser definido.
     */
    public void setMesAtual(int mesAtual) {
        this.mesAtual = mesAtual;
    }

    /**
     * Obt�m o ano atual para consulta de saldo.
     *
     * @return O ano atual.
     */
    public int getAnoAtual() {
        return anoAtual;
    }

    /**
     * Define o ano atual para consulta de saldo.
     *
     * @param anoAtual O m�s atual a ser definido.
     */
    public void setAnoAtual(int anoAtual) {
        this.anoAtual = anoAtual;
    }

}
