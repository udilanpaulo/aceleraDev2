package br.com.codenation.repository;

import br.com.codenation.domain.Disciplina;
import br.com.codenation.domain.Usuario;

public class DataLoader {
    private UsuarioRepository usuarioRepository = new UsuarioRepository();
    private DisciplinaRepository disciplinaRepository = new DisciplinaRepository();

    public void inserirUsuario(Usuario usuario) {
        usuarioRepository.insere(usuario);
    }

    public void inserirDisciplina(Disciplina disciplina) { disciplinaRepository.insere(disciplina);}

    public void exibirMedia()  {
        System.out.println(usuarioRepository.mediaIdadeAlunos());
    }

    public void exibirListaProfDisciplinas() {
        disciplinaRepository.exibirDisciplinaPorProfessor();
    }

    public void exibirListaAlunosPorProfessores() { disciplinaRepository.exibirAlunosPorProfessores();}

}
