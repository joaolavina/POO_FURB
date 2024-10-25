package view;

import model.ControleGastos;
import model.Despesa;
import model.ContaAgua;
import model.Desembonsavel;
import model.MensalidadeEnsino;
import model.PrevidenciaPrivada;
import model.Investimento;
import model.Teclado;

public class App {
    public static void main(String[] args) {
        ControleGastos gastos = new ControleGastos();
     
        Despesa agua = new ContaAgua(100,1.2);
        Despesa mensalidade = new MensalidadeEnsino(15,64.4);
        Investimento previdencia = new PrevidenciaPrivada();
        
        ((PrevidenciaPrivada)previdencia).setValorPadraoInvestimento(170);
        ((PrevidenciaPrivada)previdencia).investir();
        ((PrevidenciaPrivada)previdencia).investir();
        
        gastos.incluirItem(agua);
        gastos.incluirItem(mensalidade);
        gastos.incluirItem(previdencia);
        
        System.out.println("Total gastos R$" + gastos.calcularTotalGasto());
              
        for(Desembonsavel i: gastos.getItens()){
            if(i instanceof Investimento){
                System.out.println("Investimento: R$" + ((Investimento) i).getSaldo());
            }
        }
        
        Teclado teclado = new Teclado();
        
        teclado.lerInt();
        teclado.lerDouble();
        System.out.println(teclado.lerBoolean());
    }
}
