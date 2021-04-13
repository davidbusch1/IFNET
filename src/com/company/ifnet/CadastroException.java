package com.company.ifnet;

public class CadastroException extends Exception{

    private int codigoErro;

    public CadastroException(String message) {
        super(message);

    }

}
