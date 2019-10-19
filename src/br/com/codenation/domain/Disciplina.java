package br.com.codenation.domain;

import br.com.codenation.exception.NumeroMaximoAlunosException;
import static br.com.codenation.utils.MensagemExceptions.MSG_MAXIMO_ALUNOS;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Disciplina {

    private String nome;
    private List<Aluno> alunos = new ArrayList<Aluno>();
    private Professor professor;

    public Disciplina (String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
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
