/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao2.view;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import questao2.model.ArgumentoNaoEhArquivoException;
import questao2.model.ArquivoMp3;
import questao2.model.ArquivoNaoTemTagMp3;
import questao2.model.TagMp3;

/**
 *
 * @author gilva
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String nomeArquivo = "D:\\Músicas\\Nacional\\2022\\Os Paralamas Do Sucesso - Meu Erro.mp3";
        try {
            ArquivoMp3 arquivo = new ArquivoMp3(nomeArquivo);
            TagMp3 tag = arquivo.getTagMp3();
            System.out.println("Título: " + tag.getTitulo());
            System.out.println("Artista: " + tag.getArtista());
            System.out.println("Album: " + tag.getAlbum());
            System.out.println("Ano: " + tag.getAno());
            System.out.println("Comentário: "+ tag.getComentario());
        } catch (ArquivoNaoTemTagMp3 e) {
            System.out.println("O arquivo não tem TAG MP3");
        } catch (ArgumentoNaoEhArquivoException e) {
            System.out.println("O arquivo submentido não é um arquivo no formato MP3: " +
                    e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println("Não encontrou o arquivo");
        }
        
    }
    
}
