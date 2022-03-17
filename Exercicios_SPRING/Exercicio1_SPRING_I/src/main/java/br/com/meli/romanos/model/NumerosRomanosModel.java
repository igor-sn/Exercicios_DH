package br.com.meli.romanos.model;


import java.util.List;

public class NumerosRomanosModel {

    private Integer[] valorNum = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private String[] valorRom = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public NumerosRomanosModel(){

    }

    public String converterRomanos(Integer num){

        String valorConv = "";

        if(num ==0){
            return "Numero nao pode ser convertido!";
        }
        else{
            int i=0;
            while(num>0){
                if (num >=valorNum[i]){
                    valorConv += valorRom[i];
                    num -= valorNum[i];
                }
                else{
                    i++;
                }
            }
            return valorConv;
        }

    }


}
