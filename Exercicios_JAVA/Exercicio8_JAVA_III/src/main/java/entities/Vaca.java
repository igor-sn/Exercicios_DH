package entities;


import interfaces.Herbivoro;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Vaca extends Animal implements Herbivoro {

    public Vaca(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom(){
        System.out.println("Muuu!");
    }

    @Override
    public void comerPasto() {
        System.out.println("Comendo pasto...");
    }
}
