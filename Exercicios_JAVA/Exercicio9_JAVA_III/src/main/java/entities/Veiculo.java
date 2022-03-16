package entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;



@AllArgsConstructor
@NoArgsConstructor

public class Veiculo {

    private String modelo;
    private String marca;
    private BigDecimal preco;

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return
                "Modelo: " + modelo + '\'' +
                " | Marca: " + marca + '\'' +
                " | Preco: " + preco;

    }
}
