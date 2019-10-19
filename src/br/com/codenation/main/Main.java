package br.com.codenation.main;

import br.com.codenation.domain.Aluno;
import br.com.codenation.domain.Disciplina;
import br.com.codenation.domain.Professor;
import br.com.codenation.repository.DataLoader;
import br.com.codenation.repository.UsuarioRepository;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
        Aluno aluno = new Aluno("Paulo", "074.441.436.92", "dilan", LocalDate.of(1986, Month.DECEMBER, 23));
        Aluno aluno1 = new Aluno("Ferreira", "456.456.785.980", "ferrerir", LocalDate.of(1984, Month.FEBRUARY, 15));
        Aluno aluno2 = new Aluno("Pedro", "456.456.785.456", "pedrinho", LocalDate.of(1975, Month.FEBRUARY, 15));

        DataLoader dataLoader = new DataLoader();
        dataLoader.inserirUsuario(aluno);
        dataLoader.inserirUsuario(aluno1);
        dataLoader.inserirUsuario(aluno2);

        dataLoader.exibirMeida();

//        Professor professor = new Professor("Gustavo", "457.455.455.12", "gusteve", LocalDate.of(1972, Month.JULY, 30));
//
//        Disciplina disciplina = new Disciplina("OO I", professor);

//        for (int i = 1; i < 11; i++) {
//            disciplina.matricular(new Aluno("Paulo_"+i,"123.123.123.92", "login"+i));
//        }
//
//        disciplina.mostarAlunos();

//        disciplina.mostrarNomesAlunos();

//        UsuarioRepository usuarioRepository = new UsuarioRepository();
//        usuarioRepository.insere(aluno);
//        usuarioRepository.insere(aluno1);
//        usuarioRepository.insere(professor);
//
//        System.out.println("Exibir os professores:");
//        usuarioRepository.mostrarProfessores();
//
//        System.out.println("Exibir os usuarios:");
//        usuarioRepository.mostrarUsuarios();

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
