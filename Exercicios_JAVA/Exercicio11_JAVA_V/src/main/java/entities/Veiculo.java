package entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public abstract class Veiculo {

    private Integer velocidade;
    private Double aceleracao;
    private Double anguloGiro;
    private String placa;
    private Double peso;
    private Integer rodas;

    public Veiculo(Integer velocidade, Double aceleracao, Double anguloGiro, String placa) {
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.anguloGiro = anguloGiro;
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "  Placa: " + placa;
    }
}
