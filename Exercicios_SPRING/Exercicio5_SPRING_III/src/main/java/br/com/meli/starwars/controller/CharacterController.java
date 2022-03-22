package br.com.meli.starwars.controller;


import br.com.meli.starwars.dto.CharacterDTO;
import br.com.meli.starwars.entities.Character;
import br.com.meli.starwars.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CharacterController {


    CharacterService charService = new CharacterService();


    @PostMapping("/saveCharacters")
    public ResponseEntity<List<CharacterDTO>> saveCharacters(@RequestBody List<Character> charactersToAdd) {

        return ResponseEntity.status(HttpStatus.CREATED).body(charService.saveCharacters(charactersToAdd));

    }

    @GetMapping("/characters")
    public ResponseEntity<List<CharacterDTO>> allCharacters() {

        return ResponseEntity.status(HttpStatus.OK).body(charService.allCharacters());
    }
}
