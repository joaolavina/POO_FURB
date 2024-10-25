package view.questao2;

import java.io.FileNotFoundException;
import model.questao2.*;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArquivoMp3 arquivo;
        TagMp3 tag;

        try {
            arquivo = new ArquivoMp3(input.nextLine());
            tag = arquivo.getTagMp3();
            System.out.println(tag.getTitulo());
            System.out.println(tag.getArtista());
            System.out.println(tag.getAlbum());
            System.out.println(tag.getAno());
            System.out.println(tag.getComentario());
            System.out.println(tag.getNumeroFaixa());
            System.out.println(tag.getGenero());
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        }
    }
}
