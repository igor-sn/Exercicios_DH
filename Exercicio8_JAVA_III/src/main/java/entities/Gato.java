package entities;


import interfaces.Carnivoro;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class Gato extends Animal implements Carnivoro {

    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom(){
        System.out.println("Miau!");
    }

    @Override
    public void comerCarne() {
        System.out.println("Comendo carne...");
    }
}