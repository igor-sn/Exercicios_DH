package br.com.meli.praticaesportes.Controller;

import br.com.meli.praticaesportes.Model.Esporte;
import br.com.meli.praticaesportes.Model.EsporteServico;
import br.com.meli.praticaesportes.Model.PessoaEsporteODT;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class EsporteController {

    EsporteServico esporteServico = new EsporteServico();

    @GetMapping("/findSports")
    @ResponseBody
    public List<Esporte> mostrarTodos(){

        return esporteServico.todosEsportes();

    }

    @GetMapping("/findSports/{esporte}")
    @ResponseBody
    public List<Esporte> mostrarUm(@PathVariable String esporte){

        return esporteServico.esporteFiltrado(esporte);

    }

    @GetMapping("/findSportsPersons")
    @ResponseBody
    public List<PessoaEsporteODT> mostrarAtelas(){
        return esporteServico.exibirAtletas();

    }



}
