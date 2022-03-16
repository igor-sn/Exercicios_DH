package entities;


import interfaces.Carnivoro;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cachorro extends Animal implements Carnivoro {

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom(){
        System.out.println("Auau!");
    }

    @Override
    public void comerCarne() {
        System.out.println("Comendo carne...");
    }
}
