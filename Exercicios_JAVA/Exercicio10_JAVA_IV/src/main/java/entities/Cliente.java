package entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Cliente {

    private Integer id;
    private String nome;

    @Override
    public String toString() {
        return "ID: " + id + " | Nome: " + nome;
    }

}
