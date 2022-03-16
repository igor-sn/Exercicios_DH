package aplicacao;

import entidades.Inscritos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        List<Inscritos> listInscPequeno = new ArrayList<Inscritos>();
        List<Inscritos> listInscMedio= new ArrayList<Inscritos>();
        List<Inscritos> listInscAvancado = new ArrayList<Inscritos>();

        Inscritos inscrito = new Inscritos();

        int numInsc;
        String RG;
        String nome;
        String sobrenome;
        int idade;
        String cel;
        String celEmg;
        String tpSng;
        String categoria;

        Scanner sc = new Scanner(System.in);

        int opcao = 0;
        int validaCategoria = 0;
        String opcaoCategoria;
        int numInscPequeno = 0;
        int numInscMedio = 0;
        int numInscAvancado = 0;

        do{
            System.out.println("--------Menu---------");
            System.out.println("Escolha uma das opcoes abaixo: \n" +
                    "1) Inscrever um novo participante em uma categoria.\n"+
                    "2) Exibir todos os inscritos de uma categoria.\n"+
                    "3) Cancelar a inscricao de um participante de uma categoria.\n"+
                    "4) Sair.\n" +
                    ""
            );

            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite o RG do participante: ");
                    RG = sc.next();

                    System.out.println("Digite o primeiro nome do participante: ");
                    nome = sc.next();

                    System.out.println("Digite o sobrenome nome do participante: ");
                    sobrenome = sc.next();

                    System.out.println("Digite a idade do participante: ");
                    idade = sc.nextInt();

                    System.out.println("Digite o celular do participante: ");
                    cel = sc.next();

                    System.out.println("Digite o celular de emergencia do participante: ");
                    celEmg = sc.next();

                    System.out.println("Digite o tipo sanguineo do participante: ");
                    tpSng = sc.next();



                    do {
                        System.out.println("Digite a categoria que o participante deseja se inscrever (pequeno/medio/avancado): ");
                        categoria = sc.next();

                        if (categoria.equals("pequeno")|| categoria.equals("medio") || categoria.equals("avancado")) {
                            if(categoria.equals("avancado") && idade < 18){
                                System.out.println("Categoria invalida. Tente outra vez");
                            }
                            else{
                                validaCategoria = 1;
                            }
                        } else {
                            System.out.println("Categoria invalida. Tente outra vez!");
                        }
                    }while (validaCategoria == 0);

                    switch (categoria){
                        case "pequeno":
                            numInscPequeno += 1;
                            listInscPequeno.add(new Inscritos(numInscPequeno, RG, nome, sobrenome, idade, cel, celEmg, tpSng, categoria));
                            break;

                        case "medio":
                            numInscMedio += 1;
                            inscrito.setNumInsc(numInscMedio);
                            listInscMedio.add(new Inscritos(numInscMedio, RG, nome, sobrenome, idade, cel, celEmg, tpSng, categoria));
                            break;

                        case "avancado":
                            numInscAvancado += 1;
                            inscrito.setNumInsc(numInscAvancado);
                            listInscAvancado.add(new Inscritos(numInscAvancado, RG, nome, sobrenome, idade, cel, celEmg, tpSng, categoria));
                            break;
                    }
                break;

                case 2:

                    validaCategoria = 0;

                    do {
                        System.out.println("Deseja exibir a lista de qual categoria (pequeno/medio/avancado)? ");
                        opcaoCategoria = sc.next();

                        if (opcaoCategoria.equals("pequeno") || opcaoCategoria.equals("medio") || opcaoCategoria.equals("avancado")) {
                            validaCategoria = 1;
                        } else {
                            System.out.println("Categoria invalida. Tente outra vez!");
                        }
                    }while (validaCategoria == 0);

                    switch(opcaoCategoria){
                        case "pequeno":
                            System.out.println("*Lista de inscritos na categoria pequeno*");
                            for (Inscritos lista: listInscPequeno) {
                                System.out.println(lista);
                            }
                        break;

                        case "medio":
                            System.out.println("*Lista de inscritos na categoria avancado*");
                            for (Inscritos lista: listInscMedio) {
                                System.out.println(lista);
                            }
                        break;

                        case "avancado":
                            System.out.println("*Lista de inscritos na categoria avancado*");
                            for (Inscritos lista: listInscAvancado) {
                                System.out.println(lista);
                            }
                        break;
                    };
                break;
            }

        } while (opcao != 4);

        sc.close();
    }
}
