package view;

import model.*;

public class App {
    public static void main(String[] args) {
        Banco b = new Banco("src//contas.bin");
        
        b.lerArquivo();
        
        System.out.println("Quantidade contas: " + b.getContas().size());
        
        System.out.println("Conta com maior saldo: \n" + b.maiorSaldo());
        
        System.out.println("Conta com menor saldo: \n" + b.menorSaldo());
    }
}
