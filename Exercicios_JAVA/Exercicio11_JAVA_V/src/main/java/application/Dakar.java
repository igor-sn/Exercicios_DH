package application;

import entities.Carro;
import entities.Corrida;
import entities.Veiculo;

import java.math.BigDecimal;

public class Dakar {

    public static void main(String[] args) {

        Corrida corrida = new Corrida(56.0, BigDecimal.valueOf(60000.0), "Melicorrida", 5);

        corrida.addCarro(180, 9.0, 45.0, "DUO");
        corrida.addCarro(130, 5.0, 45.0, "PIN");
        corrida.addCarro(140, 5.0, 45.0,"FXS");
        corrida.addMoto(150, 5.0, 45.0, "CTZ");
        corrida.addMoto(120, 5.0, 45.0,"SZN");


        corrida.vencedor();

        corrida.exibirVeiculos();

        corrida.deleteVeiculoComPlaca("SZN");

        corrida.exibirVeiculos();

        corrida.socorrerAuto("FXS");
    }
}
