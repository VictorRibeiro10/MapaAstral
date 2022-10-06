package org.example.exceptions;

public class SignoLunarNaoExisteException extends RuntimeException{

    public SignoLunarNaoExisteException() {
        this("Signo Lunar Dinossauriano");
    }
    public SignoLunarNaoExisteException(String message) {
        super(message);
    }

}
