package model;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Banco {

    private List<ContaBancaria> contas;

    private File arquivo;

    public Banco(String arq) throws IllegalArgumentException {
        arquivo = new File(arq);
        contas = new ArrayList<>();

        if (!arquivo.exists()) {
            throw new IllegalArgumentException("Arquivo não existe.");
        } else if (arquivo.isDirectory()) {
            throw new IllegalArgumentException("Arquivo é um diretório");
        }
    }

    public void lerArquivo() throws IllegalArgumentException {
        ContaBancaria conta = null;
        String numero = "";
        String titular = "";
        double saldo = 0;

        try (FileInputStream fis = new FileInputStream(arquivo); BufferedInputStream bis = new BufferedInputStream(fis); DataInputStream dis = new DataInputStream(bis)) {

            while (true) {
                numero = dis.readUTF();
                titular = dis.readUTF();
                saldo = dis.readDouble();
                conta = new ContaBancaria(numero, titular, saldo);

                contas.add(conta);
            }

        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException("Arquivo não existe.");
        } catch (EOFException e) {

        } catch (IOException e) {
            throw new IllegalArgumentException("Erro durante a leitura do arquivo.");
        }
    }

    public String maiorSaldo() {
        String maior = "";
        double maiorSaldo = Double.MIN_VALUE;

        for (ContaBancaria c : getContas()) {
            if (maiorSaldo < c.getSaldo()) {
                maior = "N�mero:  " + c.getNumero() + "\nTitular: " + c.getTitular();
                maiorSaldo = c.getSaldo();
            }
        }

        return maior;
    }

    public String menorSaldo() {
        String menor = "";
        double menorSaldo = Double.MAX_VALUE;

        for (ContaBancaria c : getContas()) {
            if (menorSaldo > c.getSaldo()) {
                menor = "N�mero:  " + c.getNumero() + "\nTitular: " + c.getTitular();
                menorSaldo = c.getSaldo();
            }
        }

        return menor;
    }

    public void addConta(ContaBancaria conta) {
        contas.add(conta);
    }

    public List<ContaBancaria> getContas() {
        return Collections.unmodifiableList(contas);
    }
}
