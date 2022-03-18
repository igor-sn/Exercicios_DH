package br.com.meli.praticaesportes.Model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Pessoa {

    private String nome;
    private String sobrenome;
    private Integer idade;

}
