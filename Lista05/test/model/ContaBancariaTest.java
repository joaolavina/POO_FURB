/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package model;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author jg_la
 */
public class ContaBancariaTest {
    
    private ContaBancaria conta;
    
    @Before
    public void createContaBancaria(){
        conta = new ContaBancaria();
    }

    // 1
    @Test
    public void testDeposito() {
        conta.depositar(500);
        assertEquals(500,conta.getSaldo(),0.0001);
    }
    
    // 2
    @Test(expected=IllegalArgumentException.class)
    public void testRecusarDepositoNegativo(){
        conta.depositar(50);
    }
    
    // 3
    @Test(expected=IllegalArgumentException.class)
    public void testRecusarDepositoIgualAZero(){
        conta.depositar(0);
    }
    
    // 4
    @Test
    public void testVerificarSaldoAposDeposito(){
        conta.depositar(500);
        conta.sacar(200);
        assertEquals(300,conta.getSaldo(),0.0001);
    }
    
    // 5
    @Test(expected=IllegalArgumentException.class)
    public void testRecusarSaqueNegativo(){
        conta.depositar(500);
        conta.sacar(-50);
    }
    
    // 6
    @Test(expected=IllegalArgumentException.class)
    public void testRecusarSaqueIgualAZero(){
        conta.depositar(500);
        conta.sacar(0);
    }
    
    // 7 
    @Test(expected=IllegalArgumentException.class)
    public void testRecusarSaqueMaiorQueSaldo(){
        conta.depositar(500);
        conta.sacar(500.01);
    }

    // 8
    @Test
    public void testVerificarTransferencia(){
        ContaBancaria conta2 = new ContaBancaria();
        
        ContaBancaria.setLimiteTransferencia(1000);
        
        conta.depositar(500);
        conta.transferir(conta2,200);
        assertEquals(300, conta.getSaldo(),0.0001);
        assertEquals(200,conta2.getSaldo(),0.0001);
    }
    
    // 9
    @Test(expected=IllegalArgumentException.class)
    public void testRecusarTransferenciaMaiorQueOSaldo(){
        ContaBancaria conta2 = new ContaBancaria();
        
        ContaBancaria.setLimiteTransferencia(100);
        
        conta.depositar(500);
        conta.transferir(conta2,500.01);
    }
}
