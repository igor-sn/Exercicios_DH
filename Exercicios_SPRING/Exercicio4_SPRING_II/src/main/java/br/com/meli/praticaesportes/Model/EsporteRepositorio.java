package br.com.meli.praticaesportes.Model;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter


public class EsporteRepositorio {

    List<Esporte> listaEsportes = new ArrayList<Esporte>();

    public EsporteRepositorio() {

        listaEsportes.add(new Esporte("Futebol", "Basico"));
        listaEsportes.add(new Esporte("Taekwondo", "Avançado"));
        listaEsportes.add(new Esporte("Volei", "Medio"));
        listaEsportes.add(new Esporte("Skate", "Avançado"));
    }




}
