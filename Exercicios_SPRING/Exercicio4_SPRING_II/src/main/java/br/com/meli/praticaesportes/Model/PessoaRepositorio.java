package br.com.meli.praticaesportes.Model;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter

public class PessoaRepositorio {

    List<Pessoa> pessoas = new ArrayList<Pessoa>();

    public PessoaRepositorio() {
        pessoas.add(new Pessoa("Igor", "Nogueira", 22));
        pessoas.add(new Pessoa("José", "Seila", 13));
        pessoas.add(new Pessoa("João", "Seila", 14));
        pessoas.add(new Pessoa("Maria", "Seila", 15));
    }

}