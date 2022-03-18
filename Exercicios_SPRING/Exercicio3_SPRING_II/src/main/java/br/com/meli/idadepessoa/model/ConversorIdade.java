package br.com.meli.idadepessoa.model;

import lombok.Data;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

public class ConversorIdade {



    public static Integer converterIdade(DataNascimentoModel dataNascimento){



        LocalDate dataNascimentoConvertida = LocalDate.of(dataNascimento.getAno(), dataNascimento.getMes(), dataNascimento.getDia());
        Period periodo = Period.between(dataNascimentoConvertida, LocalDate.now());

        return periodo.getYears();

    }


}
