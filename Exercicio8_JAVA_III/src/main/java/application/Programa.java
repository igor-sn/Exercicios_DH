package application;

import entities.Cachorro;
import entities.Gato;
import entities.Vaca;

public class Programa {

    public static void main(String[] args) {

        Gato gato = new Gato("Gatildo");
        Cachorro cachorro = new Cachorro("Costela");
        Vaca vaca = new Vaca("Mimosa");

        System.out.println();
        System.out.println("-------------------Gato-------------------");
        gato.emitirSom();
        gato.comerCarne();


        System.out.println();
        System.out.println("-------------------Cachorro-------------------");
        cachorro.emitirSom();
        cachorro.comerCarne();


        System.out.println();
        System.out.println("-------------------Vaca-------------------");
        vaca.emitirSom();
        vaca.comerPasto();

    }


}
