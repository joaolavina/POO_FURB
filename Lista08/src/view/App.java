package view;

import model.Empresa;
import model.Funcionario;
import model.Programador;
import model.Vendedor;
import model.Venda;

public class App {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("KFC");
        
        Vendedor luizVendedor = new Vendedor("Luiz", 1000, 10);
        Venda vendaLuiz1 = new Venda(200);
        Venda vendaLuiz2 = new Venda(100);
        luizVendedor.incluirVenda(vendaLuiz1);
        luizVendedor.incluirVenda(vendaLuiz2);
        empresa.incluirFuncionario(luizVendedor);
        
        Vendedor paulaVendedora = new Vendedor("Paula", 1200, 7);
        Venda vendaPaula1 = new Venda(500);
        Venda vendaPaula2 = new Venda(350);
        Venda vendaPaula3 = new Venda(280);
        paulaVendedora.incluirVenda(vendaPaula1);
        paulaVendedora.incluirVenda(vendaPaula2);
        paulaVendedora.incluirVenda(vendaPaula3);
        empresa.incluirFuncionario(paulaVendedora);
        
        Programador julioProgramador = new Programador("Julio", 1000);
        julioProgramador.incluirLinguagem("C");
        julioProgramador.incluirLinguagem("Java");
        empresa.incluirFuncionario(julioProgramador);
        
        Programador anaProgramadora = new Programador("Ana", 1000);
        anaProgramadora.incluirLinguagem("Java");
        anaProgramadora.incluirLinguagem("C#");
        empresa.incluirFuncionario(anaProgramadora);
        
        Programador andersonProgramador = new Programador("Anderson",1200);
        andersonProgramador.incluirLinguagem("Python");
        empresa.incluirFuncionario(andersonProgramador);
        
        Funcionario joseFuncionario = new Funcionario("José", 1000);
        empresa.incluirFuncionario(joseFuncionario);
        
        Funcionario mariaFuncionaria = new Funcionario("Maria", 1400);
        empresa.incluirFuncionario(mariaFuncionaria);
        
        System.out.println("Gasto com salários: " + empresa.calcularCustosSalarios()); 
        System.out.println();
        
        for(Funcionario f : empresa.getFuncionarios()){
            System.out.println("Nome: " + f.getNome() + "\n Salário: R$" + f.calcularSalario());
        }
        
        for(Funcionario v : empresa.getFuncionarios()){
            if(v instanceof Vendedor){
                System.out.println("Nome: " + v.getNome() + "\n Percentual de comissão: " + ((Vendedor)v).getPercentualComissao() + "%");
            }
        }
     
        for(Funcionario p : empresa.getFuncionarios()){
            if(p instanceof Programador){
                System.out.println("Nome: " + p.getNome() + "\n Linguagens: " + ((Programador)p).getLinguagens());
            }
        }
    }
}
