package Questao_01;

/**
 * Classe para fazer operações bancárias em uma conta
 * @author JoaoLavina
 */

public class ContaBancaria {
    private String numero;
    private String titular;
    private double saldo;
    
    private static double limiteTransferencia;
 
    public ContaBancaria(){
 
    }
    
    public ContaBancaria(String titular){
        setTitular(titular);
    }
    
    /** Método para fazer depósito na conta
    * @author JoaoLavina
    * @param valor - valor que será depositado na conta
    * @throws IllegalArgumentException - caso tente ser depositado um valor negativo ou igual a zero
    */
    public void depositar(double valor){
        if( valor <= 0){
            throw new IllegalArgumentException("Não é possível depositar um valor negativo ou igual a zero");
        }
        else{
            saldo += valor;
        }
    }
                         
    /** Método para realizar saques na conta
     * @author JoaoLavina
     * @param valor - valor que será sacado da conta
     * @throws IllegalArgumentException - caso tente ser sacado um valor negativo ou igual a zero
     * @throws IllegalArgumentException - caso tente ser sacado um valor maior que o saldo
     */
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
    
    /** Método para realizar transferências de uma conta para outra 
     * @author JoaoLavina
     * @param destino - conta destino da transferência
     * @param valor - valor que será transferido para a conta destino
     * @throws IllegalArgumentException - caso tente ser transferido um valor negativo ou igual a zero
     * @throws IllegalArgumentException - caso tente ser transferido um valor maior que o saldo da conta origem
     * @throws IllegalArgumentException - caso tente ser transferido um valor maior que o limite de transferï¿½ncia
     * @see setLimiteTransferencia()
     */
    public void transferir(ContaBancaria destino, double valor){
       if(valor <= 0){
           throw new IllegalArgumentException("Não é possível transferir um valor negativo ou igual a zero");
       }
       else if(valor > saldo){
           throw new IllegalArgumentException("Não é possível transferir um valor maior que o saldo");
       }
       else if(valor > limiteTransferencia){
           throw new IllegalArgumentException("Não é possível transferir um valor maior que o limite (R$" + limiteTransferencia+")");
       }
       else{
           saldo -= valor;
           destino.saldo += valor;
           
       }
    }
    
    /** Método para realizar transferï¿½ncias de uma conta para a outra sem instanciar a classe
     * @author JoaoLavina
     * @param origem - conta origem da transferência
     * @param destino - conta destino da transferência
     * @param valor - valor que será transferido
     * @throws IllegalArgumentException - caso tente ser transferido um valor negativo ou igual a zero
     * @throws IllegalArgumentException - caso tente ser transferido um valor maior que o saldo da conta origem
     * @throws IllegalArgumentException - caso tente ser transferido um valor amior que o limite de transferï¿½ncia
     * @see setLimiteTransferencia()
     */
    public static void transferir(ContaBancaria origem, ContaBancaria destino, double valor){
        if(valor <= 0){
           throw new IllegalArgumentException("Não é possível transferir um valor negativo ou igual a zero");
       }
       else if(valor > origem.saldo){
           throw new IllegalArgumentException("Não é possível transferir um valor maior que o saldo");
       }
       else if(valor > limiteTransferencia){
           throw new IllegalArgumentException("Não é possível transferir um valor maior que o limite (R$" + limiteTransferencia+")");
       }
       else {
          origem.saldo -= valor;
          destino.saldo += valor;
       }
        
    }
    
    /** Método setter do número da conta
     * @author JoaoLavina
     * @param numero - String que será defininada como número da conta
     */
    public void setNumero(String numero){
        this.numero = numero;
    }
    
    /** Método setter do titular da conta
     * @author JoaoLavina
     * @param titular - String que será definida como titular da conta
     */
    public void setTitular(String titular){
        this.titular = titular;
    }
    
    /** Método setter do limite de transferência
     * @author JoaoLavina
     * @param limite - double que será definido como limite de transferência
     */
    public static void setLimiteTransferencia(double limite){
        limiteTransferencia = limite;
    }
    
    /** Método getter do número da conta
     * @author JoaoLavina
     * @return String - número da conta
     */
    public String getNumero(){
        return numero;
    }
    
    /** Método getter do titular da conta
     * @author JoaoLavina
     * @return String - titular da conta
     */
    public String getTitular(){
        return titular;
    }
    
    /** Método getter do saldo da conta
     * @author JoaoLavina
     * @return double - saldo da conta
     */
    public double getSaldo(){
        return saldo;
    }
    
    /** Método getter do limite de transferência
     * @author JoaoLavina
     * @return double - limite de transferência
     */
    public static double getLimiteTransferencia(){
        return limiteTransferencia;
    }
}
