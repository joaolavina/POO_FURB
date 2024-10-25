package model.questao1;

import java.util.ArrayList;

public class ControleGastos {
    
    private ArrayList<Desembolsavel> itens = new ArrayList<>();
    
    public void incluirItem(Desembolsavel item) {
        itens.add(item);
    }

    public ArrayList<Desembolsavel> getItens() {
        return itens;
    }
    
    public double calcularTotalGastos() {
        double total = 0;
        
        for (Desembolsavel p : itens) {
            total = total + p.calcularValorDesembolsar();
        }
        
        return total;
    }
    
}
