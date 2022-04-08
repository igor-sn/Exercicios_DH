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

    @PostMapping("/pearl")
    public ResponseEntity<PearlDTO> savePearl(@RequestBody PearlDTO pearlDTO, UriComponentsBuilder uriBuilder) {

        PearlDTO pearlDTOWhitId = pearlService.savePearl(pearlDTO);

        URI uri = uriBuilder
                .path("/pearl/{id}")
                .buildAndExpand(pearlDTOWhitId.getId())
                .toUri();

        return ResponseEntity.created(uri).body(pearlDTOWhitId);

    }

    @GetMapping("/pearls")
    public ResponseEntity<List<PearlDTO>> getAllPearls() {
        return new ResponseEntity(pearlService.getAllPearls(), HttpStatus.OK);
    }

    @GetMapping("/pearl")
    public ResponseEntity<PearlDTO> findPearlByID(@RequestParam Long id) {
        return new ResponseEntity(pearlService.findById(id), HttpStatus.OK);
    }

    @PutMapping("/pearl")
    public ResponseEntity<PearlDTO> updatePearlById(@RequestParam Long id, @RequestBody PearlDTO pearlDTO) {
        return new ResponseEntity(pearlService.updatePearl(pearlDTO, id), HttpStatus.OK);
    }

    @DeleteMapping("/pearl")
    public ResponseEntity<String> removePearl(@RequestParam Long id) {
        pearlService.removePearl(id);
        return new ResponseEntity("Pearl successfully removed", HttpStatus.OK);
    }

}
