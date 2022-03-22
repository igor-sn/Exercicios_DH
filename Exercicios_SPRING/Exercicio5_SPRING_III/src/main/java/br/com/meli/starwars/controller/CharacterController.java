package br.com.meli.starwars.controller;


import br.com.meli.starwars.dto.CharacterDTO;
import br.com.meli.starwars.entities.Character;
import br.com.meli.starwars.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriBuilder;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@RestController
public class CharacterController {


    @Autowired
    private CharacterService charService;

    @PostMapping("/saveCharacters")
    public ResponseEntity<List<CharacterDTO>> saveCharacters(@RequestBody List<Character> charactersToAdd,  UriComponentsBuilder uriBuilder) {


        URI uri = uriBuilder
                .path("/Characters")
                .buildAndExpand(charactersToAdd)
                .toUri();


        return ResponseEntity.created(uri).body(charService.saveCharacters(CharacterDTO.converte(charactersToAdd)));

    }

    @GetMapping("/Characters")
    public ResponseEntity<List<CharacterDTO>> allCharacters() {

        return ResponseEntity.ok(charService.allCharacters());

    }

    @GetMapping("/Characters/{name}")
    public ResponseEntity<List<CharacterDTO>> charactersFindByName(@PathVariable String name) {

        return ResponseEntity.ok(charService.CharacterFindByName(name));

    }



}
