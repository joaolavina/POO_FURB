package model;

import java.util.ArrayList;

public class Voo {

    private int quantidadePassageirosAtuais;
    private Aviao aviao;
    private ArrayList<Pesavel> itensEmbarcados = new ArrayList<>();

    public Voo(Aviao aviao) {
        this.aviao = aviao;
    }

    public ArrayList<Pesavel> getItensEmbarcados() {
        return itensEmbarcados;
    }

    public void embarcar(Pesavel item) {
        for (Pesavel p : itensEmbarcados) {
            if (p instanceof Passageiro && ((Passageiro) p).getAssento().equals(((Passageiro) item).getAssento())) {
                throw new IllegalArgumentException("Assento já ocupado no voo!");
            }
        }
        
        if (quantidadePassageirosAtuais == aviao.getNumeroAssentos()) {
            throw new IllegalArgumentException("Quantidade de passageiros máxima atingida!");
        } else if (obterPesoBagagens() + obterPesoPessoas() + item.getPeso() > aviao.getPesoMaximo()) {
            throw new IllegalArgumentException("Peso máximo do avião ultrapassado!");
        } else {
            itensEmbarcados.add(item);
            if (item instanceof Pessoa) {
                quantidadePassageirosAtuais++;
            }
        }
    }

    public double obterPesoBagagens() {
        double pesoBagagens = 0;
        for (Pesavel p : itensEmbarcados) {
            if (p instanceof Bagagem) {
                pesoBagagens += ((Bagagem) p).getPeso();
            }
        }
        return pesoBagagens;
    }

    private double obterPesoPessoas() {
        double pesoPessoas = 0;
        for (Pesavel p : itensEmbarcados) {
            if (p instanceof Pessoa) {
                pesoPessoas += ((Pessoa) p).getPeso();
            }
        }
        return pesoPessoas;
    }
}
