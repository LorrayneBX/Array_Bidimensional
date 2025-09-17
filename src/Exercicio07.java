import java.util.Random;

public class Exercicio07 {
    public static void main(String[] args) {
        Random randow = new Random();
        int ordem = randow.nextInt(2,5);
        int [][] matriz = new int[ordem][ordem];
        int aux, k;

        //gerar e imprimir a matriz
        System.out.println("Valores originais");
        for (int i =0; i< matriz.length; i++){
            for (int j = 0; j < matriz.length; j++ ){
                matriz[i][j] = randow.nextInt(3,20);
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        //trocar os elementos
        k = ordem - 1;
        for (int i = 0; i< ordem; i++){
            aux = matriz[i][i];
            matriz[i][i] = matriz[i][k];
            matriz[i][k] = aux;
            k--;
        }
        //imprimir a matriz
        System.out.println("\nImpressão após a troca dos elementos");
        for (int i =0; i< matriz.length; i++){
            for (int j = 0; j < matriz.length; j++ ){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
