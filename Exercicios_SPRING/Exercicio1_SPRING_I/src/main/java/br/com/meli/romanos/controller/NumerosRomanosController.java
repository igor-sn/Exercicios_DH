package br.com.meli.romanos.controller;

import br.com.meli.romanos.model.NumerosRomanosModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumerosRomanosController {


    @GetMapping("converterRomanos/{num}")
    @ResponseBody
    public String solicitarConversao(@PathVariable int num){
        NumerosRomanosModel numRomano = new NumerosRomanosModel();

        return numRomano.converterRomanos(num);

    }

}
