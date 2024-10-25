package view.questao1;

import model.questao1.ContaAgua;
import model.questao1.ControleGastos;
import model.questao1.MensalidadeEnsino;
import model.questao1.PrevidenciaPrivada;
import model.questao1.Desembolsavel;
import model.questao1.Investimento;

public class App {

    public static void main(String[] args) {
        ControleGastos gastos = new ControleGastos();
        
        gastos.incluirItem( new ContaAgua(100, 1.20) );
        gastos.incluirItem( new MensalidadeEnsino(15, 62.50) );
        
        PrevidenciaPrivada p = new PrevidenciaPrivada();
        p.setValorPadraoInvestimento(170);
        p.investir();
        p.investir();
        
        gastos.incluirItem(p);
        
        double totalGastos = gastos.calcularTotalGastos();
        
        System.out.println("O valor total dos gastos é R$ " + totalGastos);
        
        System.out.println("Valor individual dos itens que devo gastar:");
        for (Desembolsavel itemPagavel : gastos.getItens()) {
            System.out.println(itemPagavel.calcularValorDesembolsar());
        }
        
        System.out.println("Investimentos previstos");
        for (Desembolsavel item : gastos.getItens()) { 
            if (item instanceof Investimento) {
                System.out.println("Saldo: " + ((Investimento) item).getSaldo());
            }            
        }
        
    }
    
}
