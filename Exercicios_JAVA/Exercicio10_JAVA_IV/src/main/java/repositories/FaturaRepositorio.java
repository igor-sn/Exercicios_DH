package repositories;

import entities.Fatura;
import interfaces.CRUD;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FaturaRepositorio implements CRUD<Fatura> {

    List<Fatura> faturas = new ArrayList<Fatura>();

    @Override
    public void adicionar(Fatura fatura) {
        faturas.add(fatura);
    }

    @Override
    public void exibirTodos() {
        faturas.stream().forEach(System.out::println);
    }

    @Override
    public Optional<Fatura> buscar(Integer id) {
        Optional aux = faturas.stream().filter(fatura -> fatura.getCodigo() == id).findAny();
        if(aux.isPresent()){
            System.out.println(aux.get());
        }
        else{
            System.out.println("Fatura nao encontrada.");
        }
        return aux;
    }

    @Override
    public void excluir(Integer id) {

        Optional<Fatura> aux = this.buscar(id);
        if (aux.isEmpty()) {
            System.out.println("Fatura nao encontrada.");
        } else {
            faturas.remove(aux.get());
            System.out.println("Fatura excluida.");
        }
    }

}
