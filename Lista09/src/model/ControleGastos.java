package model;

import java.util.ArrayList;

public class ControleGastos {
    
    private ArrayList<Desembonsavel> itens = new ArrayList<>();
    
    public void incluirItem(Desembonsavel item){
        itens.add(item);
    }    
    
    public ArrayList<Desembonsavel> getItens(){
        return itens;
    }
    
    public double calcularTotalGasto(){
        double totalGasto = 0;
        for (Desembonsavel item: itens){
            totalGasto += item.calcularValorDesembolsar();
        }
        return totalGasto;
    }
}
