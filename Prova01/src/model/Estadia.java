package model;

public class Estadia {
    private int horaEntrada;
    private int horaSaida;
    private boolean finalSemana;
    
    public Estadia(){
    }
    
    public Estadia(int horaEntrada, int horaSaida, boolean finalSemana){
        setHoraEntrada(horaEntrada);
        setHoraSaida(horaSaida);
        setFinalSemana(finalSemana);
    }
    
    public int getHoraEntrada(){
        return horaEntrada;
    }
    
    public void setHoraEntrada(int horaEntrada){
        if(horaEntrada < 0 || horaEntrada > 24){
            throw new IllegalArgumentException("Valor de hora inválido");
        }
        else{
            this.horaEntrada = horaEntrada;            
        }
    }
    
    public int getHoraSaida(){
        return horaSaida;
    }
    
    public void setHoraSaida(int horaSaida){
        if(horaSaida < 0 || horaSaida > 24){
            throw new IllegalArgumentException("Valor de hora inválido");
        }
        else{
            this.horaSaida = horaSaida;            
        }
    }
    
    public boolean isFinalSemana(){
        return finalSemana;
    }
    
    public void setFinalSemana(boolean finalSemana){
        this.finalSemana = finalSemana;
    }
    
    public int calcularTempoEstadia(){
        if(horaSaida > horaEntrada){
            return horaSaida - horaEntrada;
        }
        else{
            return (24 - horaEntrada) + horaSaida;
        }
    }
    
    public double calcularValorPago(){
        if(!finalSemana){
            if(calcularTempoEstadia() <= 4){
                return 10;
            }
            else{
                return 10 + (calcularTempoEstadia() - 4)*3;
            }
        }
        else{
            if(calcularTempoEstadia() <= 4){
                return 12;
            }
            else{
                return 12 + (calcularTempoEstadia() - 4)*3;
            }            
        }
    }
}