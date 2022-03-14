package entities;



public class Pereciveis extends Produto {

    private int diasParaVencer;

    public Pereciveis(){

    }

    public Pereciveis(String nome, Double preco, int diasParaVencer) {
        super(nome, preco);
        this.diasParaVencer = diasParaVencer;
    }

    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public String toString() {
        return "Produto: " + super.getNome() + " Preco: "+ super.getPreco() + " Dias para vencer: " + diasParaVencer;
    }

    @Override
    public Double calcular (int quantidadeDeProdutos){

        switch (diasParaVencer){
            case 1:
                return super.calcular(quantidadeDeProdutos) * 0.25;
            case 2:
                return super.calcular(quantidadeDeProdutos) * 0.33;
            case 3:
                return super.calcular(quantidadeDeProdutos) * 0.50;
            default:
                return super.calcular(quantidadeDeProdutos);
        }
    }
}
