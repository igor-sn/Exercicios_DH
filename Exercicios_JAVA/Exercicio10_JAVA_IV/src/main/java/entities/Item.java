package entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Item {

    private Integer codigo;
    private String nome;
    private BigDecimal preco;
    private Integer qtd;

    @Override
    public String toString() {
            return "Codigo: " + codigo + " | Item: " + nome + " | Preco: " + preco + " | Quantidade: " + qtd + "\n";
    }

}
