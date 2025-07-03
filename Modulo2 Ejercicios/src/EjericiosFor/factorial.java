package EjericiosFor;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digita el num al que deseas conocer su factorial");
        int num = sc.nextInt();

        int factorial = 1;
        for(int i = num; i > 0; i--){

            factorial = factorial * i;


        }
        System.out.println("El factorial de " + num + " es: " + factorial);
    }
}
