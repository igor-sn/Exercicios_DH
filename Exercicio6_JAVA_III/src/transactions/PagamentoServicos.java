package transactions;

import entities.TiposConta;
import interfaces.Transacao;

public class PagamentoServicos implements Transacao {

    public void pagarServico(TiposConta tipo){

        if(tipo.equals(TiposConta.BASICO)){
            transacaoOk();
        }
        else{
            transacaoNaoOk();
        }

    }

    @Override
    public void transacaoOk() {
        System.out.println("Realizando pagamento...");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Transacao invalida.");
    }
}
