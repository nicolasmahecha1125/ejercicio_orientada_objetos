import java.util.Scanner;

public class ejercicio2_matriz {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresar n");
        int n= scanner.nextInt();
        int[][] matriz1 = new int[10][10];
        int[][] matriz2 = new int[10][10];

        for (int i=0; i<=n-1; i++){
            for (int j=0;j<=0;j++){
                matriz1 [i][j] = (int)(Math.random()*10);
                matriz2 [i][j] = (int)(Math.random()*10);
                int resultado = matriz1 [i][j] + matriz2 [i][j];
                System.out.print(matriz1 [i][j]+ " + "+ matriz2 [i][j]+" = " + resultado );
            }
            System.out.println(" ");
        }
    }
}
