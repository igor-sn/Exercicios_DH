package entities;

import interfaces.Socorrista;

public class SalvaVidasAuto implements Socorrista <Veiculo> {


    @Override
    public void socorrer(Veiculo veiculo) {
        System.out.println("Socorrendo carro " + veiculo.getPlaca());
    }
}
