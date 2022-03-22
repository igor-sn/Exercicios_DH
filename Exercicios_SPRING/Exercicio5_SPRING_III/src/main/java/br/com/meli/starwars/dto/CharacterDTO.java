package br.com.meli.starwars.dto;


import br.com.meli.starwars.entities.Character;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor
@AllArgsConstructor

public class CharacterDTO {

    private String name;
    private String height;
    private String mass;
    private String gender;
    private String homeworld;
    private String species;


    public  CharacterDTO converte(Character character){

        this.name = character.getName();
        this.height = character.getHeight();
        this.mass = character.getMass();
        this.gender = character.getGender();
        this.homeworld = character.getHomeworld();
        this.species = character.getSpecies();

        return this;
    }

    public List<CharacterDTO> converte(List<Character> characters){
        return characters.stream().map(chars -> new CharacterDTO(chars.getName(), chars.getHeight(), chars.getMass(), chars.getGender(), chars.getHomeworld(), chars.getSpecies())).collect(Collectors.toList());

    }



}
