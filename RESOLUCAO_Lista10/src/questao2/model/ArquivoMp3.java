package questao2.model;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ArquivoMp3 {
    
    private TagMp3 tag;

    private String extrairString(byte [] dados, int inicio, int qtdeBytes) {
        byte[] str = new byte[qtdeBytes];
        
        for (int i = 0; i < qtdeBytes; i++) {
            str[i] = dados[inicio+i];
        }
        
        return new String(str);
    }
    
    public ArquivoMp3(String nomeArquivo) throws FileNotFoundException, IOException {
        File arquivo;
        arquivo = new File(nomeArquivo);
        if (!arquivo.exists())
            throw new FileNotFoundException(nomeArquivo);
        
        if (!arquivo.isFile())
            throw new ArgumentoNaoEhArquivoException(nomeArquivo);
        
        byte[] metadata = new byte[128];
        try (FileInputStream f = new FileInputStream(arquivo)) {
            f.skip( arquivo.length()-128 );
            f.read(metadata);
        }
        
        String cabecalhoMp3 = extrairString(metadata, 0, 3);
        
        if (!cabecalhoMp3.equals("TAG")) {
            throw new ArquivoNaoTemTagMp3(nomeArquivo);
        }
        
        tag = new TagMp3();
        tag.setTitulo(extrairString(metadata, 3, 30));
        tag.setArtista(extrairString(metadata, 33, 30));
        tag.setAlbum(extrairString(metadata, 63, 30));
        try {
            tag.setAno(Integer.parseInt(extrairString(metadata, 93, 4)));
        } catch (NumberFormatException e) {
        }
        tag.setComentario(extrairString(metadata, 97, 28));
    }

    public TagMp3 getTagMp3() {
        return tag;
    }
    
    
}
