package br.com.codenation.repository;

import br.com.codenation.domain.Aluno;
import br.com.codenation.domain.Professor;
import br.com.codenation.domain.Usuario;

import java.util.ArrayList;
import java.util.List;

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
}
