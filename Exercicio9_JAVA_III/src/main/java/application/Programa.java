package application;

import entities.Garagem;
import entities.Veiculo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Programa {

    public static void main(String[] args) {

        List<Veiculo> listaVeiculos = new ArrayList<Veiculo>();
        listaVeiculos.add(new Veiculo("Ford", "Fiesta", BigDecimal.valueOf(1000)));
        listaVeiculos.add(new Veiculo("Ford", "Focus", BigDecimal.valueOf(1200)));
        listaVeiculos.add(new Veiculo("Ford", "Explorer", BigDecimal.valueOf(2500)));
        listaVeiculos.add(new Veiculo("Fiat", "Uno", BigDecimal.valueOf(500)));
        listaVeiculos.add(new Veiculo("Fiat", "Cronos", BigDecimal.valueOf(1000)));
        listaVeiculos.add(new Veiculo("Fiat", "Torino", BigDecimal.valueOf(1250)));
        listaVeiculos.add(new Veiculo("Chevrolet", "Aveo", BigDecimal.valueOf(1250)));
        listaVeiculos.add(new Veiculo("Chevrolet", "Spin", BigDecimal.valueOf(2500)));
        listaVeiculos.add(new Veiculo("Toyota", "Corolla", BigDecimal.valueOf(1200)));
        listaVeiculos.add(new Veiculo("Toyota", "Fortuner", BigDecimal.valueOf(3000)));
        listaVeiculos.add(new Veiculo("Renault", "Logan", BigDecimal.valueOf(950)));

        Garagem garagem = new Garagem(1, listaVeiculos);


        System.out.println("-----Ordenacao por preco -----");
        garagem.ordenarPreco();
        System.out.println();

        System.out.println("-----Ordenacao por marca -----");
        garagem.ordenarMarca();
        System.out.println();

        System.out.println("-----Veiculos com valor menor que 1000-----");
        garagem.veiculosMenorMil().forEach(System.out::println);
        System.out.println();

        System.out.println("-----Veiculos com valor maior que 1000-----");
        garagem.veiculosMaiorMil().forEach(System.out::println);
        System.out.println();

        System.out.println("-----Preco medio-----");
        garagem.precoMedio();

    }
}
