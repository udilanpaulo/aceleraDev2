package br.com.codenation.repository;

import br.com.codenation.domain.Disciplina;
import br.com.codenation.domain.Professor;

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

    public void exibirAlunosPorProfessores() {
        List<Professor> professores = disciplinas.stream()
                .map(disciplina -> disciplina.getProfessor()).distinct()
                .collect(Collectors.toList());

        professores.forEach(professor -> System.out.println(professor.getNome()+" total de alunos: "+
                disciplinas.stream().filter(disciplina ->  disciplina.getProfessor() == professor)
                        .mapToInt(disciplina -> disciplina.getAlunos().size()).sum()
                ));
    }
}
