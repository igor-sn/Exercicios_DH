package Program;

import entities.Produto;
import entities.Pereciveis;
import entities.NaoPereciveis;

import java.util.ArrayList;
import java.util.List;

public class Distribuidora {

    public static void main(String[] args) {

        List<Produto> listaProdutos = new ArrayList<Produto>();
        Double total = 0.0;

        listaProdutos.add(new Pereciveis("Leite", 3.00, 1));
        listaProdutos.add(new Pereciveis("Carne", 24.00, 3));
        listaProdutos.add(new Pereciveis("Frango", 13.50, 6));
        listaProdutos.add(new Pereciveis("Tomate", 2.00, 5));
        listaProdutos.add(new Pereciveis("Queijo Mussarela", 5.00, 6));

        listaProdutos.add(new NaoPereciveis("Sal", 3.00, "A"));
        listaProdutos.add(new NaoPereciveis("Acucar", 24.00, "A"));
        listaProdutos.add(new NaoPereciveis("Cafe", 13.50, "A"));
        listaProdutos.add(new NaoPereciveis("Feijao", 2.00, "A"));
        listaProdutos.add(new NaoPereciveis("Arroz", 5.00, "A"));


        for(Produto a : listaProdutos){
            System.out.println(a.toString() + " Quantidade: " + 2 + " Valor final: " + a.calcular(2));
             total += a.calcular(2);
        }

        System.out.println("");

        System.out.println("O total da compra foi de: " + total);




    }




}
