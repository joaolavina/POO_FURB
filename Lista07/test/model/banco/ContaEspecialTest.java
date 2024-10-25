/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package model.banco;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jg_la
 */
public class ContaEspecialTest {

    public ContaEspecialTest() {
    }

    @Test
    public void verificarSacarSaldoNegativo() {
        Cliente eduardo = new Cliente();
        ContaEspecial conta = new ContaEspecial("14", eduardo, 100);

        conta.depositar(20);
        conta.sacar(50);
        assertEquals(-30, conta.getSaldo(), 0.0001);
    }

    @Test
    public void verificarSacarCredito() {
        Cliente eduardo = new Cliente();
        ContaEspecial conta = new ContaEspecial("14", eduardo, 100);

        conta.depositar(20);
        conta.sacar(120);

        assertEquals(-100, conta.getSaldo(), 0.0001);
    }

    @Test(expected=IllegalArgumentException.class)
    public void verificarSacarMaiorQueSaldoECredito() {
        Cliente eduardo = new Cliente();
        ContaEspecial conta = new ContaEspecial("14", eduardo, 100);

        conta.depositar(20);
        conta.sacar(120.01);
    }
}
