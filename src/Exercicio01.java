import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] m = new int[3][3];

        //ler os dados da matriz
        for (int i=0; i < m.length; i++){
            for (int j =0; j < m[i].length; j++){
                System.out.print("Valor --> ");
                m[i][j] = sc.nextInt();
            }
        }

        //imprimir os dados da matriz
        for (int i=0; i<m.length;i++){
            for (int j=0;j<m[i].length;j++){
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
