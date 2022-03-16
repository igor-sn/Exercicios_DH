package interfaces;

import java.util.Optional;

public interface CRUD <T>{

    public void adicionar (T objeto);

    public void exibirTodos();

    public Optional<T> buscar (Integer id);

    public void excluir (Integer id);

}
