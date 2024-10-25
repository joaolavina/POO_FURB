package model.testes;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import model.Despesa;
import model.Gerenciamento;
import model.Movimentacao;
import model.Receita;
import model.TipoDespesa;
import model.TipoReceita;


public class Testes {

    @Test(expected = IllegalArgumentException.class)
    public void testDespesa() throws Exception {
        Despesa d = new Despesa(17, 11, 2023, -400, TipoDespesa.SAUDE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReceita() throws Exception {
        Receita r = new Receita(17, 11, 2023, -300, TipoReceita.DECIMO_TERCEIRO);
    }

    @Test
    public void testGetMovimentacoes() {
        Gerenciamento gerenciamento = new Gerenciamento(1, 1, 2023, "src//dados.csv");
        Despesa despesa = new Despesa(10, 5, 2023, 50.0, TipoDespesa.ALIMENTACAO);
        Receita receita = new Receita(5, 8, 2023, 100.0, TipoReceita.SALARIO);

        gerenciamento.incluirMovimentacao(despesa);
        gerenciamento.incluirMovimentacao(receita);

        assertEquals(2, gerenciamento.getMovimentacoes().size());
    }

    @Test
    public void testOrdenacaoPorData() {
   
        Gerenciamento gerenciamento = new Gerenciamento(1, 1, 2023, "src//dados.csv");


        Movimentacao movimentacao1 = new Despesa(2, 1, 2023, 50.0, TipoDespesa.ALIMENTACAO);
        Movimentacao movimentacao2 = new Receita(1, 1, 2023, 100.0, TipoReceita.SALARIO);
        Movimentacao movimentacao3 = new Despesa(3, 1, 2023, 30.0, TipoDespesa.TRANSPORTE);

        gerenciamento.incluirMovimentacao(movimentacao1);
        gerenciamento.incluirMovimentacao(movimentacao2);
        gerenciamento.incluirMovimentacao(movimentacao3);

        List<Movimentacao> teste = gerenciamento.getMovimentacoes();

      
        assertEquals(movimentacao2, teste.get(0)); 
        assertEquals(movimentacao1, teste.get(1)); 
        assertEquals(movimentacao3, teste.get(2)); 
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDiaInvalidoDespesa() {
        Despesa despesa = new Despesa(0, 1, 2023, 50.0, TipoDespesa.ALIMENTACAO);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDiaInvalidoReceita() {
        Receita receita = new Receita(0, 1, 2023, 100.0, TipoReceita.SALARIO);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDiaInvalidoGerenciamento() {
        Gerenciamento gerenciamento = new Gerenciamento(0, 1, 2023, "src//dados.csv");
    }

    @Test
    public void testNovaDespesa() {
        Despesa despesa = new Despesa(10, 11, 2023, 50.0, TipoDespesa.ALIMENTACAO);
        assertEquals(10, despesa.getDia());
        assertEquals(11, despesa.getMes());
        assertEquals(2023, despesa.getAno());
        assertEquals(50.0, despesa.getValor(), 0.001);
        assertEquals(TipoDespesa.ALIMENTACAO, despesa.getTipo());
    }

    @Test
    public void testNovaReceita() {
        Receita receita = new Receita(15, 5, 2023, 100.0, TipoReceita.SALARIO);
        assertEquals(15, receita.getDia());
        assertEquals(5, receita.getMes());
        assertEquals(2023, receita.getAno());
        assertEquals(100.0, receita.getValor(), 0.001);
        assertEquals(TipoReceita.SALARIO, receita.getTipo());
    }

    @Test
    public void testGetReceitas() {
        Gerenciamento gerenciamento = new Gerenciamento(1, 1, 2023, "src//dados.csv");

        Despesa despesa1 = new Despesa(10, 2, 2023, 50.0, TipoDespesa.ALIMENTACAO);
        Receita receita1 = new Receita(5, 3, 2023, 100.0, TipoReceita.SALARIO);
        Despesa despesa2 = new Despesa(15, 3, 2023, 30.0, TipoDespesa.TRANSPORTE);
        gerenciamento.incluirMovimentacao(despesa1);
        gerenciamento.incluirMovimentacao(receita1);
        gerenciamento.incluirMovimentacao(despesa2);

        ArrayList<Receita> receitas = gerenciamento.getReceitas();

        assertEquals(1, receitas.size());
        assertEquals(receita1, receitas.get(0));
    }

    @Test
    public void testGetDespesas() {

        Gerenciamento gerenciamento = new Gerenciamento(1, 1, 2023, "src//dados.csv");

        Despesa despesa1 = new Despesa(10, 2, 2023, 50.0, TipoDespesa.ALIMENTACAO);
        Receita receita1 = new Receita(5, 3, 2023, 100.0, TipoReceita.SALARIO);
        Despesa despesa2 = new Despesa(15, 3, 2023, 30.0, TipoDespesa.TRANSPORTE);
        gerenciamento.incluirMovimentacao(despesa1);
        gerenciamento.incluirMovimentacao(receita1);
        gerenciamento.incluirMovimentacao(despesa2);

        ArrayList<Despesa> despesas = gerenciamento.getDespesas();

        assertEquals(2, despesas.size());
        assertEquals(despesa1, despesas.get(0));
        assertEquals(despesa2, despesas.get(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDespesaComAnoInvalido() {
        Despesa d = new Despesa(10, 5, -2023, 50.0, TipoDespesa.ALIMENTACAO);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReceitaComAnoInvalido() {
        Receita r = new Receita(5, 8, -2023, 100.0, TipoReceita.SALARIO);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDespesaComMesInvalido() {
        Despesa d = new Despesa(10, 13, 2023, 50.0, TipoDespesa.ALIMENTACAO);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReceitaComMesInvalido() {
        Receita r = new Receita(5, 15, 2023, 100.0, TipoReceita.SALARIO);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testReceitaComValorInvalido(){
        Receita r = new Receita(19, 11, 2023, 0, TipoReceita.DECIMO_TERCEIRO);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDespesaComValorInvalido(){
        Despesa d = new Despesa(19, 11, 2023, 0, TipoDespesa.EDUCACAO);
    }
    
   @Test
    public void TesTDespesa(){
        Despesa n = new Despesa(19, 11, 2003, 2, TipoDespesa.EDUCACAO);
        assertEquals(n,n);
    }

    @Test
    public void TesTReceita(){
        Receita n = new Receita(19, 11, 2003, 3, TipoReceita.DECIMO_TERCEIRO);
        assertEquals(n,n);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testArquivoInvalidoGerenciamento() {
        Gerenciamento gerenciamento = new Gerenciamento(12, 1, 2023, "teste");
    }
}
