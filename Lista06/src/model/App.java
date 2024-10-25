package model;

public class App {
    public static void main(String[] args) {
        Turma turma = new Turma("História","250320");
        
        Aluno fabi = new Aluno();
        fabi.setNome("Fabi dos Santos");
        fabi.setNotaEnem(8.5);
        turma.incluirAlunos(fabi);
        
        Aluno gabriel = new Aluno ();
        gabriel.setNome("Gabriel de Souza");
        gabriel.setNotaEnem(7.5);
        turma.incluirAlunos(gabriel);
        
        Aluno antoni = new Aluno();
        antoni.setNome("Antoni Farias");
        antoni.setNotaEnem(8.5);
        turma.incluirAlunos(antoni);
        
        Aluno maria = new Aluno();
        maria.setNome("Maria Pereira");
        maria.setNotaEnem(8);
        turma.incluirAlunos(maria);
        
        Aluno camila = new Aluno();
        camila.setNome("Camila Amorim");
        camila.setNotaEnem(7.7);
        turma.incluirAlunos(camila);
        
        Aluno lucas = new Aluno();
        lucas.setNome("Lucas Nascimento");
        lucas.setNotaEnem(7);
        turma.incluirAlunos(lucas);

        System.out.println("Maior nota Enem: "+turma.obterMelhorNotaEnem());
        
        System.out.println();
        
        System.out.println("Alunos maior nota Enem: ");
        
        for(int i = 0; i < turma.obterAlunosMelhorNotaEnem().size(); i++){
            System.out.println(turma.obterAlunosMelhorNotaEnem().get(i).getNome());
        }
        
        System.out.println();
        
        turma.removerAlunos(antoni);
        System.out.println(turma.getAlunos().size());        
    }
}
