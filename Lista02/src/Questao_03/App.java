package Questao_03;

public class App {
    public static void main(String[] args) {
        
        Dado dado1 = new Dado(4);
        Dado dado2 = new Dado(6);
        Dado dado3 = new Dado(8);
        Dado dado4 = new Dado(12);
        Dado dado5 = new Dado(20);
        
        
        Dado[] conjuntoDados = {dado1, dado2, dado3, dado4, dado5};
        
        int[] resultados = Dado.jogarDados(conjuntoDados);
        
        for(int i: resultados){
            System.out.println(resultados[i]);
        }
    }
}
