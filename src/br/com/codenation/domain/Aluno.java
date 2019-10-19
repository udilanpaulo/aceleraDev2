package br.com.codenation.domain;

import java.time.LocalDate;

public class Aluno extends Usuario{

    public Integer getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(Integer numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    private Integer numeroMatricula;

    public Aluno(String nome, String cpf, String login, LocalDate dataNascimento) {
        super(nome, cpf, login, dataNascimento);
    }
}