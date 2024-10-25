package model;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Leitor {

    private Scanner arqTexto;
    private File arquivo;

    private ArrayList<Cidade> cidades = new ArrayList<>();

    public Leitor(String caminho) throws IllegalArgumentException {
        arquivo = new File(caminho);

        if (!arquivo.exists()) {
            throw new IllegalArgumentException("Arquivo não existe");
        } else if (arquivo.isDirectory()) {
            throw new IllegalArgumentException("Arquivo é um diretório, não um arquivo bobo");
        }

    }

    public void lerArquivo() throws IllegalArgumentException {
        try {

            arqTexto = new Scanner(arquivo, "UTF-8");

            arqTexto.nextLine();
            Cidade cidade;

            while (arqTexto.hasNext()) {
                String[] dadosCidade = arqTexto.nextLine().split(";");
                int cdIBGE = Integer.parseInt(dadosCidade[0]);
                String nomeCidade = dadosCidade[1];
                String estado = dadosCidade[2];
                int populacao = Integer.parseInt(dadosCidade[3]);
                cidade = new Cidade(cdIBGE, nomeCidade, estado, populacao);
                incluirCidade(cidade);
            }
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException("Arquivo não existe");
        } finally {
            arqTexto.close();
        }

    }

    public String getCidadeMaiorPopulacao() {

        int maiorPopulacao = Integer.MIN_VALUE;
        String nomeMaior = "";

        for (Cidade c : cidades) {
            if (c.getPopulacao() > maiorPopulacao) {
                maiorPopulacao = c.getPopulacao();
                nomeMaior = c.getNomeCidade();
            }
        }
        return "Nome :" + nomeMaior + "\nPopulação" + maiorPopulacao;
    }

    public String getCidadeMenorPopulacao() {

        int menorPopulacao = Integer.MAX_VALUE;
        String nomeMenor = "";

        for (Cidade c : cidades) {
            if (c.getPopulacao() < menorPopulacao) {
                menorPopulacao = c.getPopulacao();
                nomeMenor = c.getNomeCidade();
            }
        }
        return "Nome :" + nomeMenor + "\nPopulação" + menorPopulacao;
    }

    public void Serializar(String arq) throws IllegalArgumentException {
        File arquivoSerializar = new File(arq);

        try (FileOutputStream fos = new FileOutputStream(arquivoSerializar); ObjectOutputStream o = new ObjectOutputStream(fos)) {
            for (Cidade c : cidades) {
                o.writeObject(c);
            }
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException("Arquivo não encontrado.");
        } catch (IOException e) {
            throw new IllegalArgumentException("Erro durante a escrita do arquivo.");
        }

    }

    public List<Cidade> Desserializar(String arq) throws IllegalArgumentException {
        List<Cidade> cidadess = new ArrayList<>();
        Cidade c;
        File arquivoDesserializar = new File(arq);

        try (FileInputStream fis = new FileInputStream(arquivoDesserializar); ObjectInputStream ois = new ObjectInputStream(fis)) {

            while (true) {
                c = (Cidade) ois.readObject();
                cidadess.add(c);
            }

        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException("Arquivo nÃ£o existe.");
        } catch (NotSerializableException | EOFException e) {

        } catch (IOException e) {
            throw new IllegalArgumentException("Erro durante a leitura do arquivo.");
        } catch (ClassNotFoundException e) {
            throw new IllegalArgumentException(" Classe não existe");
        }

        return cidadess;
    }

    private void incluirCidade(Cidade cidade) {
        cidades.add(cidade);
    }
}
