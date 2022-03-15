package entities;

import transactions.*;

public class Conta {

    private String nome;
    private TiposConta tipo;

    public Conta(String nome){
        this.nome = nome;
    }

    public Conta(String nome, TiposConta tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TiposConta getTipo() {
        return tipo;
    }

    public void setTipo(TiposConta tipo) {
        this.tipo = tipo;
    }

    public void solicitarDeposito(){
        Deposito deposito = new Deposito();
        deposito.depositar(getTipo());
    }

    public void solicitarConsulta(){
        ConsultaSaldo consulta = new ConsultaSaldo();
        consulta.consultar(getTipo());
    }

    public void solicitarSaque(){
        Saque saque = new Saque();
        saque.sacar(getTipo());
    }

    public void solicitarPagamento(){
        PagamentoServicos pagamento = new PagamentoServicos();
        pagamento.pagarServico(getTipo());
    }

    public void solicitarTransferencia(){
        Transferencia transferecia = new Transferencia();
        transferecia.transferir(getTipo());
    }




}
