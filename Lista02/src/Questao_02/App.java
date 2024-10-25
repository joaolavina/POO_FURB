import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        
        conta.depositar(500);
        System.out.println(conta.getSaldo());
    }
}
