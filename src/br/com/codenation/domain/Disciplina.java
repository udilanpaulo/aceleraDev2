package br.com.codenation.domain;

import br.com.codenation.exception.NumeroMaximoAlunosException;
import static br.com.codenation.utils.MensagemExceptions.MSG_MAXIMO_ALUNOS;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Disciplina {

    public enum Tipo {
        BIOLOGICAS,
        HUMANAS,
        EXATAS;
    }

    private String nome;

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    private List<Aluno> alunos = new ArrayList<Aluno>();

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    private Professor professor;
    private Tipo tipo;

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Disciplina (String nome, Professor professor, Tipo tipo) {
        this.nome = nome;
        this.professor = professor;
        this.setTipo(tipo);
    }

    public void matricular(Aluno aluno) {
        if (alunos.size() > 10) {
            throw new NumeroMaximoAlunosException(MSG_MAXIMO_ALUNOS);
        }
        alunos.add(aluno);
    }

    public void mostarAlunos() {
        alunos.forEach(System.out::println);
    }

    public void mostrarNomesAlunos() {
        List<String> listaNomes = alunos.stream().map(aluno -> aluno.getNome()).collect(Collectors.toList());
        listaNomes.forEach(System.out::println);
    }
}
