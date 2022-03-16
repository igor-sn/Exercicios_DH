package application;

import entities.Basico;
import entities.Cobradores;
import entities.Conta;
import entities.Executivos;

public class Program {

    public static void main(String[] args) {

        Conta executivo = new Executivos("Igor");
        Basico basico = new Basico("Anna");
        Cobradores cobrador = new Cobradores("Bruna");

        System.out.println();
        System.out.println("------------------------Executivos------------------------");

        executivo.solicitarDeposito();
        executivo.solicitarConsulta();
        executivo.solicitarTransferencia();
        executivo.solicitarSaque();
        executivo.solicitarPagamento();


        System.out.println();
        System.out.println("------------------------Basicos------------------------");

        basico.solicitarDeposito();
        basico.solicitarConsulta();
        basico.solicitarTransferencia();
        basico.solicitarSaque();
        basico.solicitarPagamento();


        System.out.println();
        System.out.println("------------------------Cobradores------------------------");

        cobrador.solicitarDeposito();
        cobrador.solicitarConsulta();
        cobrador.solicitarTransferencia();
        cobrador.solicitarSaque();
        cobrador.solicitarPagamento();


    }
}
