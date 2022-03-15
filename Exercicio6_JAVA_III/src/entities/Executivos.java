package entities;


public class Executivos extends Conta{

    private String nome;

    public Executivos (String nome) {
        super(nome, TiposConta.EXECUTIVOS);
    }



}
