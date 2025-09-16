import java.util.Random;

public class Exercicio001 {
    public static void main(String[] args) {
        Random random = new Random();
        //primeiro [] linha e o segundo [] coluna
        int[][] matriz = new int[4][4];
        int dp = 0, ds = 0;

        for (int i =0; i< matriz.length;i++){
            for (int j =0; j< matriz[i].length; j++){
                matriz[i][j] = random.nextInt(1,5);
                System.out.print(matriz[i][j] + "\t");

                //verifica se o valor está na diagonal principal
                if (i==j){
                    dp += matriz[i][j];
                }
                //verifica se o valor está na diagonal secundária
                if (i+j == matriz.length-1){
                    ds += matriz[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("sona dos elementos da diagonal principal = " + dp);
        System.out.println("sona dos elementos da diagonal secundaria = " + ds);



    }
}
