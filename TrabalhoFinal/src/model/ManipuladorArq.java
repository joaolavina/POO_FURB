package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe responsável por manipular operações relacionadas a um arquivo e
 * gerenciamento de movimentações financeiras.
 *
 * @author Bernardo_Nicoletti, Guilherme_Pedroso, João_Lavina
 */
public abstract class ManipuladorArq {

    /**
     * Arquivo a ser manipulado.
     */
    private File arquivo;

    /**
     * Construtor que inicializa a instância do Manipulador.
     *
     * @param arq O caminho do arquivo a ser manipulado.
     * @throws IllegalArgumentException Se o arquivo não existe ou é um
     * diretório.
     */
    public ManipuladorArq(String arq) throws IllegalArgumentException {
        arquivo = new File(arq);

        if (!arquivo.exists()) {
            throw new IllegalArgumentException("O arquivo não existe.");
        } else if (arquivo.isDirectory()) {
            throw new IllegalArgumentException("O arquivo é um diretório");
        }
    }

    /**
     * Adiciona uma movimentação financeira ao arquivo.
     *
     * @param movAdd A movimentação financeira a ser adicionada
     * @throws IllegalArgumentException; Se ocorrer um erro durante a gravação
     * do arquivo.
     * @throws IllegalArgumentException; Se o arquivo não existir ou não for encontrado.
     */
    protected void addMovimentacaoArq(Movimentacao movAdd) {
        try (FileOutputStream fos = new FileOutputStream(arquivo, true);
                PrintWriter arquivoTexto = new PrintWriter(fos)) {
            
            arquivoTexto.println(movAdd);
           
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException("O arquivo não foi encontrado.");
        } catch (IOException e) {
            throw new IllegalArgumentException("Erro durante a gravação do arquivo.");
        } 
    }

    protected ArrayList<Movimentacao> lerArquivo() throws IllegalArgumentException{
        ArrayList<Movimentacao> arrayLocal = new ArrayList<>();

        try (Scanner scanner = new Scanner(arquivo)) {
            scanner.nextLine();

            while (scanner.hasNext()) {
                String[] dados = scanner.nextLine().split(";");

                Movimentacao m;

                String data[] = dados[2].split("/");
                int dia = Integer.parseInt(data[0]);
                int mes = Integer.parseInt(data[1]);
                int ano = Integer.parseInt(data[2]);
                double valor = Double.parseDouble(dados[3]);

                if (dados[0].trim().equalsIgnoreCase("DESPESA")) {
                    TipoDespesa tipo = TipoDespesa.valueOf(dados[1]);
                    m = new Despesa(dia, mes, ano, valor, tipo);
                } else if (dados[0].trim().equalsIgnoreCase("RECEITA")) {
                    TipoReceita tipo = TipoReceita.valueOf(dados[1]);
                    m = new Receita(dia, mes, ano, valor, tipo);
                } else {
                    m = null;
                }

                arrayLocal.add(m);
            }

            return arrayLocal;
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException("O arquivo não foi encontrado.");
        }
    }
}
