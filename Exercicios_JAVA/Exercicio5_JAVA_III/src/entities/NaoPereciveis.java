package entities;

public class NaoPereciveis extends Produto{

    private String tipo;

    public NaoPereciveis(){

    }

    public NaoPereciveis(String nome, Double preco, String tipo) {
        super(nome, preco);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Produto: " + super.getNome() + " Preco: "+ super.getPreco() + " Tipo: " + tipo;
    }
}
