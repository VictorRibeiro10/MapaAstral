package org.example.exceptions;

public class SignoNaoExisteException extends RuntimeException{
    public SignoNaoExisteException(){
        this("Signo Dinossauriano");
    }
    public SignoNaoExisteException(String message){
        super(message);
    }
}
