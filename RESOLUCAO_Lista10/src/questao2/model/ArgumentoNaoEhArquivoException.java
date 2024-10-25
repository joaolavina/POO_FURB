package questao2.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gilva
 */
public class ArgumentoNaoEhArquivoException extends IllegalArgumentException {
    
    public ArgumentoNaoEhArquivoException(String arquivo) {
        super(arquivo);
    }
    
}
