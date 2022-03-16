package repositories;

import entities.Cliente;
import interfaces.CRUD;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@AllArgsConstructor
@NoArgsConstructor
@Getter

public class ClienteRepositorio implements CRUD <Cliente>{

    List <Cliente> clientes = new ArrayList<>();

    @Override
    public void adicionar(Cliente cli) {
        clientes.add(cli);
    }

    @Override
    public void exibirTodos() {
        clientes.stream().forEach(System.out::println);
    }

    @Override
    public Optional <Cliente> buscar(Integer id) {
        Optional aux = clientes.stream().filter(cliente -> cliente.getId() == id).findAny();
        if(aux.isPresent()){
            System.out.println(aux.get());
        }
        else{
            System.out.println("Cliente nao encontrado.");
        }
        return aux;
    }

    @Override
    public void excluir(Integer id) {

        Optional<Cliente> aux = this.buscar(id);
        if (aux.isEmpty()){
            System.out.println("Cliente nao encontrado.");
        }else{
            clientes.remove(aux.get());
            System.out.println("Cliente excluido.");
        }
    }

}
