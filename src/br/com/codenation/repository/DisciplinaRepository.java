package br.com.codenation.repository;

import br.com.codenation.domain.Disciplina;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DisciplinaRepository {
    List<Disciplina> disciplinas = new ArrayList<>();

    public void insere(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public void exibirDisciplinaPorProfessor() {
        System.out.println("Exatas: "+disciplinas.stream()
                .filter(disciplina -> (disciplina.getTipo() == Disciplina.Tipo.EXATAS))
                .collect(Collectors.toList()).size());

        System.out.println("Humanas: "+disciplinas.stream()
                .filter(disciplina -> (disciplina.getTipo() == Disciplina.Tipo.HUMANAS))
                .collect(Collectors.toList()).size());

        System.out.println("Exatas: "+disciplinas.stream()
                .filter(disciplina -> (disciplina.getTipo() == Disciplina.Tipo.EXATAS))
                .collect(Collectors.toList()).size());
    }
}
