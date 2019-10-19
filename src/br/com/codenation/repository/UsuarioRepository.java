package br.com.codenation.repository;

import br.com.codenation.domain.Aluno;
import br.com.codenation.domain.Professor;
import br.com.codenation.domain.Usuario;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class UsuarioRepository {
    private List<Usuario> usuarios = new ArrayList<>();

    public void insere (Usuario usuario) {
        usuarios.add(usuario);
    }

    public void mostrarProfessores() {
        usuarios.forEach(usuario -> {
//           type cast em java
//            Professor professor = (Professor) usuario;
            if (usuario instanceof Professor) {
                System.out.println(usuario);
            }
        });
    }

    public void mostrarUsuarios() {
        usuarios.forEach(usuario -> {
            if (usuario instanceof Aluno) {
                System.out.println(usuario);
            }
        });
    }

    public double mediaIdadeAlunos() {
        LocalDate hoje = LocalDate.now();
        return usuarios.stream()
                .filter(usuario -> (usuario instanceof Aluno))
                .mapToDouble(usuario -> Period.between(usuario.getDataNascimento(), hoje).getYears())
                .average().orElse(0);
    }
}
