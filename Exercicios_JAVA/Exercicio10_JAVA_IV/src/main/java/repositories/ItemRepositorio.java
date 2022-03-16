package repositories;

import entities.Cliente;
import entities.Item;
import interfaces.CRUD;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Getter
public class ItemRepositorio implements CRUD <Item> {

    List<Item> itens = new ArrayList<Item>();

    @Override
    public void adicionar(Item item) {
        itens.add(item);
    }

    @Override
    public void exibirTodos() {
        itens.stream().forEach(System.out::println);
    }

    @Override
    public Optional <Item> buscar(Integer id) {
        Optional aux = itens.stream().filter(item -> item.getCodigo() == id).findAny();
        if(aux.isPresent()){
            System.out.println(aux.get());
        }
        else{
            System.out.println("Item nao encontrado.");
        }
        return aux;
    }

    @Override
    public void excluir(Integer id) {

        Optional<Item> aux = this.buscar(id);
        if (aux.isEmpty()) {
            System.out.println("Item nao encontrado.");
        } else {
            itens.remove(aux.get());
            System.out.println("Item excluido.");
        }
    }
}
