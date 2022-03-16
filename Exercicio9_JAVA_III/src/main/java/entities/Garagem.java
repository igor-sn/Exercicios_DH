package entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@NoArgsConstructor
@Setter

public class Garagem {

    private Integer id;
    List<Veiculo> veiculos = new ArrayList<Veiculo>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List veiculos) {
        this.veiculos = veiculos;
    }


    public void ordenarPreco(){
        veiculos.sort((a, b) -> a.getPreco().compareTo(b.getPreco()));
        veiculos.forEach(veiculo -> System.out.println(veiculo));
    }

    public void ordenarMarca(){
        veiculos.sort((a, b) -> a.getMarca().compareTo(b.getMarca()));
        veiculos.forEach(veiculo -> System.out.println(veiculo));
    }

    public List<Veiculo> veiculosMaiorMil(){

        return veiculos.stream().filter(veiculo -> veiculo.getPreco().compareTo(BigDecimal.valueOf(1000)) > 0).collect(Collectors.toList());
    }

    public List<Veiculo> veiculosMenorMil(){

        return veiculos.stream().filter(veiculo -> veiculo.getPreco().compareTo(BigDecimal.valueOf(1000)) < 1).collect(Collectors.toList());
    }

    public void precoMedio(){
        BigDecimal precoTotal = veiculos.stream().reduce(BigDecimal.valueOf(0),(acc, preco) -> acc.add(preco.getPreco()), BigDecimal::add);
        System.out.println("O preco medio dos veiculos eh: " + precoTotal.divide(BigDecimal.valueOf(veiculos.size()), 2, RoundingMode.HALF_UP));
    }

}
