package entities;




import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Corrida {

    private Double distancia;
    private BigDecimal premio;
    private String nome;
    private Integer qtdVeiculos;
    private SalvaVidasAuto salvaVidasAuto = new SalvaVidasAuto();
    private SalvaVidasMoto salvaVidasMoto= new SalvaVidasMoto();


    List<Veiculo> listaVeiculos = new ArrayList<Veiculo>();

    public Corrida(Double distancia, BigDecimal premio, String nome, Integer qtdVeiculos) {
        this.distancia = distancia;
        this.premio = premio;
        this.nome = nome;
        this.qtdVeiculos = qtdVeiculos;
    }

    public void addCarro(Integer velocidade, Double aceleracao, Double anguloGiro, String placa){
        if (listaVeiculos.size()< qtdVeiculos){
            listaVeiculos.add(new Carro(velocidade, aceleracao, anguloGiro, placa));
        }
        else{
            System.out.println("Essa corrida está cheia.");
        }

    }

    public void addMoto(Integer velocidade, Double aceleracao, Double anguloGiro, String placa){
        if (listaVeiculos.size()< qtdVeiculos){
            listaVeiculos.add(new Moto(velocidade, aceleracao, anguloGiro, placa));
        }
        else{
            System.out.println("Essa corrida está cheia.");
        }

    }

    public void deleteVeiculo(Veiculo veiculo){
        listaVeiculos.remove(veiculo);
    }

    public void deleteVeiculoComPlaca(String placa){
        listaVeiculos.removeIf(veiculo -> veiculo.getPlaca().equals(placa));
    }

    public void vencedor(){
        Optional<Veiculo> aux = listaVeiculos.stream()
                .max(Comparator.comparing(veiculo -> veiculo.getVelocidade()*0.5*veiculo.getAceleracao()/
                        (veiculo.getAnguloGiro()*(veiculo.getPeso() - (veiculo.getRodas()*100) ))));

        if(aux.isPresent()){
            System.out.println("VENCEDOR " + aux.get().getPlaca() + " LEVA "+ premio + " dólares");
        }
        else{
            System.out.println("NÃO TIVEMOS VENCEDORES!");
        }
    }

    public Optional<Veiculo> buscarCarro(String placa){
        return listaVeiculos.stream().filter(veiculo -> veiculo.getPlaca().equals(placa)).filter(veiculo -> veiculo instanceof Carro).findAny();
    }

    public Optional<Veiculo> buscarMoto(String placa){
        return listaVeiculos.stream().filter(veiculo -> veiculo.getPlaca().equals(placa)).filter(veiculo -> veiculo instanceof Moto).findAny();
    }

    public void socorrerAuto(String placa){
        if (buscarCarro(placa).isPresent()){
            salvaVidasAuto.socorrer(buscarCarro(placa).get());
        }
        else{
            System.out.println("Nenhum carro com essa placa foi encontrado!");
        }
    }

    public void socorrerMoto(String placa){
        if (buscarMoto(placa).isPresent()){
            salvaVidasMoto.socorrer(buscarCarro(placa).get());
        }
        else{
            System.out.println("Nenhuma moto com essa placa foi encontrada!");
        }
    }

    public void exibirVeiculos(){
        listaVeiculos.forEach(System.out::println);
    }

}
