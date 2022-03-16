package transactions;

import entities.TiposConta;
import interfaces.Transacao;

public class Transferencia implements Transacao {

    public void transferir(TiposConta tipo){

        if(tipo.equals(TiposConta.EXECUTIVOS)){
            transacaoOk();
        }
        else{
            transacaoNaoOk();
        }

    }

    @Override
    public void transacaoOk() {
        System.out.println("Realizando transferencia...");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Transacao invalida.");
    }
}
