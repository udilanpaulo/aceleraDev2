package br.com.codenation.domain;

import java.time.LocalDate;

public class Professor extends Usuario {

    public Professor(String nome, String cpf, String login, LocalDate dataNascimento) {
        super(nome, cpf, login, dataNascimento);
    }
}
