package model.questao1;

import java.io.File;
import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        File diretorio = null;
        File[] arquivos = null;

        while (true) {
            try {
                diretorio = new File(input.nextLine());

//            if(!diretorio.isDirectory()){
//                throw new IllegalArgumentException("O caminho não é de um diretório");
//            }
                arquivos = diretorio.listFiles();

                double tamanhoTotal = 0;

                for (File arq : arquivos) {
                    if (arq.isDirectory()) {
                        System.out.println("Diretório: " + arq.getName()
                                + "\n Tamanho: " + (arq.length() / 1024) / 1024 + " megabytes.");
                    } else {
                        System.out.println("Arquivo: " + arq.getName()
                                + "\n Tamanho: " + (arq.length() / 1024) / 1024 + " megabytes.");
                    }

                    tamanhoTotal += arq.length();
                }

                System.out.println("Tamanho total do diretório: " + (tamanhoTotal / 1048) / 1048);
            }
            catch(java.lang.NullPointerException e){
                System.out.println("O diretório informado não existe");
            }
        }

    }
}
