package Questao_01;

public class App {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.setTitular("Beatriz");
        
        conta1.depositar(10000);
        
        ContaBancaria conta2 = new ContaBancaria("Lucas");
        ContaBancaria.setLimiteTransferencia(1000);
        
        ContaBancaria.transferir(conta1, conta2, 200);
        
        System.out.println(conta1.getSaldo());
        System.out.println(conta2.getSaldo());
        
        conta1.transferir(conta2, 2000);
    }
}
