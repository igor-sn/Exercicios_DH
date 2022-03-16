package entities;

public class Carro extends Veiculo{

    public Carro(Integer velocidade, Double aceleracao, Double anguloGiro, String placa) {
        super(velocidade, aceleracao, anguloGiro, placa);
        super.setPeso(1000.00);
        super.setRodas(4);
    }

    public String toString() {
        return "Tipo: Carro" + "  Placa: " + super.getPlaca();
    }
}
