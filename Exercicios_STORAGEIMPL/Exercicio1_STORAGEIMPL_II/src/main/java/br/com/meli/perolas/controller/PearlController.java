package br.com.meli.perolas.controller;

import br.com.meli.perolas.dto.PearlDTO;
import br.com.meli.perolas.service.PearlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class PearlController {

    @Autowired
    PearlService pearlService;

    @PostMapping("/insertPearl")
    public ResponseEntity<PearlDTO> savePearl(@RequestBody PearlDTO pearlDTO, UriComponentsBuilder uriBuilder) {

        PearlDTO pearlDTOWhitId = pearlService.savePearl(pearlDTO);

        URI uri = uriBuilder
                .path("/pearls/{id}")
                .buildAndExpand(pearlDTOWhitId.getId())
                .toUri();

        return ResponseEntity.created(uri).body(pearlDTOWhitId);

    }

    @GetMapping("/pearls")
    public ResponseEntity<List<PearlDTO>> getAllPearls() {
        return new ResponseEntity(pearlService.getAllPearls(), HttpStatus.OK);
    }

    @GetMapping("/pearls/{id}")
    public ResponseEntity<PearlDTO> findPearlByID(@PathVariable Long id) {
        return new ResponseEntity(pearlService.findById(id), HttpStatus.OK);
    }

}
