package br.com.codenation.domain;

import br.com.codenation.exception.LoginInvalidoException;

import java.time.LocalDate;
import java.util.Objects;

public class Usuario {
    private String nome;
    private String cpf;
    private String login;
    private LocalDate dataNascimento;

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    private boolean validaLogin(String login) {
        return login.length() > 3;
    }

    private boolean loginInvalido(String login) {
        return login.length() <= 2;
    }

    public Usuario(String nome, String cpf, String login, LocalDate dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.login = login;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {

        if (this.loginInvalido(login)) {
            throw new LoginInvalidoException(login);
        }

        if (Objects.nonNull(login)) {
            this.login = login;
        }

//        if (this.validaLogin(login)) {
//            this.login = login;
//        } else {
//            throw new RuntimeException("Login Invalido.");
//        }
    }

    @Override
    public String toString() {
        return "nome: " + this.nome + "\n" +
                "cpf: " + this.cpf + "\n" +
                "login: " + this.login;
    }
}
