package br.com.meli.idadepessoa.controller;


import br.com.meli.idadepessoa.model.ConversorIdade;
import br.com.meli.idadepessoa.model.DataNascimentoModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IdadePessoaController {

    @GetMapping("/{dia}/{mes}/{ano}")
    public  Integer solicitarConversao(@PathVariable Integer dia, @PathVariable Integer mes, @PathVariable Integer ano){
        DataNascimentoModel dataNascimento = new DataNascimentoModel(dia, mes, ano);

        return ConversorIdade.converterIdade(dataNascimento);

    }

}
