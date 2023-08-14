public class ejercicio4_matriz {
    public static void main(String[] args){
        int[][] matriz1 = new int[11][11];
        for (int i=0; i<=10; i++){
            for (int j=0; j<=10; j++){
                if (i==0 && j==0){
                    matriz1 [i][j] = 0;
                }
                else{
                    if ((i>=1 && j>=1) && (i==j || i!=j)) {
                        matriz1[i][j] = i * j;
                    }
                }
                if (j==1 && i!=j){
                    matriz1 [i][j]= i;
                }
                if (i==1 && i!=j){
                    matriz1 [i][j]= j;
                }
                System.out.print(matriz1 [i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
