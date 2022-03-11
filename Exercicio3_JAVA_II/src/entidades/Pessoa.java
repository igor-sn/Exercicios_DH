package entidades;

public class Pessoa {

    private String nome;
    private Integer idade;
    private String id;
    private Double peso;
    private Double altura;

    public Pessoa(){

    }

    public Pessoa(String nome, Integer idade, String id) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
    }

    public Pessoa(String nome, Integer idade, String id, Double peso, Double altura) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC(){

        double imc = 0;

        if(peso/(Math.pow(altura, 2)) < 20){
            return -1;
        }
        else if(peso/(Math.pow(altura, 2)) <= 25){
            return 0;
        }
        else {
            return 1;
        }
    }

    public boolean ehMaiorIdade(){

        if (idade >= 18){
            return true;
        }
        else{
            return false;
        }

    }

    public String nivelPeso(){
        switch(calcularIMC()){
            case -1:
                return "Abaixo do peso";

            case 0:
                return "Peso saudavel";

            case 1:
                return "Sobrepeso";

            default:
                return "IMC invalido!";
        }

    }

    @Override
    public String toString(){
        return "ID: " + id + " | Nome: " + nome + " | Idade: " + idade +  " | Peso: " + peso + " | Altura: " + altura + " | IMC: " + calcularIMC() + " | Nivel: " + nivelPeso();

    }



}
