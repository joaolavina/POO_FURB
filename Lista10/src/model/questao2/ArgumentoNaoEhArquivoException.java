package model.questao2;

public class ArgumentoNaoEhArquivoException extends IllegalArgumentException{
    
    public ArgumentoNaoEhArquivoException(String arquivo){
            super(arquivo);
    } 
}
