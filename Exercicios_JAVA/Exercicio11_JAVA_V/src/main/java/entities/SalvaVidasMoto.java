package entities;

import interfaces.Socorrista;

public class SalvaVidasMoto implements Socorrista<Veiculo> {

    @Override
    public void socorrer(Veiculo veiculo) {
        System.out.println("Socorrendo moto " + veiculo.getPlaca());
    }
}
