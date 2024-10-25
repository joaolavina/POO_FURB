public class ContaBancaria {
    private String numero;
    private String titular;
    private double saldo;
    
    public void depositar(double valor){
        if( valor <= 0){
            throw new IllegalArgumentException("Não é possível depositar um valor negativo ou igual a zero");
        }
        else{
            saldo += valor;
        }
    }
    
    public void sacar(double valor){
        if(valor <= 0){
            throw new IllegalArgumentException("Não é possível sacar um valor negativo ou igual a zero");
        }
        else if(valor > saldo){
            throw new IllegalArgumentException("Não é possível sacar um valor maior que o saldo");
        }
        else{
            saldo -= valor;
        }
    }
    
    public void transferir(ContaBancaria contaDestino, double valor){
       if(valor <= 0){
           throw new IllegalArgumentException("Não é possível depositar um valor negativo ou igual a zero");
       }
       else if(valor > saldo){
           throw new IllegalArgumentException("Não é possível depositar um valor maior que o saldo");
       }
       else{
           saldo -= valor;
           contaDestino.saldo += valor;
           
       }
    }
    
    public void setNumero(String numero){
        this.numero = numero;
    }
    
    public void setTitular(String titular){
        this.titular = titular;
    }
    
    public String getNumero(){
        return numero;
    }
    
    public String getTitular(){
        return titular;
    }
    
    public double getSaldo(){
        return saldo;
    }
}
