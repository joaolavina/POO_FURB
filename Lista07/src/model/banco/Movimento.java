package model.banco;

import java.time.LocalDate;
import java.time.LocalTime;

public class Movimento {
    
    private double valor;
    private TipoMovimento tipoMovimento;
    private LocalDate data;
    private LocalTime hora;
    
    public Movimento(double valor, TipoMovimento tipo){
        this.valor = valor;
        tipoMovimento = tipo;
        data = LocalDate.now();
        hora = LocalTime.now();
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public TipoMovimento getTipoMovimento() {
        return tipoMovimento;
    }

    public void setTipoMovimento(TipoMovimento tipoMovimento) {
        this.tipoMovimento = tipoMovimento;
    }

    public LocalDate getData() {
        return data;
    }
    
    public LocalTime getHora(){
        return hora;
    }

    @Override
    public String toString(){
        return "Tipo de movimento: " + getTipoMovimento() + "\n Data: " + getData() + "\n Hora: " + getHora() + "\n Valor: " + getValor();
    }       
    
}
