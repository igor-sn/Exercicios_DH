package transactions;

import entities.TiposConta;
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
        System.out.println("Realizando deposito...");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Transacao invalida.");
    }
}
