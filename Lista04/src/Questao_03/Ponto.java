package Questao_03;

public class Ponto {
    private int x;
    private int y;
    
    public Ponto(){
        x = 0;
        y = 0;          
    }

    public Ponto(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public Quadrante identificarQuadrante(){
        if(x==0 || y==0){
            return Quadrante.NENHUM;
        }
        else if(x>0 && y>0){
            return Quadrante.PRIMEIRO;
        }
        else if(x<0 && y>0){
            return Quadrante.SEGUNDO;
        }
        else if(x<0 && y<0){
            return Quadrante.TERCEIRO;
        }
        else {
            return Quadrante.QUARTO;
        }
    }
    
    public boolean estaIncidindoSobreX(){
        if(y == 0)
            return true;
        else 
            return false;
        
    }
    
    
        public boolean estaIncidindoSobreY(){
        if(x == 0)
            return true;
        else 
            return false;
        
    }
    
    public double calcularDistancia(Ponto outroPonto){
        return Math.sqrt((Math.pow(this.x - outroPonto.x, 2))+(Math.pow(this.y - outroPonto.y,2)));
    }
    
    public static double CalcularDistancia(Ponto ponto1, Ponto ponto2){
        return Math.sqrt((Math.pow(ponto1.x - ponto2.x, 2))+(Math.pow(ponto1.y - ponto2.y,2)));
    }
        
    public void setX(int x){
        this.x = x;
    }
    
    public void setY(int y){
        this.y = y;
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
}
