package br.com.meli.morse.model;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MorseModel {

    public final static Map<String, String> codigoMorse = Stream.of(new String[][]{
            {".-", "A"},
            {"-...", "B"},
            {"-.-.", "C"},
            {"-..", "D"},
            {".", "E"},
            {"..-.", "F"},
            {"--.", "G"},
            {"....", "H"},
            {"..", "I"},
            {".---", "J"},
            {"-.-", "K"},
            {".-..", "L"},
            {"--", "M"},
            {"-.", "N"},
            {"---", "O"},
            {".--.", "P"},
            {"--.-", "Q"},
            {".-.", "R"},
            {"...", "S"},
            {"-", "T"},
            {"..-", "U"},
            {"...-", "V"},
            {".--", "W"},
            {"-..-", "X"},
            {"-.--", "Y"},
            {"--..", "Z"},
            {"   ", "   "}
    }).collect(Collectors.toMap(codigo -> codigo[0], letra -> letra[1]));


    public static String getLetra(String codigoLetra) {
        return codigoMorse.get(codigoLetra);
    }

    public String conversor(String codigo){

        String [] palavras = codigo.split("   ");
        String [] letras;
        String frase = "";

        for (String palavra: palavras){
            letras = palavra.split(" ");

            for (String letra : letras){
                frase += getLetra(letra);
            }
            frase += " ";
        }
        return frase;

    }
}

