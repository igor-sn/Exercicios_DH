package application;

import entidades.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa("Igor", 20, "ISN");
        Pessoa pessoa3 = new Pessoa("Anna", 20, "ANC", 80.0, 1.70);

        //Pessoa pessoa4 = new Pessoa("Igor", 20);

        System.out.println("------------- IMC -------------");
        System.out.println(pessoa3);
    }
}
