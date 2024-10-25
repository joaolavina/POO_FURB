package model.banco;

import java.util.ArrayList;

public class ContaBancaria {
    private String numero;
    private Cliente titular;
    private double saldo;
    
    private static double limiteTransferencia;
    private ArrayList<Movimento> movimentos = new ArrayList<Movimento>();
    
    public ContaBancaria(){
 
    }
    
    public ContaBancaria(Cliente titular){
        setTitular(titular);
    }
    
    protected void incluirMovimento(Movimento m){
        movimentos.add(m);  
    }
    
    public void depositar(double valor){
        if( valor <= 0){
            throw new IllegalArgumentException("Não é possível depositar um valor negativo ou igual a zero");
        }
        else{
            saldo += valor;
            Movimento movimento = new Movimento(valor, TipoMovimento.CREDITO);
            incluirMovimento(movimento);
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
            Movimento movimento = new Movimento(valor, TipoMovimento.DEBITO);
            incluirMovimento(movimento);
        }
    }

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
           sacar(valor);
           destino.depositar(valor);
       }
    }

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
          origem.sacar(valor)         ;
          destino.depositar(valor);
       }
        
    }

    public void setNumero(String numero){
        this.numero = numero;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public static void setLimiteTransferencia(double limite){
        limiteTransferencia = limite;
    }

    protected void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public String getNumero(){
        return numero;
    }

    public Cliente getTitular(){
        return titular;
    }

    public double getSaldo(){
        return saldo;
    }

    public static double getLimiteTransferencia(){
        return limiteTransferencia;
    }
    
    public ArrayList<Movimento> getMovimento(){
        return movimentos;
    }
    
    @Override    
    public String toString(){
        return "Número: " + getNumero() + "\n Titular: " + getTitular() + "\n Saldo: " + getSaldo();
    }
}
