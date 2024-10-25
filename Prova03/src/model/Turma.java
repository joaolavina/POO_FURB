package model;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Turma {
    
    private List<Aluno> alunos = new ArrayList<>();

    public void lerDadosBinario(File f) throws IllegalArgumentException{
        try(FileInputStream fis = new FileInputStream(f);
            BufferedInputStream bis = new BufferedInputStream(fis);
            DataInputStream dis = new DataInputStream(bis)){
            
            while(true){
                Aluno a = new Aluno();
                
                a.setMatricula(dis.readInt());
                a.setNome(dis.readUTF());
                a.setNotaEnem(dis.readDouble());
                a.setDataNascimento(dis.readInt(), dis.readByte(),dis.readByte());         
                incluirAluno(a);
                }
            
        } catch (FileNotFoundException e){
            throw new IllegalArgumentException("Arquivo não foi encontrado.");
        } catch (EOFException e){
            
        } catch (IOException e){
            throw new IllegalArgumentException("Erro durante a leitura do arquivo");
        }
    }

    public List<Aluno> getAlunos() {
        return Collections.unmodifiableList(alunos);
    }
    
    public void incluirAluno(Aluno aluno){
        alunos.add(aluno);
    }
    
    public List<Aluno> obterAlunosOrdenados(){
        Collections.sort(alunos, new OrdenacaoAlunos());
        return Collections.unmodifiableList(alunos);
    }
    
    public void salvarDadosTexto(File f) throws IllegalArgumentException{
        try(PrintWriter arquivoTexto = new PrintWriter(f)){
            
            arquivoTexto.print("Matricula;Nome;Nota ENEM;Data Nascimento");
            
            for(Aluno a : alunos){
                int matricula = a.getMatricula();
                String nome = a.getNome();
                double notaEnem = a.getNotaEnem();
                arquivoTexto.println(matricula + ";" + nome + ";" + notaEnem + ";" + a.getDataNascimento());
            }
            
        } catch(FileNotFoundException e){
            throw new IllegalArgumentException("Arquivo não foi encontrado.");
        }
    }
}
