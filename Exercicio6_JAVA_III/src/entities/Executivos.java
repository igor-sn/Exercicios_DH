package entities;

import interfaces.Transacao;

public class Executivos implements Transacao {

    private String nome;

    public Executivos(String nome) {
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
        System.out.println("Realizando deposito...");

    }

    @Override
    public void transferencia() {
        System.out.println("Realizando transferencia...");

    }

    @Override
    public void consultaSaldo() {
        System.out.println("Transacao nao permitida.");
    }

    @Override
    public void pagamentoServico() {
        System.out.println("Transacao nao permitida.");

    }

    @Override
    public void saque() {
        System.out.println("Transacao nao permitida.");

    }
}
