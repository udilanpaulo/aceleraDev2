package br.com.codenation.main;

import br.com.codenation.domain.Aluno;
import br.com.codenation.domain.Disciplina;
import br.com.codenation.domain.Professor;
import br.com.codenation.repository.UsuarioRepository;

import java.security.spec.DSAGenParameterSpec;

public class Main {

    public static void main(String[] args) {
        Aluno aluno = new Aluno("Paulo", "074.441.436.92", "dilan");
        Aluno aluno1 = new Aluno("Ferreira", "456.456.785.980", "ferrerir");

        Professor professor = new Professor("Gustavo", "457.455.455.12", "gusteve");

        Disciplina disciplina = new Disciplina("OO I", professor);
        Disciplina disciplina1 = new Disciplina("OO2", professor);

        Professor professor1 = new Professor("Gustavo2", "123.123.456.65", "gust23");

        Disciplina disciplina2 = new Disciplina("Humanas", professor1);
        Disciplina disciplina3 = new Disciplina("Humnas2", professor1);

//        for (int i = 1; i < 11; i++) {
//            disciplina.matricular(new Aluno("Paulo_"+i,"123.123.123.92", "login"+i));
//        }
//
//        disciplina.mostarAlunos();

//        disciplina.mostrarNomesAlunos();

        UsuarioRepository usuarioRepository = new UsuarioRepository();
        usuarioRepository.insere(aluno);
        usuarioRepository.insere(aluno1);
        usuarioRepository.insere(professor);

        System.out.println("Exibir os professores:");
        usuarioRepository.mostrarProfessores();

        System.out.println("Exibir os usuarios:");
        usuarioRepository.mostrarUsuarios();

//        try {
//            Aluno aluno = new Aluno("Udilan", "074.441.436.92", "df");
//            System.out.println(aluno);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        finally {
//            System.out.println("Finalizado!");
//        }
    }
}
