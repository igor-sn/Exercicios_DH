package entities;

import interfaces.Transacao;

public class ConsultaSaldo implements Transacao {

    public void consultar(TiposConta tipo){

        if(tipo.equals(TiposConta.COBRADORES) || tipo.equals(TiposConta.COBRADORES)){
            transacaoOk();
        }
        else{
            transacaoNaoOk();
        }

    }

    @Override
    public void transacaoOk() {
        System.out.println("Realizando consulta...");
    }

    @Override
    public void transacaoNaoOk() {

        System.out.println("Transacao invalida.");

    }
}
