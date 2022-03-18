package br.com.meli.praticaesportes.Model;

import org.springframework.beans.factory.ListableBeanFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EsporteServico {

    private EsporteRepositorio esporteRepositorio = new EsporteRepositorio();
    private PessoaRepositorio pessoas = new PessoaRepositorio();
    private PessoaEsporteODT atleta = new PessoaEsporteODT();

    public List<Esporte> todosEsportes (){

        return esporteRepositorio.listaEsportes;
    }

    public List<Esporte> esporteFiltrado (String nomeEsporte){

        return esporteRepositorio.listaEsportes.stream().filter(esporte -> esporte.getNome().equals(nomeEsporte)).findFirst().stream().collect(Collectors.toList());

    }

    public List<PessoaEsporteODT> exibirAtletas (){


        List<PessoaEsporteODT> atletas = new ArrayList<PessoaEsporteODT>();

        for (int i=0; i < pessoas.getPessoas().size(); i++){

            atletas.add(new PessoaEsporteODT(pessoas.getPessoas().get(i).getNome(),
                            pessoas.getPessoas().get(i).getSobrenome(),
                            esporteRepositorio.getListaEsportes().get(i).getNome())
            );
        }

        return atletas;



    }



}
