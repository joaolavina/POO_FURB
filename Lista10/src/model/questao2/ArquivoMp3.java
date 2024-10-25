package model.questao2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ArquivoMp3 {

    TagMp3 tag = new TagMp3();

    public ArquivoMp3(String nomeArquivo) throws FileNotFoundException {
        File arquivo = new File(nomeArquivo);

        if (!arquivo.exists()) {
            throw new FileNotFoundException("Arquivo não existe");
            
        } else if (arquivo.isDirectory()) {
            throw new ArgumentoNaoEhArquivoException("Arquivo é um diretório");
        }

        try (FileInputStream fis = new FileInputStream(arquivo)) {
            byte[] dados = new byte[3];
            fis.skip(arquivo.length() - 128);
            fis.read(dados);
            String valor = new String(dados);

            if (!valor.equals("TAG")) {
                throw new ArquivoNaoTemTagMp3("Arquivo não possui TAG");
            }
            
            // nome msc
            dados = new byte[30];
            fis.read(dados);
            valor = new String(dados);
            tag.setTitulo(valor);

            // nome artista
            fis.read(dados);
            valor = new String(dados);
            tag.setArtista(valor);

            //album
            fis.read(dados);
            valor = new String(dados);
            tag.setAlbum(valor);

            // ano
            
            dados = new byte[4];
            fis.read(dados);
            valor = new String(dados);
            tag.setAno(Integer.parseInt(valor));

            // comentario
            dados = new byte[28];
            fis.read(dados);
            valor = new String(dados);
            tag.setComentario(valor);

            // nr faixa
            fis.skip(1);
            int dados_int =  fis.read();
            tag.setNumeroFaixa(dados_int);
            
            //genero
            dados = new byte[1];
            fis.read(dados);
            valor = new String(dados);
            tag.setGenero(valor);

        } catch (IOException e) {
            System.out.println("Algo de errado ocorreu durante a leitura do arquivo");
        }
    }

    public TagMp3 getTagMp3() {
        return tag;
    }

}
