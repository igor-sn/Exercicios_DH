package application;

import entities.Cliente;
import entities.Fatura;
import entities.Item;
import repositories.ClienteRepositorio;
import repositories.FaturaRepositorio;
import repositories.ItemRepositorio;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        ClienteRepositorio clientes = new ClienteRepositorio();
        ItemRepositorio itens = new ItemRepositorio();
        FaturaRepositorio faturas = new FaturaRepositorio();

        clientes.adicionar(new Cliente(1,"Igor"));
        clientes.adicionar(new Cliente(2, "Bruna"));
        clientes.adicionar(new Cliente(3, "Anna"));

        itens.adicionar(new Item(1, "Pera", BigDecimal.valueOf(2.00), 2));
        itens.adicionar(new Item(1, "Arroz", BigDecimal.valueOf(5.00), 1));
        itens.adicionar(new Item(1, "Feijao", BigDecimal.valueOf(3.00), 1));
        itens.adicionar(new Item(1, "Macarrao", BigDecimal.valueOf(4.00), 1));
        itens.adicionar(new Item(1, "Batata", BigDecimal.valueOf(1.00), 1));

        faturas.adicionar(new Fatura(1, clientes.getClientes().get(0), itens.getItens()));

        Scanner sc = new Scanner(System.in);

        System.out.println("-----Todos os clientes -----");
        clientes.exibirTodos();

        System.out.println();

        System.out.println("Digite o id do cliente que deseja excluir: ");

        int id = sc.nextInt();

        clientes.excluir(id);

        System.out.println();

        System.out.println("-----Todos os clientes -----");
        clientes.exibirTodos();

        System.out.println();

        System.out.println("Digite o id do cliente que deseja consultar: ");

        id = sc.nextInt();

        clientes.buscar(id);

        sc.close();

        System.out.println();

        System.out.println("-----Faturas-----");

        faturas.exibirTodos();

    }

}
