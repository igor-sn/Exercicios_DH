package transactions;

import entities.TiposConta;
import interfaces.Transacao;

public class Saque implements Transacao {

    public void sacar(TiposConta tipo){

        if(tipo.equals(TiposConta.BASICO) || tipo.equals(TiposConta.COBRADORES) ){
            transacaoOk();
        }
        else{
            transacaoNaoOk();
        }

    }

    @Override
    public void transacaoOk() {
        System.out.println("Realizando saque...");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Transacao invalida.");
    }
}
