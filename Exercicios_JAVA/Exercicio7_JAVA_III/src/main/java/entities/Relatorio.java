package entities;

import interfaces.Imprimivel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Relatorio implements Imprimivel{

    private String texto;
    private String autor;
    private String revisor;
    private int numeroPgs;


    @Override
    public void prepImpressao() {
        System.out.println("Imprimindo relatorio...");
    }
}
