package application;

import entities.Curriculo;
import entities.Impressora;
import entities.LivroPDF;
import entities.Relatorio;

public class Program {

    public static void main(String[] args) {

        Impressora impressora = new Impressora();

        impressora.imprimir(new Curriculo());
        impressora.imprimir(new LivroPDF());
        impressora.imprimir(new Relatorio());

    }

}
