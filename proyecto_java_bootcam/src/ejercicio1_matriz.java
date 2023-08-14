import java.util.Scanner;
public class ejercicio1_matriz {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresar nxn");
        int n = scanner.nextInt();
        int[][] matriz = new int[n][n];

        for (int i=0; i<=n-1; i++){
            for (int j=0;j<=n-1;j++){
                matriz [i][j] = (int)(Math.random()*10);
                System.out.print(matriz [i][j]+ " ");
            }
            System.out.println(" ");
        }
    }
}
