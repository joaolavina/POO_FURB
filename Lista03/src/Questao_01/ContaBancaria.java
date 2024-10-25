package Questao_01;

/**
 * Classe para fazer opera��es banc�rias em uma conta
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
    
    /** M�todo para fazer dep�sito na conta
    * @author JoaoLavina
    * @param valor - valor que ser� depositado na conta
    * @throws IllegalArgumentException - caso tente ser depositado um valor negativo ou igual a zero
    */
    public void depositar(double valor){
        if( valor <= 0){
            throw new IllegalArgumentException("N�o � poss�vel depositar um valor negativo ou igual a zero");
        }
        else{
            saldo += valor;
        }
    }
                         
    /** M�todo para realizar saques na conta
     * @author JoaoLavina
     * @param valor - valor que ser� sacado da conta
     * @throws IllegalArgumentException - caso tente ser sacado um valor negativo ou igual a zero
     * @throws IllegalArgumentException - caso tente ser sacado um valor maior que o saldo
     */
    public void sacar(double valor){
        if(valor <= 0){
            throw new IllegalArgumentException("N�o � poss�vel sacar um valor negativo ou igual a zero");
        }
        else if(valor > saldo){
            throw new IllegalArgumentException("N�o � poss�vel sacar um valor maior que o saldo");
        }
        else{
            saldo -= valor;
        }
    }
    
    /** M�todo para realizar transfer�ncias de uma conta para outra 
     * @author JoaoLavina
     * @param destino - conta destino da transfer�ncia
     * @param valor - valor que ser� transferido para a conta destino
     * @throws IllegalArgumentException - caso tente ser transferido um valor negativo ou igual a zero
     * @throws IllegalArgumentException - caso tente ser transferido um valor maior que o saldo da conta origem
     * @throws IllegalArgumentException - caso tente ser transferido um valor maior que o limite de transfer�ncia
     * @see setLimiteTransferencia()
     */
    public void transferir(ContaBancaria destino, double valor){
       if(valor <= 0){
           throw new IllegalArgumentException("N�o � poss�vel transferir um valor negativo ou igual a zero");
       }
       else if(valor > saldo){
           throw new IllegalArgumentException("N�o � poss�vel transferir um valor maior que o saldo");
       }
       else if(valor > limiteTransferencia){
           throw new IllegalArgumentException("N�o � poss�vel transferir um valor maior que o limite (R$" + limiteTransferencia+")");
       }
       else{
           saldo -= valor;
           destino.saldo += valor;
           
       }
    }
    
    /** M�todo para realizar transfer�ncias de uma conta para a outra sem instanciar a classe
     * @author JoaoLavina
     * @param origem - conta origem da transfer�ncia
     * @param destino - conta destino da transfer�ncia
     * @param valor - valor que ser� transferido
     * @throws IllegalArgumentException - caso tente ser transferido um valor negativo ou igual a zero
     * @throws IllegalArgumentException - caso tente ser transferido um valor maior que o saldo da conta origem
     * @throws IllegalArgumentException - caso tente ser transferido um valor amior que o limite de transfer�ncia
     * @see setLimiteTransferencia()
     */
    public static void transferir(ContaBancaria origem, ContaBancaria destino, double valor){
        if(valor <= 0){
           throw new IllegalArgumentException("N�o � poss�vel transferir um valor negativo ou igual a zero");
       }
       else if(valor > origem.saldo){
           throw new IllegalArgumentException("N�o � poss�vel transferir um valor maior que o saldo");
       }
       else if(valor > limiteTransferencia){
           throw new IllegalArgumentException("N�o � poss�vel transferir um valor maior que o limite (R$" + limiteTransferencia+")");
       }
       else {
          origem.saldo -= valor;
          destino.saldo += valor;
       }
        
    }
    
    /** M�todo setter do n�mero da conta
     * @author JoaoLavina
     * @param numero - String que ser� defininada como n�mero da conta
     */
    public void setNumero(String numero){
        this.numero = numero;
    }
    
    /** M�todo setter do titular da conta
     * @author JoaoLavina
     * @param titular - String que ser� definida como titular da conta
     */
    public void setTitular(String titular){
        this.titular = titular;
    }
    
    /** M�todo setter do limite de transfer�ncia
     * @author JoaoLavina
     * @param limite - double que ser� definido como limite de transfer�ncia
     */
    public static void setLimiteTransferencia(double limite){
        limiteTransferencia = limite;
    }
    
    /** M�todo getter do n�mero da conta
     * @author JoaoLavina
     * @return String - n�mero da conta
     */
    public String getNumero(){
        return numero;
    }
    
    /** M�todo getter do titular da conta
     * @author JoaoLavina
     * @return String - titular da conta
     */
    public String getTitular(){
        return titular;
    }
    
    /** M�todo getter do saldo da conta
     * @author JoaoLavina
     * @return double - saldo da conta
     */
    public double getSaldo(){
        return saldo;
    }
    
    /** M�todo getter do limite de transfer�ncia
     * @author JoaoLavina
     * @return double - limite de transfer�ncia
     */
    public static double getLimiteTransferencia(){
        return limiteTransferencia;
    }
}
