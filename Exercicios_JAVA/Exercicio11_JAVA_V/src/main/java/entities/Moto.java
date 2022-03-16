package entities;

public class Moto extends Veiculo{

    public Moto(Integer velocidade, Double aceleracao, Double anguloGiro, String placa) {
        super(velocidade, aceleracao, anguloGiro, placa);
        super.setPeso(300.00);
        super.setRodas(2);
    }

    @Override
    public String toString() {
        return "Tipo: Moto" + "  Placa: " + super.getPlaca();
    }


}
