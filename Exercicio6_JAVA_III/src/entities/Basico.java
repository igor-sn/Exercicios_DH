package entities;

import interfaces.Transacao;

public class Basico implements Transacao {

    private String nome;

    public Basico(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void deposito() {
        System.out.println("Transacao nao permitida.");
    }

    @Override
    public void transferencia() {
        System.out.println("Transacao nao permitida.");
    }

    @Override
    public void consultaSaldo() {
        System.out.println("Consultando saldo...");
    }

    @Override
    public void pagamentoServico() {
        System.out.println("Realizando pagamento...");
    }

    @Override
    public void saque() {
        System.out.println("Sacando dinheiro...");
    }
}
