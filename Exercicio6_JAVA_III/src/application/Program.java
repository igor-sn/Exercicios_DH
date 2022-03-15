package application;

import entities.Basico;
import entities.Cobradores;
import entities.Executivos;

public class Program {

    public static void main(String[] args) {

        Executivos executivo = new Executivos("Igor");
        Basico basico = new Basico("Anna");
        Cobradores cobrador = new Cobradores("Bruna");

        System.out.println();
        System.out.println("------------------------Executivos------------------------");

        executivo.deposito();
        executivo.transferencia();
        executivo.saque();
        executivo.consultaSaldo();
        executivo.pagamentoServico();


        System.out.println();
        System.out.println("------------------------Basicos------------------------");

        basico.deposito();
        basico.transferencia();
        basico.saque();
        basico.consultaSaldo();
        basico.pagamentoServico();


        System.out.println();
        System.out.println("------------------------Cobradores------------------------");

        cobrador.deposito();
        cobrador.transferencia();
        cobrador.saque();
        cobrador.consultaSaldo();
        cobrador.pagamentoServico();


    }
}
