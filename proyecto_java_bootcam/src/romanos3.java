import java.util.Scanner;

public class romanos3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número romano: ");
        String romanNum = scanner.nextLine();

        int resultado = 0; // guarda el resultado
        int valorPrevio = 0;

        for (int i = romanNum.length() - 1; i >= 0; i--) {
            char romanActual = romanNum.charAt(i);
            int valorActual = 0;

            if (romanActual == 'I') {
                valorActual = 1;
            } else if (romanActual == 'V') {
                valorActual = 5;
            } else if (romanActual == 'X') {
                valorActual = 10;
            } else if (romanActual == 'L') {
                valorActual = 50;
            } else if (romanActual == 'C') {
                valorActual = 100;
            } else if (romanActual == 'D') {
                valorActual = 500;
            } else if (romanActual == 'M') {
                valorActual = 1000;
            }

            if (valorActual < valorPrevio ) {
                resultado -= valorActual;
            } else {
                resultado += valorActual;
            }

            valorPrevio = valorActual;
        }

        System.out.println("El número en entero es: " + resultado);
    }
}

