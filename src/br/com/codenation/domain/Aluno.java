package br.com.codenation.domain;

public class Aluno extends Usuario{

    public Integer getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(Integer numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    private Integer numeroMatricula;

    public Aluno(String nome, String cpf, String login) {
        super(nome, cpf, login);
    }
}