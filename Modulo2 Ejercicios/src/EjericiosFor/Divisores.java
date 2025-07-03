package EjericiosFor;
import java.util.Scanner;
import java.util.ArrayList;
public class Divisores {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el numero al que desea saber sus divisores");
        int num = sc.nextInt();
        ArrayList<Integer> divisores= new ArrayList<>();

        for (int i = 1; i <= num; i++){
            if(num % i == 0){
                divisores.add(i);

            }
        }
        System.out.println("Los divisaores de " + num + " son" + " " + divisores);

    }
}
