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
public class PontoTest {
    
    public PontoTest() {
    }

    private Ponto ponto;
    
    @Before
    public void criarPonto(){
        ponto = new Ponto();
    }
    
    // 1
    @Test
    public void testVerificarPonto1Quadrante() {
        ponto.setX(10);
        ponto.setY(5);
        assertTrue(ponto.identificarQuadrante() == Quadrante.PRIMEIRO);
    }
    
    // 2
    @Test
    public void testVerificarPonto2Quadrante(){
        ponto.setX(-10);
        ponto.setY(5);
        assertTrue(ponto.identificarQuadrante() == Quadrante.SEGUNDO);
    }
    
    // 3
    @Test
    public void testVerificarPonto3Quadrante(){
        ponto.setX(-10);
        ponto.setY(-5);
        assertTrue(ponto.identificarQuadrante() == Quadrante.TERCEIRO);
    }
    
    // 4
    @Test
    public void testVerificarPonto4Quadrante(){
        ponto.setX(10);
        ponto.setY(-5);
        assertTrue(ponto.identificarQuadrante() == Quadrante.QUARTO);
    }
    
    // 5
    @Test
    public void testVerificarPontoEmNenhumQuadrante1(){
        ponto.setX(0);
        ponto.setY(-5);
        assertTrue(ponto.identificarQuadrante() == Quadrante.NENHUM);
    }
    
    // 6 
    @Test
    public void testVerificarPontoEmNenhumQuadrante2(){
        ponto.setX(10);
        ponto.setY(0);
        assertTrue(ponto.identificarQuadrante() == Quadrante.NENHUM);
    }
    
    // 7 
    @Test
    public void testVerificarPontoIncidindoSobreEixoX(){
        ponto.setX(10);
        ponto.setY(0);
        assertTrue(ponto.estaIncidindoSobreX() == true);
    }    
    
    // 8
    @Test
    public void testVerificarPontoIncidindoSobreEixoY(){
        ponto.setX(0);
        ponto.setY(10);
        assertTrue(ponto.estaIncidindoSobreY() == true);
    }
    
    // 9 
    @Test
    public void testVerificarPontoNaoIncidindoSobreEixoX(){
        ponto.setX(-5);
        ponto.setY(10);
        assertTrue(ponto.estaIncidindoSobreX() == false);
    }
    
    // 10
    @Test
    public void testVerificarPontoNaoIncidindoSobreEixoY(){
        ponto.setX(-5);
        ponto.setY(10);
        assertTrue(ponto.estaIncidindoSobreY() == false);
    }
    
    // 11
    @Test
    public void testCalculoDistanciaEntrePontos(){
        ponto.setX(-10);
        ponto.setY(3);
                
        Ponto ponto2 = new Ponto(5,0);
        
        assertEquals(15.29,Ponto.CalcularDistancia(ponto, ponto2), 0.1);
    }
    
}
