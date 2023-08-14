import java.util.Scanner;

public class ejercicio3_matriz {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresar n");
        int n= scanner.nextInt();
        int[][] matriz1 = new int[n][n];
        int[] matriz2 = new int[n*n];
        for (int i=0; i<n; i++){
            for (int j=0;j<n;j++){
                matriz1 [i][j] = (int)(Math.random()*10);
                matriz2 [i*n+j] =  matriz1 [i][j];
                System.out.print(matriz1 [i][j] +" " );
            }
            System.out.println(" ");
        }



        for (int k=0; k< n*n; k++){
            System.out.print(matriz2[k] +" " );
        }



    }
}
