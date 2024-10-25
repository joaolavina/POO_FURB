package model.banco;

public class ContaEspecial extends ContaBancaria {

    private double limiteCredito;

    public ContaEspecial(String numero, Cliente titular, double limiteCredito) {
        setNumero(numero);
        setTitular(titular);
        setLimiteCredito(limiteCredito);
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Não é possível sacar um valor negativo ou igual a zero");
        } else if (valor > getSaldo() + getLimiteCredito()) {
            throw new IllegalArgumentException("Não é possível sacar um valor maior que o saldo");
        } else {
            if(valor > getSaldo()){
                setSaldo(getSaldo() - valor);
                limiteCredito -= getSaldo();
            }
            Movimento movimento = new Movimento(valor, TipoMovimento.DEBITO);
            incluirMovimento(movimento);
        }
    }
}
