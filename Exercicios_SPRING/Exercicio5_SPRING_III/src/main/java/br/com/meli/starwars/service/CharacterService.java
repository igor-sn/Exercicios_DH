package br.com.meli.starwars.service;

import br.com.meli.starwars.dto.CharacterDTO;
import br.com.meli.starwars.repositories.CharacterRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

@Service
public class CharacterService {

    @Autowired
    private CharacterRepository charRepository;

    public List<CharacterDTO> saveCharacters(List<CharacterDTO> chars){

        if(charRepository.getListCharacters().addAll(chars)) return chars;

        return new ArrayList<>();
    }

    public List<CharacterDTO> allCharacters(){
        return  charRepository.getListCharacters();
    }

    public List<CharacterDTO> CharacterFindByName(String name){
        return charRepository.getListCharacters().stream().filter(characterDTO -> characterDTO.getName().contains(name)).collect(Collectors.toList());
    }


}
