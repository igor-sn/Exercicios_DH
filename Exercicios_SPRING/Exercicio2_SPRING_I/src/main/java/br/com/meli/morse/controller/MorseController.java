package br.com.meli.morse.controller;

import br.com.meli.morse.model.MorseModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MorseController {

    MorseModel morseModel = new MorseModel();

    @GetMapping("/CodigoMorse")
    public String solicitarConversao(@RequestParam String codigoMorse){

        return morseModel.conversor(codigoMorse);

    }

}
