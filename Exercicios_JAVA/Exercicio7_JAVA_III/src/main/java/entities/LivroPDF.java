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

public class LivroPDF implements Imprimivel{

    private String titulo;
    private String genero;
    private String autor;
    private int numeroPgs;


    @Override
    public void prepImpressao() {
        System.out.println("Imprimindo livro...");
    }
}