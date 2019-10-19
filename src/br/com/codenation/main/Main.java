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
        Aluno aluno1 = new Aluno("Ferreira", "456.456.785.98", "ferrerir", LocalDate.of(1984, Month.FEBRUARY, 15));
        Aluno aluno2 = new Aluno("Pedro", "456.456.785.45", "pedrinho", LocalDate.of(1975, Month.FEBRUARY, 15));
        Aluno aluno3 = new Aluno("Pedro1", "456.456.785.45", "pedrinho1", LocalDate.of(1995, Month.FEBRUARY, 15));
        Aluno aluno4 = new Aluno("Pedro2", "456.456.785.45", "pedrinho2", LocalDate.of(1985, Month.FEBRUARY, 15));

        Professor prof = new Professor("Gustavo", "123.456.784.92","professor0", LocalDate.of(1969, Month.JANUARY, 13));
        Professor prof2 = new Professor("Gustavo2", "123.456.784.93","professor2", LocalDate.of(1959, Month.JANUARY, 13));
        Professor prof3 = new Professor("Gustavo3", "123.456.784.94","professor3", LocalDate.of(1968, Month.JANUARY, 13));

        Disciplina biologias = new Disciplina("biologicas", prof, Disciplina.Tipo.BIOLOGICAS);
        biologias.matricular(aluno);
        biologias.matricular(aluno1);

        Disciplina humanas = new Disciplina("humanas", prof2, Disciplina.Tipo.HUMANAS);
        humanas.matricular(aluno2);
        humanas.matricular(aluno3);

        Disciplina exatas = new Disciplina("Exatas", prof3, Disciplina.Tipo.EXATAS);
        exatas.matricular(aluno3);
        exatas.matricular(aluno4);
        exatas.matricular(aluno);

        DataLoader dataLoader = new DataLoader();
        dataLoader.inserirUsuario(aluno);
        dataLoader.inserirUsuario(aluno1);
        dataLoader.inserirUsuario(aluno2);
        dataLoader.inserirUsuario(aluno3);
        dataLoader.inserirUsuario(aluno4);

        dataLoader.inserirUsuario(prof);
        dataLoader.inserirUsuario(prof2);
        dataLoader.inserirUsuario(prof3);

        dataLoader.inserirDisciplina(biologias);
        dataLoader.inserirDisciplina(humanas);
        dataLoader.inserirDisciplina(exatas);

//        dataLoader.exibirMedia();

//        dataLoader.exibirListaProfDisciplinas();

        dataLoader.exibirListaAlunosPorProfessores();

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
