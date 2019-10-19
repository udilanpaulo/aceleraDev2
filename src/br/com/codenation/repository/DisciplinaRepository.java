package br.com.codenation.repository;

import br.com.codenation.domain.Disciplina;

import java.util.ArrayList;
import java.util.List;

public class DisciplinaRepository {
    List<Disciplina> disciplinas = new ArrayList<>();

    public void insere(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }
}
