import java.util.HashMap;
import java.util.Scanner;

public class romanos2 {
    public static  void main(String[] args) {
        HashMap<Character, Integer> valorRomano = new HashMap<>();
        valorRomano.put('I', 1);
        valorRomano.put('V', 5);
        valorRomano.put('X', 10);
        valorRomano.put('L', 50);
        valorRomano.put('C', 100);
        valorRomano.put('D', 500);
        valorRomano.put('M', 1000);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número romano: ");
        String romanNum = scanner.nextLine();

        int resultado = 0;
        int valorPrevio = 0;

        for (int i = romanNum.length() - 1; i >= 0; i--) {
            char valorRoman = romanNum.charAt(i);
            int valorActual = valorRomano.get(valorRoman);

            if (valorActual < valorPrevio) {
                resultado -= valorActual;
            } else {
                resultado += valorActual;
            }

            valorPrevio = valorActual;
        }

        System.out.println("El número en entero es: " + resultado);
        System.out.println("El número en romano es: " + romanNum);
    }
}






