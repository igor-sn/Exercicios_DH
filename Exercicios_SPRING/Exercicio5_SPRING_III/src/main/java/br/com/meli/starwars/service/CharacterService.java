package br.com.meli.starwars.service;

import br.com.meli.starwars.dto.CharacterDTO;
import br.com.meli.starwars.entities.Character;
import br.com.meli.starwars.repositories.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CharacterService {

    @Autowired
    CharacterRepository charRepository = new CharacterRepository();
    CharacterDTO characterDTO;

    public List<CharacterDTO> saveCharacters(List<Character> chars){
        charRepository.setListCharacters(chars);
        return characterDTO.converte(charRepository.getListCharacters());
    }

    public List<CharacterDTO> allCharacters(){

        return characterDTO.converte(charRepository.getListCharacters());
    }




}
