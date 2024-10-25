package Questao_03;

import java.util.Random;

public class Dado {
    
    private int numeroFaces;
    
    public Dado(int numeroFaces){
        this.numeroFaces = numeroFaces;
    }
    
    public int jogarDado(Dado dado){
        Random random = new Random();
        return random.nextInt(dado.numeroFaces) + 1;
    }
    
    public static int[] jogarDados(Dado[] dados){
        int[] resultados = new int[dados.length];
        for(int i = 0; i<dados.length; i++){
            Random random = new Random();
            resultados[i] = random.nextInt(dados[i].numeroFaces) + 1;
        }
        return resultados;
    }
}
