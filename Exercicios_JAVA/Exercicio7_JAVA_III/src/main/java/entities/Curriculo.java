package entities;

import interfaces.Imprimivel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Curriculo implements Imprimivel{

    private Pessoa pessoa;
    private List<Habilidades> habilidades;

    @Override
    public void prepImpressao() {
        System.out.println("Imprimindo curriculo...");
    }
}
