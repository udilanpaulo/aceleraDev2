package br.com.codenation.exception;

import static br.com.codenation.utils.MensagemExceptions.MSG_LOGIN_INVALIDO;

public class LoginInvalidoException extends RuntimeException {

    public LoginInvalidoException(String msg) {
        super(String.format(MSG_LOGIN_INVALIDO,msg));
    }
}
