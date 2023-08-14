import javax.sound.sampled.Line;
import java.util.Scanner;

public class romanos {
    public static  void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese numero");
        int n = scanner.nextInt();
        String romano = "";
        if (n > 0 && n <= 3 ){
            for (int i=1; i<=n; i++){
                romano += 'I';
            }
            System.out.println(romano);
        }else if (n==4){
            romano += "IV";
            System.out.println(romano);
        }else if (n>=5 && n<=8){
            romano += "V";
            for (int i=1; i<=n-5; i++){
                romano += 'I';
            }
            System.out.println(romano);
        }else if (n==9){
            romano += "IX";
            System.out.println(romano);
        }else if (n>=10 && n<=13 ){
            romano += "X";
            for (int i=1; i<=n-10; i++){
                romano += 'I';
            }
            System.out.println(romano);
        }else if (n==19){
            romano += "IX";
            System.out.println(romano);
        } else if (n>= 20 && n<= 23){
            romano += "XX";
            for (int i=1; i<=n-20; i++){
                romano += 'I';
            }
            System.out.println(romano);
        }
    }
}
