package entities;

import interfaces.Transacao;

public class Deposito implements Transacao {

    public void depositar(TiposConta tipo){

        if(tipo.equals(TiposConta.EXECUTIVOS)){
            transacaoOk();
        }
        else{
            transacaoNaoOk();
        }

    }

    @Override
    public void transacaoOk() {
        System.out.println("Realizando transacao...");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Transacao invalida.");
    }
}
