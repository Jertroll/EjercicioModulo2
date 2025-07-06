package EjericiosFor;
import java.util.Scanner;
public class NumeroPerfecto {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite el numero al que desea saber si numero perfecto");
        int num = sc.nextInt();

        int numAux = 0;
        for(int i = 1; i < num; i++){
            if(num % i == 0){

                System.out.println(numAux = numAux + i);

            }
        }
        if(numAux == num){
            System.out.println(num + " Si es un numero perfecto");
        } else {
            System.out.println(num + " No es un numero perfecto, va jalando");
        }
    }
}
