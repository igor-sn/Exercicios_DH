package entities;



import lombok.Getter;
import repositories.ItemRepositorio;


import java.math.BigDecimal;
import java.util.List;


public class Fatura {

    private Integer codigo;
    private Cliente cli;
    private List<Item> itens;
    private BigDecimal total;

    public Fatura(Integer codigo, Cliente cli, List<Item> itens) {
        this.codigo = codigo;
        this.cli = cli;
        this.itens = itens;
        this.total = itens.stream().reduce(BigDecimal.valueOf(0),(acc, preco) -> acc.add(preco.getPreco()).multiply(BigDecimal.valueOf(preco.getQtd())), BigDecimal::add);
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public BigDecimal getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "-----"+ codigo +"-----\n"+
                "Cliente: " + cli.getNome() +
                "\n----------\n"+
                itens.toString()+
                "\n----------\n"+
                "Valor total: " + total;

    }
}
