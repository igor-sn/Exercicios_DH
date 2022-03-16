import java.util.Arrays;

public class Program {

    public static void main(String[] args) {

        String cidades[] = {"Londres", "Madrid", "Nueva York", "Buenos Aires", "Asunción", "São Paulo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"};
        int[][] temps = {{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};
        int posicaomin = 0;
        int posicaomax = 0;

        System.out.println(Arrays.deepToString(temps));

        for(int i = 1; i<cidades.length; i++){


            if(temps[i][0] < temps [posicaomin][0]){
                posicaomin = i;
            }
            else if(temps[i][1] > temps [posicaomax][1]){
                posicaomax = i;
            }
        }
        System.out.println("A temperatura registrada mais alta foi de " + temps[posicaomax][1] +"º C em " + cidades[posicaomax]);
        System.out.println("A temperatura registrada mais baixa foi de " + temps[posicaomin][0] +"º C em " + cidades[posicaomin]);
    }
}
